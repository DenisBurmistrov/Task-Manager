package ru.burmistrov.entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public class Project {

    private String name;
    private String description;
    private Date createdAt;
    private Long id;
    private HashMap<Long, Task> tasks = new HashMap<>();
    private long counter = 1;

    public Project() {
        createdAt = new Date();
    }

    public Project (Project project) {
        this.name = project.getName();
        this.description = project.getDescription();
        this.id = project.getId();
        this.createdAt = project.getCreatedAt();
    }

    public Project(String name, String description, Long id) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.createdAt = new Date();
    }

    public void addTask(Task task) {
        tasks.put(incrementCounter(), task);
    }

    public Long incrementCounter() {
        return counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HashMap<Long, Task> getTasks() {
        return tasks;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(name, project.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "ID: " + id +"; Название: " + name + "; Описание: " + description + "; Дата создания: " + createdAt;
    }


}
