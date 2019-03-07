package ru.burmistrov.tm.repository;

import ru.burmistrov.tm.api.repository.ITaskRepository;
import ru.burmistrov.tm.entity.AbstractEntity;
import ru.burmistrov.tm.entity.Task;
import ru.burmistrov.tm.entity.User;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class TaskRepository extends AbstractRepository implements ITaskRepository {

    private final Map<String, Task> tasks = new LinkedHashMap<>();

    @Override
    public AbstractEntity persist(AbstractEntity entity) {
        tasks.put(entity.getId(), (Task) entity);
        return entity;
    }


    @Override
    public void merge(AbstractEntity entity) {
        tasks.put(entity.getId(), (Task) entity);
    }

    @Override
    public void remove(AbstractEntity entity) {
        Task task = (Task) entity;
        tasks.remove(task.getId());
    }


    @Override
    public List<AbstractEntity> findAll(AbstractEntity entity) {
        Task task = (Task) entity;
        List<AbstractEntity> result = new LinkedList<>();
        tasks.entrySet()
                .stream().filter(e -> e.getValue().
                getProjectId().equals(task.getProjectId())
                && e.getValue().getUserId().
                equals(task.getUserId()))
                .forEach(e -> result.add(e.getValue()));
        return result;
    }

    @Override
    public void removeAllInProject(AbstractEntity entity) {
        Task task = (Task) entity;
        tasks.entrySet().removeIf((e) -> e.getValue().getProjectId().equals(task.getProjectId()) &&
                task.getUserId().equals(e.getValue().getUserId()));
    }

    @Override
    public void removeAll(AbstractEntity entity) {
        Task task = (Task) entity;
        tasks.entrySet().removeIf((e) -> e.getValue().getUserId().equals(task.getUserId()));
    }

    @Override
    public AbstractEntity findOne(AbstractEntity entity) {
        Task task = (Task) entity;
        List list = tasks.entrySet().stream().filter(e -> task.equals(e.getValue())).collect(Collectors.toList());
        if(list.size() > 0) {
            return (AbstractEntity) list.get(0);
        }
        return null;
    }
}
