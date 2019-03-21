package ru.burmistrov.tm.command.admin.user;

import org.jetbrains.annotations.NotNull;
import ru.burmistrov.tm.command.AbstractCommand;
import ru.burmistrov.tm.endpoint.CloneNotSupportedException_Exception;
import ru.burmistrov.tm.endpoint.Role;

import java.util.Objects;

public final class UserUpdateCurrentUser extends AbstractCommand {

    public UserUpdateCurrentUser() {
    }

    @NotNull
    @Override
    public String getName() {
        return "-updateCurrentUser";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Update all variables of current user";
    }

    @Override
    public void execute() throws CloneNotSupportedException_Exception {
        System.out.println("Введите новое имя:");
        @NotNull final String firstName = getServiceLocator().getTerminalCommandService().nextLine();
        System.out.println("Введите новую фамилию:");
        @NotNull final String lastName = getServiceLocator().getTerminalCommandService().nextLine();
        System.out.println("Введите новое отчество:");
        @NotNull final String middleName = getServiceLocator().getTerminalCommandService().nextLine();
        System.out.println("Введите новую почту:");
        @NotNull final String email = getServiceLocator().getTerminalCommandService().nextLine();
        getServiceLocator().getAdminEndpoint().updateUserById(getServiceLocator().getSession(), Objects.requireNonNull(getServiceLocator().getSession().getUserId()),
                firstName, middleName, lastName, email, Role.COMMON_USER);
    }

    @Override
    public boolean isSecure() {
        return false;
    }
}