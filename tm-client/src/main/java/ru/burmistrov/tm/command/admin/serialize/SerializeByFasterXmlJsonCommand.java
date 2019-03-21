package ru.burmistrov.tm.command.admin.serialize;

import org.jetbrains.annotations.NotNull;
import ru.burmistrov.tm.command.AbstractCommand;
import ru.burmistrov.tm.endpoint.Exception_Exception;

public class SerializeByFasterXmlJsonCommand extends AbstractCommand {
    @NotNull
    @Override
    public String getName() {
        return "-serializeByFasterXmlJson";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Serialize all projects and tasks in Json";
    }

    @Override
    public void execute() throws Exception_Exception {

        getServiceLocator().getAdminEndpoint().saveDataByFasterXmlJson(getServiceLocator().getSession());
    }

    @Override
    public boolean isSecure() {
        return false;
    }
}
