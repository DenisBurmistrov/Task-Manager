package ru.burmistrov.tm.mapper;

import org.apache.ibatis.annotations.*;
import org.jetbrains.annotations.NotNull;
import ru.burmistrov.tm.entity.Task;
import ru.burmistrov.tm.entity.User;
import ru.burmistrov.tm.utils.PasswordUtil;

import java.util.Date;
import java.util.List;

public interface IUserMapper {

    @NotNull
    String persist = "INSERT INTO tm.app_user " +
            "(id, email, firstName, lastName, login, middleName, passwordHash, role) VALUES (#{id}, #{email}, #{firstName}, #{lastName}, #{login}, #{middleName}, #{passwordHash}, #{role})";

    @NotNull String merge = "UPDATE tm.app_task SET firstName = #{firstName}, lastName = #{lastName}," +
            " middleName = #{middleName}, email = #{email} WHERE id = #{id} ";

    @NotNull String deleteById = "DELETE from tm.app_user WHERE id = #{id}";

    @NotNull String deleteAll = "DELETE from tm.app_user";

    @NotNull String findAll = "SELECT * FROM tm.app_user";

    @NotNull String updatePasswordByLogin = "UPDATE tm.app_user SET " +
            "passwordHash = #{passwordHash}, login = #{login}";

    @NotNull String findOneById = "SELECT * FROM tm.app_user WHERE id = #{id}";

    @NotNull String findOneByLogin = "SELECT * FROM tm.app_user WHERE login = #{login}";


    @Insert(persist)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "email", column = "email"),
            @Result(property = "firstName", column = "firstName"),
            @Result(property = "lastName", column = "lastName"),
            @Result(property = "login", column = "login"),
            @Result(property = "middleName", column = "middleName"),
            @Result(property = "passwordHash", column = "passwordHash"),
            @Result(property = "role", column = "role")
    })
    Task persist(@NotNull @Param("id") final String id, @NotNull @Param("email") final String email,
                 @NotNull @Param("firstName") final String firstName, @NotNull @Param("lastName") final String lastName,
                 @NotNull @Param("login") final String login, @NotNull @Param("middleName") final String middleName,
                 @NotNull @Param("passwordHash") final String passwordHash, @NotNull @Param("role") final String role);

    @Update(merge)
    void merge(@NotNull final User user);

    @Delete(deleteById)
    int remove(@NotNull @Param("id") final String id);

    @Delete(deleteAll)
    void removeAll();

    @Select(findAll)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "email", column = "email"),
            @Result(property = "firstName", column = "firstName"),
            @Result(property = "lastName", column = "lastName"),
            @Result(property = "login", column = "login"),
            @Result(property = "middleName", column = "middleName"),
            @Result(property = "passwordHash", column = "passwordHash"),
            @Result(property = "role", column = "role")
    })
    List<Task> findAll(@NotNull final String userId);


    @Select(findOneById)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "email", column = "email"),
            @Result(property = "firstName", column = "firstName"),
            @Result(property = "lastName", column = "lastName"),
            @Result(property = "login", column = "login"),
            @Result(property = "middleName", column = "middleName"),
            @Result(property = "passwordHash", column = "passwordHash"),
            @Result(property = "role", column = "role")})
    Task findOne(@NotNull final String id);

    @Select(findOneByLogin)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "email", column = "email"),
            @Result(property = "firstName", column = "firstName"),
            @Result(property = "lastName", column = "lastName"),
            @Result(property = "login", column = "login"),
            @Result(property = "middleName", column = "middleName"),
            @Result(property = "passwordHash", column = "passwordHash"),
            @Result(property = "role", column = "role")})
    Task findOneByLogin(@NotNull @Param("login") final String login);

    @Update(updatePasswordByLogin)
    void updatePassword(@NotNull final String login, @NotNull final String newPassword);

}
