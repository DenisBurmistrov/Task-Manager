package ru.burmistrov.tm.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.burmistrov.tm.api.repository.IUserRepository;
import ru.burmistrov.tm.api.service.IUserService;
import ru.burmistrov.tm.entity.AbstractEntity;
import ru.burmistrov.tm.entity.Role;
import ru.burmistrov.tm.entity.User;

public final class UserService implements IUserService {

    @NotNull
    private final IUserRepository userRepository;

    public UserService(@NotNull IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Nullable
    public User logIn(@NotNull String login, @NotNull String password) {
        return userRepository.logIn(login, password);
    }

    @Override
    public void merge(@NotNull String userId, @NotNull String firstName, @NotNull String middleName, @NotNull String lastName, @NotNull String email,
                      @NotNull Role role) {
        @NotNull final User currentUser = new User();
        currentUser.setFirstName(firstName);
        currentUser.setMiddleName(middleName);
        currentUser.setLastName(lastName);
        currentUser.setEmail(email);
        currentUser.setId(userId);
        currentUser.setRole(role);
        AbstractEntity abstractEntity = userRepository.findOne(currentUser);
        if(abstractEntity != null)
            userRepository.merge(currentUser);
    }


}