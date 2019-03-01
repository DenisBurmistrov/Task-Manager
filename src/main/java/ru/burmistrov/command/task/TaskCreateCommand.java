package ru.burmistrov.command.task;

import ru.burmistrov.command.AbstractCommand;
import ru.burmistrov.service.TaskService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskCreateCommand extends AbstractCommand {

    private TaskService taskService = new TaskService();

    @Override
    public String command() {
        return "-createTask";
    }

    @Override
    public String description() {
        return "Create task to project by project ID";
    }

    @Override
    public void execute() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите ID проекта:");
            String id = bufferedReader.readLine();
            System.out.println("Введите имя для задачи: ");
            String name = bufferedReader.readLine();
            System.out.println("Введите описание для задачи: ");
            String description = bufferedReader.readLine();
            System.out.println("Введите приоритет для задачи от 0 до 5: ");
            String priority = bufferedReader.readLine();
            System.out.println(taskService.addTaskToProject(id, name, description, priority));
        }
        catch (IOException e) {
            System.out.println("Некорректные данные");
        }


    }
}
