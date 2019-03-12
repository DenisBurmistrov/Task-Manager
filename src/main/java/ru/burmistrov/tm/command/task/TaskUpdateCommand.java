package ru.burmistrov.tm.command.task;

import ru.burmistrov.tm.Bootstrap;
import ru.burmistrov.tm.api.loader.ServiceLocator;
import ru.burmistrov.tm.api.service.ITaskService;
import ru.burmistrov.tm.command.AbstractCommand;

import java.util.Scanner;

public final class TaskUpdateCommand extends AbstractCommand {



    public TaskUpdateCommand() {
    }

    @Override
    public String getName() {
        return "-updateTask";
    }

    @Override
    public String getDescription() {
        return "Update task by project ID by task ID";
    }

    @Override
    public void execute() {
        if (getServiceLocator() != null) {
            ITaskService taskService = getServiceLocator().getTaskService();
            Scanner scanner = getServiceLocator().getScanner();
            System.out.println("Введите ID проекта:");
            String projectId = scanner.nextLine();
            System.out.println("Введите ID задачи:");
            String taskId = scanner.nextLine();
            System.out.println("Введите новое имя:");
            String newName = scanner.nextLine();
            System.out.println("Введите новое описание: ");
            String description = scanner.nextLine();
            if (taskService != null) {
                taskService.merge(getServiceLocator().getCurrentUser().getId(), projectId, taskId, newName, description);
            }
        }
    }

    @Override
    public boolean isSecure() {
        return true;
    }
}
