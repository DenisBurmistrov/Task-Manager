package ru.burmistrov.tm.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.burmistrov.tm.api.repository.IProjectRepository;
import ru.burmistrov.tm.api.repository.ITaskRepository;
import ru.burmistrov.tm.api.repository.IUserRepository;
import ru.burmistrov.tm.api.service.IAdminService;
import ru.burmistrov.tm.api.service.IProjectService;
import ru.burmistrov.tm.api.service.ITaskService;
import ru.burmistrov.tm.entity.*;
import ru.burmistrov.tm.entity.enumerated.Role;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Objects;

public class AdminService implements IAdminService {

    private final IProjectService projectService;

    private final ITaskService taskService;

    private final IProjectRepository projectRepository;

    private final ITaskRepository taskRepository;

    private final IUserRepository userRepository;

    public AdminService(@NotNull final IProjectService projectService, @NotNull final ITaskService taskService, @NotNull final IProjectRepository projectRepository,
                        @NotNull final ITaskRepository taskRepository, @NotNull final IUserRepository userRepository) {
        this.projectService = projectService;
        this.taskService = taskService;
        this.projectRepository = projectRepository;
        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    public void saveDataByDefault(@NotNull final Session session) throws IOException, SQLException {

        @NotNull final ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("projects-and-tasks-by-admin.dat"));
        @NotNull final Domain domain = new Domain();

        domain.setProjects(projectService.findAll(Objects.requireNonNull(session.getUserId())));
        domain.setTasks(taskService.findAll(session.getUserId()));
        domain.setUsers(Objects.requireNonNull(userRepository.findAll()));
        oos.writeObject(domain);
    }


    public void saveDataByFasterXmlJson(@NotNull final Session session) throws IOException, SQLException {

        @NotNull final Domain domain = new Domain();
        domain.setProjects(projectService.findAll(Objects.requireNonNull(session.getUserId())));
        domain.setTasks(taskService.findAll(session.getUserId()));
        domain.setUsers(Objects.requireNonNull(userRepository.findAll()));

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.writeValue(new File("projects-and-tasks-by-admin.json"), domain);
    }

    public void saveDataByFasterXml(@NotNull final Session session) throws IOException, SQLException {

        @NotNull final Domain domain = new Domain();

        domain.setProjects(projectService.findAll(Objects.requireNonNull(session.getUserId())));
        domain.setTasks(taskService.findAll(session.getUserId()));
        domain.setUsers(Objects.requireNonNull(userRepository.findAll()));
        @NotNull final XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("projects-and-tasks-by-admin.xml"), domain);
    }

    public void saveDataByJaxbJson(@NotNull final Session session) throws JAXBException, IOException, SQLException {

        System.setProperty("javax.xml.bind.context.factory","org.eclipse.persistence.jaxb.JAXBContextFactory");
        @NotNull final Domain domain = new Domain();
        domain.setProjects(projectService.findAll(Objects.requireNonNull(session.getUserId())));
        domain.setTasks(taskService.findAll(session.getUserId()));
        domain.setUsers(Objects.requireNonNull(userRepository.findAll()));
        @NotNull final JAXBContext jaxbContext = JAXBContext.newInstance(Domain.class);
        @NotNull final Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty("eclipselink.media-type", "application/json");

        marshaller.marshal(domain,  new FileWriter("projects-and-tasks-by-admin.json"));
    }

    public void saveDataByJaxbXml(@NotNull final Session session) throws IOException, JAXBException, SQLException {

        @NotNull final Domain domain = new Domain();

        domain.setProjects(projectService.findAll(Objects.requireNonNull(session.getUserId())));
        domain.setTasks(taskService.findAll(session.getUserId()));
        domain.setUsers(Objects.requireNonNull(userRepository.findAll()));
        @NotNull final JAXBContext context = JAXBContext.newInstance(Domain.class);
        @NotNull final Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(domain, new FileWriter("projects-and-tasks-by-admin.xml"));
    }

    public void loadDataByDefault(@NotNull final Session session) throws IOException, ClassNotFoundException, NoSuchAlgorithmException, SQLException {

        @NotNull final FileInputStream fileInputStream = new FileInputStream("C:\\Users\\d.burmistrov\\IdeaProjects\\toDoList\\" + "projects-and-tasks-by-admin.dat");
        @NotNull final ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        @NotNull final Domain domain = (Domain) objectInputStream.readObject();

        for (@NotNull final Project project : domain.getProjects()) {
            projectRepository.persist(Objects.requireNonNull(project.getUserId()), project.getDateBegin(),
                    Objects.requireNonNull(project.getDateEnd()), Objects.requireNonNull(project.getDescription()),
                    Objects.requireNonNull(project.getName()));
        }
        for (@NotNull final Task task : domain.getTasks()) {
            taskRepository.persist(Objects.requireNonNull(task.getUserId()), task.getDateBegin(),
                    Objects.requireNonNull(task.getDateEnd()), Objects.requireNonNull(task.getDescription()),
                    Objects.requireNonNull(task.getName()), Objects.requireNonNull(task.getProjectId()));
        }
        for (@NotNull final User user : domain.getUsers()) {
            userRepository.persist(Objects.requireNonNull(user.getEmail()), Objects.requireNonNull(user.getFirstName()),
                    Objects.requireNonNull(user.getLastName()), Objects.requireNonNull(user.getLogin()),
                    Objects.requireNonNull(user.getMiddleName()), Objects.requireNonNull(user.getPassword()), String.valueOf(user.getRole()));
        }
    }

    public void loadDataByFasterXmlJson(@NotNull final Session session) throws IOException, NoSuchAlgorithmException, SQLException {

        @NotNull final File file = new File("projects-and-tasks-by-admin.json");
        @NotNull final ObjectMapper objectMapper = new ObjectMapper();
        @NotNull final Domain domain = objectMapper.readValue(file, Domain.class);

        for (@NotNull final Project project : domain.getProjects()) {
            projectRepository.persist(Objects.requireNonNull(project.getUserId()), project.getDateBegin(),
                    Objects.requireNonNull(project.getDateEnd()), Objects.requireNonNull(project.getDescription()),
                    Objects.requireNonNull(project.getName()));
        }
        for (@NotNull final Task task : domain.getTasks()) {
            taskRepository.persist(Objects.requireNonNull(task.getUserId()), task.getDateBegin(),
                    Objects.requireNonNull(task.getDateEnd()), Objects.requireNonNull(task.getDescription()),
                    Objects.requireNonNull(task.getName()), Objects.requireNonNull(task.getProjectId()));
        }
        for (@NotNull final User user : domain.getUsers()) {
            userRepository.persist(Objects.requireNonNull(user.getEmail()), Objects.requireNonNull(user.getFirstName()),
                    Objects.requireNonNull(user.getLastName()), Objects.requireNonNull(user.getLogin()),
                    Objects.requireNonNull(user.getMiddleName()), Objects.requireNonNull(user.getPassword()), String.valueOf(user.getRole()));
        }
    }

    public void loadDataByFasterXml(@NotNull final Session session) throws IOException, NoSuchAlgorithmException, SQLException {

        @NotNull final File file = new File("projects-and-tasks-by-admin.xml");
        @NotNull final XmlMapper xmlMapper = new XmlMapper();
        @NotNull final Domain domain = xmlMapper.readValue(file, Domain.class);

        for (@NotNull final Project project : domain.getProjects()) {
            projectRepository.persist(Objects.requireNonNull(project.getUserId()), project.getDateBegin(),
                    Objects.requireNonNull(project.getDateEnd()), Objects.requireNonNull(project.getDescription()),
                    Objects.requireNonNull(project.getName()));
        }
        for (@NotNull final Task task : domain.getTasks()) {
            taskRepository.persist(Objects.requireNonNull(task.getUserId()), task.getDateBegin(),
                    Objects.requireNonNull(task.getDateEnd()), Objects.requireNonNull(task.getDescription()),
                    Objects.requireNonNull(task.getName()), Objects.requireNonNull(task.getProjectId()));
        }
        for (@NotNull final User user : domain.getUsers()) {
            userRepository.persist(Objects.requireNonNull(user.getEmail()), Objects.requireNonNull(user.getFirstName()),
                    Objects.requireNonNull(user.getLastName()), Objects.requireNonNull(user.getLogin()),
                    Objects.requireNonNull(user.getMiddleName()), Objects.requireNonNull(user.getPassword()), String.valueOf(user.getRole()));
        }
    }

    public void loadDataByJaxbJson(@NotNull final Session session) throws JAXBException, IOException, NoSuchAlgorithmException, SQLException {

        System.setProperty("javax.xml.bind.context.factory", "org.eclipse.persistence.jaxb.JAXBContextFactory");

        @NotNull final JAXBContext jaxbContext = JAXBContext.newInstance(Domain.class);
        @NotNull final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
        unmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, true);
        @NotNull final Domain domain = (Domain) unmarshaller.unmarshal(new File("C:\\Users\\d.burmistrov\\IdeaProjects\\toDoList\\projects-and-tasks-by-admin.json"));

        for (@NotNull final Project project : domain.getProjects()) {
            projectRepository.persist(Objects.requireNonNull(project.getUserId()), project.getDateBegin(),
                    Objects.requireNonNull(project.getDateEnd()), Objects.requireNonNull(project.getDescription()),
                    Objects.requireNonNull(project.getName()));
        }
        for (@NotNull final Task task : domain.getTasks()) {
            taskRepository.persist(Objects.requireNonNull(task.getUserId()), task.getDateBegin(),
                    Objects.requireNonNull(task.getDateEnd()), Objects.requireNonNull(task.getDescription()),
                    Objects.requireNonNull(task.getName()), Objects.requireNonNull(task.getProjectId()));
        }
        for (@NotNull final User user : domain.getUsers()) {
            userRepository.persist(Objects.requireNonNull(user.getEmail()), Objects.requireNonNull(user.getFirstName()),
                    Objects.requireNonNull(user.getLastName()), Objects.requireNonNull(user.getLogin()),
                    Objects.requireNonNull(user.getMiddleName()), Objects.requireNonNull(user.getPassword()), String.valueOf(user.getRole()));
        }
    }

    public void loadDataByJaxbXml(@NotNull final Session session) throws JAXBException, IOException, NoSuchAlgorithmException, SQLException {

        @NotNull final File file = new File("projects-and-tasks-by-admin.xml");
        @NotNull final JAXBContext jaxbContext = JAXBContext.newInstance(Domain.class);
        @NotNull final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        @NotNull final Domain domain = (Domain) unmarshaller.unmarshal(file);

        for (@NotNull final Project project : domain.getProjects()) {
            projectRepository.persist(Objects.requireNonNull(project.getUserId()), project.getDateBegin(),
                    Objects.requireNonNull(project.getDateEnd()), Objects.requireNonNull(project.getDescription()),
                    Objects.requireNonNull(project.getName()));
        }
        for (@NotNull final Task task : domain.getTasks()) {
            taskRepository.persist(Objects.requireNonNull(task.getUserId()), task.getDateBegin(),
                    Objects.requireNonNull(task.getDateEnd()), Objects.requireNonNull(task.getDescription()),
                    Objects.requireNonNull(task.getName()), Objects.requireNonNull(task.getProjectId()));
        }
        for (@NotNull final User user : domain.getUsers()) {
            userRepository.persist(Objects.requireNonNull(user.getEmail()), Objects.requireNonNull(user.getFirstName()),
                    Objects.requireNonNull(user.getLastName()), Objects.requireNonNull(user.getLogin()),
                    Objects.requireNonNull(user.getMiddleName()), Objects.requireNonNull(user.getPassword()), String.valueOf(user.getRole()));
        }
    }

    @Override
    @Nullable
    public User createUser(@NotNull final String login, @NotNull final String password, @NotNull final String firstName,
                           @NotNull final String middleName, final @NotNull String lastName, final @NotNull String email,
                           @Nullable Role roleType) throws NoSuchAlgorithmException, IOException, SQLException {

        @Nullable final User abstractEntity = userRepository.findOneByLogin(login);
        if(abstractEntity == null)
            return userRepository.persist(email, firstName, lastName, login,
                    middleName, password, Objects.requireNonNull(roleType).toString());

        return null;
    }

    @Override
    public void updatePassword(@NotNull final String login, @NotNull final String password) throws NoSuchAlgorithmException, SQLException {
        if (password.length() > 0) {
            userRepository.updatePassword(login, password);
        }
    }

    @Override
    public void updateUserById(@NotNull final String userId,  @NotNull final String firstName, @NotNull final String middleName,
                               @NotNull final String lastName, final @NotNull String email,final @NotNull Role role) throws SQLException {
        @NotNull final User currentUser = new User();
        currentUser.setFirstName(firstName);
        currentUser.setMiddleName(middleName);
        currentUser.setLastName(lastName);
        currentUser.setEmail(email);
        currentUser.setId(userId);
        currentUser.setRole(role);
        @Nullable final AbstractEntity abstractEntity = userRepository.findOne(userId);
        if(abstractEntity != null)
            userRepository.merge(currentUser);
    }

    @Override
    public void removeUserById(@NotNull final String userId) throws SQLException {
        userRepository.remove(userId);
    }

    @Override
    public void removeAllUsers() throws SQLException {
        userRepository.removeAll();
    }

}
