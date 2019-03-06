package ru.burmistrov.tm.service;

import ru.burmistrov.tm.entity.Role;
import ru.burmistrov.tm.entity.User;
import ru.burmistrov.tm.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User logIn(String login, String auth) {
        return userRepository.logIn(login, auth);
    }

    public User registrate(String login, String password, String firstName, String middleName, String lastName, String email, Role roleType) {
        return userRepository.registrate(login, password, firstName, middleName, lastName, email, roleType);
    }

    public void updatePassword(User currentUser, String login, String password) {
        if (password.length() > 0) {
            userRepository.updatePassword(currentUser, login, password);
        }
    }

    public void updateCurrentUser(User currentUser, String firstName, String middleName, String lastName, String email) {
        if(firstName.length() == 0 && middleName.length() == 0 && lastName.length() == 0 && email.length() == 0)
        userRepository.updateCurrentUser(currentUser, firstName, middleName, lastName, email);
    }
}
