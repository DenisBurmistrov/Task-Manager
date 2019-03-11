package ru.burmistrov.tm.command.user;

import ru.burmistrov.tm.api.loader.ServiceLocator;
import ru.burmistrov.tm.command.AbstractCommand;

public class UserRemoveCommand extends AbstractCommand {

    public UserRemoveCommand(ServiceLocator serviceLocator) {
        super(serviceLocator);
    }

    @Override
    public String getName() {
        return "-removeUser";
    }

    @Override
    public String getDescription() {
        return "Remove current user";
    }

    @Override
    public void execute() {
        getServiceLocator().getUserService().remove(getServiceLocator().getCurrentUser().getId());
        getServiceLocator().setCurrentUser(null);

    }

    @Override
    public boolean isSecure() {
        return true;
    }
}