package ru.burmistrov.tm.api.repository;


import org.apache.ibatis.annotations.*;
import org.jetbrains.annotations.NotNull;
import ru.burmistrov.tm.entity.Project;
import ru.burmistrov.tm.entity.enumerated.Status;

import java.util.Date;
import java.util.List;

public interface IProjectRepository {

    @NotNull String persist = "INSERT INTO tm.app_project " +
            "(id, dateBegin, dateEnd, description, name, user_id, status)" +
            " VALUES (#{id}, #{dateBegin}, #{dateEnd}, #{description}, #{name}, #{userId}, #{status})";

    @NotNull String merge = "UPDATE tm.app_project SET name = #{name}, description = #{description}," +
            " dateBegin = #{dateBegin}, dateEnd = #{dateEnd} WHERE id = #{id}";

    @NotNull String deleteById = "DELETE from tm.app_project WHERE id = #{id} AND user_id = #{userId}";

    @NotNull String deleteAllByUserId = "DELETE from tm.app_project WHERE user_id = #{userId}";

    @NotNull String findAllByUserId = "SELECT * FROM tm.app_project WHERE user_id = #{userId}";

    @NotNull String findOneById = "SELECT * FROM tm.app_project WHERE id = #{id} AND user_id = #{userId}";

    @NotNull String findOneByName = "SELECT * FROM tm.app_project WHERE user_id = #{userId} AND name = #{name}";

    @NotNull String findOneByDescription = "SELECT * FROM tm.app_project WHERE user_id = #{userId} AND description = #{description}";

    @Insert(persist)
    void persist(@NotNull @Param("id") final String id, @NotNull @Param("userId") final String userId,
                 @NotNull @Param("dateBegin") final Date dateBegin, @NotNull @Param("dateEnd") final Date dateEnd,
                 @NotNull @Param("description") final String description, @NotNull @Param("name") final String name,
                 @NotNull @Param("status") final Status status);

    @Update(merge)
    void merge(@NotNull final Project project);

    @Delete(deleteById)
    void remove(@NotNull @Param("userId") final String userId, @NotNull @Param("id") final String id);

    @Delete(deleteAllByUserId)
    void removeAll(@NotNull @Param("userId") final String userId);

    @Select(findAllByUserId)
    List<Project> findAll(@NotNull @Param("userId") final String userId);

    @Select(findOneById)
    Project findOne(@NotNull @Param("id") final String id, @NotNull @Param("userId") final String userId);

    @Select(findOneByName)
    Project findOneByName(@NotNull @Param("userId") final String userId, @NotNull @Param("name") final String name);

    @Select(findOneByDescription)
    Project findOneByDescription(@NotNull @Param("userId") final String userId, @NotNull @Param("description") final String description);


}
