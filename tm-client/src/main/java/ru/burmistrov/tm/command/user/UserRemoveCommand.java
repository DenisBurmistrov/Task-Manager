package ru.burmistrov.tm.command.user;

import org.jetbrains.annotations.NotNull;
import ru.burmistrov.tm.command.AbstractCommand;

import java.util.Objects;

public class UserRemoveCommand extends AbstractCommand {

    public UserRemoveCommand() {
    }

    @NotNull
    @Override
    public String getName() {
        return "-removeUser";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Remove current user";
    }

    @Override
    public void execute() {
        getServiceLocator().getUserEndpoint().removeUserById(Objects.requireNonNull(getServiceLocator().getSession().getUserId()));
        getServiceLocator().setSession(null);
    }

    @Override
    public boolean isSecure() {
        return true;
    }
}
