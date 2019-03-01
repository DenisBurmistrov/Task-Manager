package ru.burmistrov.repository;

import ru.burmistrov.Bootstrap;
import ru.burmistrov.api.repository.IProjectRepository;
import ru.burmistrov.entity.Project;

import java.util.Map;

public class ProjectRepository implements IProjectRepository {

    private static long counter = 1;
    private Map<Long, Project> projects = Bootstrap.projects;


    @Override
    public String addProject(String name, String description) {
        Project project = new Project();
        project.setId(incrementCounter());
        project.setName(name);
        project.setDescription(description);

        if (projects.containsValue(project)) {
           return "Проект с таким именем уже существует";
        } else {
            projects.put(project.getId(), project);
            return "Добавление произведено";
        }
    }

    @Override
    public String deleteProjectById(Long projectId){

            projects.entrySet().removeIf(e -> e.getValue().getId().equals(projectId));
            return "";
        }



    /*@Override
    public String printProjects() {
        System.out.println("Список проектов:");
        projects.forEach((k, v) -> System.out.println(v));
        return "";
    }*/


    @Override
    public String clearAll() {
        projects.clear();
        return "Все проекты удалены";
    }


   /* @Override
    public void updateProjectNameById(Long id, String name) {
        Iterator it = projects.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if(pair.getKey() == id){
                Project project = new Project((Project) pair.getValue());
                project.setName(name);
                projects.put(id, project);
                printProjects();
            }
        }
    }*/

    public Long incrementCounter(){
        return counter++;
    }

}