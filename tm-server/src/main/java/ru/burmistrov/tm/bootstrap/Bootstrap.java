package ru.burmistrov.tm.bootstrap;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import ru.burmistrov.tm.api.loader.ServiceLocator;
import ru.burmistrov.tm.api.service.*;
import ru.burmistrov.tm.endpoint.*;
import ru.burmistrov.tm.service.*;
import ru.burmistrov.tm.utils.EntityManagerFactoryUtil;

import javax.persistence.EntityManagerFactory;
import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.util.Properties;

@Getter
@Setter
public final class Bootstrap implements ServiceLocator {

    @NotNull private final PropertyService propertyService = new PropertyService();

    @NotNull private final EntityManagerFactory entityManagerFactory = EntityManagerFactoryUtil.getEntityManagerFactory();

    @NotNull private final IProjectService projectService = new ProjectService(entityManagerFactory);

    @NotNull private final ITaskService taskService = new TaskService(entityManagerFactory);

    @NotNull private final IUserService userService = new UserService(entityManagerFactory);

    @NotNull private final ISessionService sessionService = new SessionService(entityManagerFactory);

    @NotNull private final IAdminService adminService = new AdminService(projectService, taskService, entityManagerFactory);

    public Bootstrap() throws IOException {
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




