package ru.burmistrov.tm.command.user;

import ru.burmistrov.tm.api.loader.ServiceLocator;
import ru.burmistrov.tm.command.AbstractCommand;

public final class UserShowCurrentUser extends AbstractCommand {

    public UserShowCurrentUser() {
    }

    @Override
    public String getName() {
        return "-showCurrentUser";
    }

    @Override
    public String getDescription() {
        return "Print info about current user";
    }

    @Override
    public void execute() {
        if (getServiceLocator() != null) {
            System.out.println(getServiceLocator().getCurrentUser().toString());
        }
    }

    @Override
    public boolean isSecure() {
        return true;
    }
}
