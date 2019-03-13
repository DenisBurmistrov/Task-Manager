package ru.burmistrov.tm.command.task;

import org.jetbrains.annotations.Nullable;
import ru.burmistrov.tm.api.service.ITaskService;
import ru.burmistrov.tm.command.AbstractCommand;
import ru.burmistrov.tm.entity.AbstractEntity;

import java.util.List;

public class TaskListSortedByStatus extends AbstractCommand {

    @Nullable
    @Override
    public String getName() {
        return "-printTasksSortedByStatus";
    }

    @Nullable
    @Override
    public String getDescription() {
        return "Print tasks sorted by status";
    }

    @Override
    public void execute() {
        @Nullable final ITaskService<AbstractEntity> taskService = getServiceLocator().getTaskService();
        @Nullable final List<AbstractEntity> taskList = taskService.findAllSortByStatus(getServiceLocator().getCurrentUser().getId());
        System.out.println("Нет задач");
        for (AbstractEntity task : taskList) {
            System.out.println(task);
        }
    }

    @Override
    public boolean isSecure() {
        return false;
    }
}
