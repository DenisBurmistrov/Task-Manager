package ru.burmistrov.tm.api.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.burmistrov.tm.entity.*;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public interface IAdminService {

    void saveDataByDefault(@NotNull Session session) throws IOException;

    void saveDataByFasterXmlJson(@NotNull Session session) throws IOException;

    void saveDataByFasterXml(@NotNull Session session) throws IOException;

    void saveDataByJaxbJson(@NotNull Session session) throws JAXBException, IOException;

    void saveDataByJaxbXml(@NotNull Session session) throws IOException, JAXBException;

    void loadDataByDefault(@NotNull Session session) throws IOException, ClassNotFoundException;

    void loadDataByFasterXmlJson(@NotNull Session session) throws IOException;

    void loadDataByFasterXml(@NotNull Session session) throws IOException;

    void loadDataByJaxbJson(@NotNull Session session) throws JAXBException;

    void loadDataByJaxbXml(@NotNull Session session) throws JAXBException;

    @Nullable
    User persist(@NotNull String login, @NotNull String password, @NotNull String firstName, @NotNull String middleName, @NotNull String lastName,
                 @NotNull String email, @Nullable Role roleType);

    void updatePassword(@NotNull String userId, @NotNull String login, @NotNull String password);

    void merge(@NotNull String userId, @NotNull String firstName, @NotNull String middleName, @NotNull String lastName, @NotNull String email,
               @NotNull Role role);

    void remove(@NotNull String userId);

    void removeAll(@NotNull String userId);

}
