package ru.burmistrov.tm.api.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.burmistrov.tm.entity.AbstractEntity;
import ru.burmistrov.tm.entity.Role;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IUserService<T extends AbstractEntity> {

    @WebMethod
    @Nullable
    T logIn(@WebParam @NotNull String login, @WebParam @NotNull String auth);

    @WebMethod
    @Nullable
    T createUser(@WebParam @NotNull String login, @WebParam @NotNull String password, @WebParam @NotNull String firstName,
                 @WebParam @NotNull String middleName, @WebParam @NotNull String lastName, @WebParam @NotNull String email,
                 @WebParam @NotNull Role roleType);

    @WebMethod
    void updatePasswordById(@WebParam @NotNull String userId, @WebParam @NotNull String login, @WebParam @NotNull String password);

    @WebMethod
    void updateUserById(@WebParam @NotNull String userId, @WebParam @NotNull String firstName, @WebParam @NotNull String middleName,
                        @WebParam @NotNull String lastName, @WebParam @NotNull String email, @WebParam @NotNull Role role,
                        @WebParam @NotNull String login);

    @WebMethod
    void removeUserById(@WebParam @NotNull String userId);

    @WebMethod
    void removeAllUsers(@WebParam @NotNull String userId);

}
