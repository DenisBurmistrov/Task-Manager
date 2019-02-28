package ru.burmistrov.entity;

import java.util.Objects;

public class Task {

    private Long id;
    private String name;
    private String description;
    private Integer priority;
    private long counter = 1;

    public Task() {
        id = counter++;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        if (priority >= 0 || priority <= 5) {
            this.priority = priority;
        }
        else {
            System.out.println("Некорректное значение приоритета (Диапазон от 0 до 5)");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "; Название: " + name +
                ", Приоритет " + priority;
    }

    private void incrementCounter() {
        counter++;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
