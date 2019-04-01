package ru.burmistrov.tm.command.task;

import org.jetbrains.annotations.NotNull;
import ru.burmistrov.tm.api.loader.ServiceLocator;
import ru.burmistrov.tm.command.AbstractCommand;
import ru.burmistrov.tm.endpoint.Exception_Exception;
import ru.burmistrov.tm.endpoint.Session;
import ru.burmistrov.tm.endpoint.TaskEndpoint;
import ru.burmistrov.tm.service.TerminalCommandService;

import javax.inject.Inject;
import java.util.Objects;

public final class TaskCreateCommand extends AbstractCommand {

    @Inject
    private ServiceLocator serviceLocator;

    @NotNull
    @Override
    public String getName() {
        return "-createTask";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Create task to project by project ID";
    }

    @Override
    public void execute() throws Exception_Exception {
        System.out.println("Введите ID проекта:");
        @NotNull final String id = serviceLocator.getTerminalCommandService().nextLine();
        System.out.println("Введите имя задачи:");
        @NotNull final String oldName = serviceLocator.getTerminalCommandService().nextLine();
        System.out.println("Введите описание для задачи: ");
        @NotNull final String description = serviceLocator.getTerminalCommandService().nextLine();
        System.out.println("Введите дату окончание (Пример: 27.10.2019):");
        @NotNull final String date = serviceLocator.getTerminalCommandService().nextLine();
        System.out.println("Введите статус(Запланировано || В процессе || Готово)");
        @NotNull final String status = serviceLocator.getTerminalCommandService().nextLine();
        serviceLocator.getTaskEndpoint().createTask(serviceLocator.getSession(),
                Objects.requireNonNull(serviceLocator.getSession()).getUserId(), id, oldName, description, date, status);
    }

    @Override
    public boolean isSecure() {
        return true;
    }
}
