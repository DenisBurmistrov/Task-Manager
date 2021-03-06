package ru.burmistrov.tm.command.task;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.burmistrov.tm.api.loader.ServiceLocator;
import ru.burmistrov.tm.command.AbstractCommand;
import ru.burmistrov.tm.endpoint.Exception_Exception;
import ru.burmistrov.tm.endpoint.Session;
import ru.burmistrov.tm.endpoint.TaskEndpoint;
import ru.burmistrov.tm.service.TerminalCommandService;

import java.util.Objects;

@Component
public final class TaskUpdateCommand extends AbstractCommand {

    @Autowired
    private ServiceLocator serviceLocator;

    @Autowired
    private TaskEndpoint taskEndpoint;

    @NotNull
    @Override
    public String getName() {
        return "-updateTask";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Update task by project ID by task ID";
    }

    @Override
    public void execute() throws Exception_Exception {
        System.out.println("Введите ID проекта:");
        @NotNull final String projectId = serviceLocator.getTerminalCommandService().nextLine();
        System.out.println("Введите ID задачи:");
        @NotNull final String taskId = serviceLocator.getTerminalCommandService().nextLine();
        System.out.println("Введите новое имя:");
        @NotNull final String newName = serviceLocator.getTerminalCommandService().nextLine();
        System.out.println("Введите новое описание: ");
        @NotNull final String description = serviceLocator.getTerminalCommandService().nextLine();
        System.out.println("Введите новую дату окончания (Пример: 27.10.2019):");
        @NotNull final String date = serviceLocator.getTerminalCommandService().nextLine();
        System.out.println("Введите новый статус(Запланировано || В процессе || Готово):");
        @NotNull final String status = serviceLocator.getTerminalCommandService().nextLine();
        taskEndpoint.updateTaskById(serviceLocator.getSession(),
                Objects.requireNonNull(serviceLocator.getSession()).getUserId(), projectId, taskId, newName, description, date, status);
    }

    @Override
    public boolean isSecure() {
        return true;
    }
}
