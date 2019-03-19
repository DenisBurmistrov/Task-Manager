package ru.burmistrov.tm.command.project;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.burmistrov.tm.command.AbstractCommand;
import ru.burmistrov.tm.endpoint.Project;

import java.util.Objects;

public class ProjectFindByNameCommand extends AbstractCommand {
    @NotNull
    @Override
    public String getName() {
        return "-printProjectByName";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Print project by name";
    }

    @Override
    public void execute() {
        System.out.println("Введите имя проекта:");
        @NotNull final String name = getServiceLocator().getTerminalCommandService().nextLine();
        System.out.println("Проект:");
        @Nullable final Project project = getServiceLocator().getProjectEndpoint().findProjectByName(Objects.requireNonNull(getServiceLocator().getSession().getUserId()) , name);
        System.out.println(project);
    }

    @Override
    public boolean isSecure() {
        return true;
    }
}
