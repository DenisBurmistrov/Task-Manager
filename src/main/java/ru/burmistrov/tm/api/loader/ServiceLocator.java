package ru.burmistrov.tm.api.loader;

import org.jetbrains.annotations.NotNull;
import ru.burmistrov.tm.api.service.IProjectService;
import ru.burmistrov.tm.api.service.ITaskService;
import ru.burmistrov.tm.api.service.IUserService;
import ru.burmistrov.tm.command.AbstractCommand;
import ru.burmistrov.tm.entity.AbstractEntity;
import ru.burmistrov.tm.entity.User;

import java.util.Map;
import java.util.Scanner;

public interface ServiceLocator {

    @NotNull
    IProjectService<AbstractEntity> getProjectService();

    @NotNull
    ITaskService<AbstractEntity> getTaskService();

    @NotNull
    IUserService<AbstractEntity> getUserService();

    @NotNull
    Map<String, AbstractCommand> getCommands();

    @NotNull
    Scanner getScanner();

    @NotNull
    User getCurrentUser();

    void setCurrentUser(@NotNull User user);
}
