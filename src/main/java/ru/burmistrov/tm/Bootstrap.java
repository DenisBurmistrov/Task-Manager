package ru.burmistrov.tm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.burmistrov.tm.api.loader.ServiceLocator;
import ru.burmistrov.tm.api.repository.IProjectRepository;
import ru.burmistrov.tm.api.repository.ITaskRepository;
import ru.burmistrov.tm.api.repository.IUserRepository;
import ru.burmistrov.tm.api.service.IProjectService;
import ru.burmistrov.tm.api.service.ITaskService;
import ru.burmistrov.tm.api.service.IUserService;
import ru.burmistrov.tm.command.AbstractCommand;
import ru.burmistrov.tm.command.system.PrintListCommand;
import ru.burmistrov.tm.command.project.*;
import ru.burmistrov.tm.command.system.PrintManifestCommand;
import ru.burmistrov.tm.command.task.*;
import ru.burmistrov.tm.command.user.*;
import ru.burmistrov.tm.entity.AbstractEntity;
import ru.burmistrov.tm.entity.Project;
import ru.burmistrov.tm.entity.Role;
import ru.burmistrov.tm.entity.User;
import ru.burmistrov.tm.repository.ProjectRepository;
import ru.burmistrov.tm.repository.TaskRepository;
import ru.burmistrov.tm.repository.UserRepository;
import ru.burmistrov.tm.service.ProjectService;
import ru.burmistrov.tm.service.TaskService;
import ru.burmistrov.tm.service.UserService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public final class Bootstrap implements ServiceLocator {

    private final Map<String, AbstractCommand> commands = new LinkedHashMap<>();

    private final IProjectRepository<AbstractEntity> projectRepository = new ProjectRepository();

    private final ITaskRepository<AbstractEntity> taskRepository = new TaskRepository();

    private final IUserRepository<AbstractEntity> userRepository = new UserRepository();

    private final IProjectService projectService = new ProjectService(projectRepository, taskRepository);

    private final ITaskService taskService = new TaskService(taskRepository);

    private final IUserService userService = new UserService(userRepository);

    private final Scanner scanner = new Scanner(System.in);

    private User currentUser;


    public void registry(ServiceLocator serviceLocator, Class ...classes) {
        for(Class commandClass : classes) {
            try {
                if(commandClass.getSuperclass().equals(AbstractCommand.class)) {
                    AbstractCommand abstractCommand = (AbstractCommand) commandClass.newInstance();
                    if (abstractCommand != null) {
                        abstractCommand.setServiceLocator(serviceLocator);
                        commands.put(abstractCommand.getName(), abstractCommand);
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void init(@NotNull Bootstrap bootstrap) {
        Class[] classes = new Class[]{ProjectClearCommand.class, ProjectCreateCommand.class, ProjectListCommand.class, ProjectRemoveCommand.class,
                ProjectUpdateCommand.class, PrintListCommand.class, TaskClearCommand.class, TaskCreateCommand.class, TaskListCommand.class, TaskRemoveCommand.class,
                TaskUpdateCommand.class, UserClearCommand.class, UserLogInCommand.class, UserLogOutCommand.class, UserRegistrateCommand.class, UserRemoveCommand.class,
                UserShowCurrentUser.class, UserUpdateCurrentUser.class, UserUpdatePasswordCommand.class};

        bootstrap.registry(bootstrap, classes);
        bootstrap.initProjectAndUser();

        start();
    }

    private void initProjectAndUser() {

        AbstractEntity admin = userService.persist("admin", "admin", "admin", "admin", "admin", "admin@admin", Role.ADMINISTRATOR);
        AbstractEntity commonUser = userService.persist("user", "user", "user", "user", "user", "user", Role.COMMON_USER);
        AbstractEntity project1 = projectService.persist(admin.getId(), "Первый проект", "Первое описание");
        AbstractEntity project2 = projectService.persist(admin.getId(), "Второй проект", "Второе описание");
        AbstractEntity project3 = projectService.persist(commonUser.getId(), "Третий проект", "Третье описание");
        AbstractEntity project4 = projectService.persist(commonUser.getId(), "Четвертый проект", "Четвертое описание");

        taskService.persist(admin.getId(), project1.getId(), "Первая задача", "Первое описание");
        taskService.persist(admin.getId(), project2.getId(), "Вторая задача", "Вторая описание");
        taskService.persist(commonUser.getId(), project3.getId(), "Третья задача", "Третье описание");
        taskService.persist(commonUser.getId(), project4.getId(), "Четвертая задача", "Четвертое описание");
    }

    private void execute(@Nullable String command) {
        if (command == null || command.isEmpty()) return;
        AbstractCommand abstractCommand = commands.get(command);
        if (abstractCommand == null) return;
        if (abstractCommand.isSecure()) {
            if (isAuth()) {
                abstractCommand.execute();
            }
            return;
        }
        abstractCommand.execute();
    }

    private void start() {
        System.out.println("    [ToDoList]\nВведите -logIn авторизоваться");
        while (true) {
            String input = scanner.nextLine();
            if ("-exit".equals(input)) {
                System.exit(0);
            }
            execute(input);
        }
    }

    public Map<String, AbstractCommand> getCommands() {
        return commands;
    }

    public IProjectRepository getProjectRepository() {
        return projectRepository;
    }

    public ITaskRepository getTaskRepository() {
        return taskRepository;
    }

    public IProjectService getProjectService() {
        return projectService;
    }

    public ITaskService getTaskService() {
        return taskService;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public IUserService getUserService() {
        return userService;
    }

    private boolean isAuth() {
        return currentUser != null;
    }
}




