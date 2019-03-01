package ru.burmistrov.command.project;

import ru.burmistrov.command.AbstractCommand;
import ru.burmistrov.service.ProjectService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProjectCreateCommand extends AbstractCommand {

    private ProjectService projectService = new ProjectService();

    @Override
    public String command() {
        return "-createProject";
    }

    @Override
    public String description() {
        return "Create new project";
    }

    @Override
    public void execute() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя:");
        try {

            String name = bufferedReader.readLine();
            System.out.println("Введите описание:");
            String description = bufferedReader.readLine();
            System.out.println(projectService.addProject(name, description));
        }
        catch (IOException e) {
            System.out.println("Некорректные данные");
        }
    }
}
