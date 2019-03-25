package ru.burmistrov.tm.bootstrap;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.burmistrov.tm.api.loader.ServiceLocator;
import ru.burmistrov.tm.api.repository.IProjectRepository;
import ru.burmistrov.tm.api.repository.ISessionRepository;
import ru.burmistrov.tm.api.repository.ITaskRepository;
import ru.burmistrov.tm.api.repository.IUserRepository;
import ru.burmistrov.tm.api.service.*;
import ru.burmistrov.tm.endpoint.*;
import ru.burmistrov.tm.entity.*;
import ru.burmistrov.tm.entity.enumerated.Role;
import ru.burmistrov.tm.repository.ProjectRepository;
import ru.burmistrov.tm.repository.SessionRepository;
import ru.burmistrov.tm.repository.TaskRepository;
import ru.burmistrov.tm.repository.UserRepository;
import ru.burmistrov.tm.service.*;
import ru.burmistrov.tm.utils.ConnectionUtil;

import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Properties;

@Getter
@Setter
public final class Bootstrap implements ServiceLocator {



    @Nullable private Connection connection = ConnectionUtil.getConnection();

    @NotNull private final IProjectRepository projectRepository = new ProjectRepository(connection);

    @NotNull private final ITaskRepository taskRepository = new TaskRepository(connection);

    @NotNull private final IUserRepository userRepository = new UserRepository(connection);

    @NotNull private final ISessionRepository sessionRepository = new SessionRepository(connection);

    @NotNull private final IProjectService projectService = new ProjectService(projectRepository, taskRepository);

    @NotNull private final ITaskService taskService = new TaskService(taskRepository);

    @NotNull private final IUserService userService = new UserService(userRepository);

    @NotNull private final ISessionService sessionService = new SessionService(sessionRepository, userRepository);

    @NotNull private final IAdminService adminService = new AdminService(projectService, taskService, projectRepository, taskRepository, userRepository);

    public Bootstrap() throws SQLException, IOException {
    }


    private void initEndpoints() throws IOException {
        @NotNull final Properties property = new Properties();
        property.load(this.getClass().getClassLoader().getResourceAsStream("application.properties"));
        @NotNull final String host = property.getProperty("host");
        @NotNull final String port = property.getProperty("port");
        Endpoint.publish("http://" + host+":" + port + "/ProjectEndpoint", new ProjectEndpoint(this));
        Endpoint.publish("http://" + host+":" + port + "/TaskEndpoint", new TaskEndpoint(this));
        Endpoint.publish("http://" + host + ":" + port + "/UserEndpoint", new UserEndpoint(this));
        Endpoint.publish("http://" + host+":" + port + "/SessionEndpoint", new SessionEndpoint(this));
        Endpoint.publish("http://" + host + ":" + port + "/AdminEndpoint", new AdminEndpoint(this));
    }

    @Override
    public void init() throws IOException {
        initEndpoints();
    }


}




