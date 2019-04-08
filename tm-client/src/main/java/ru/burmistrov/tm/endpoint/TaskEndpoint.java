package ru.burmistrov.tm.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-04-08T14:41:46.397+03:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://endpoint.tm.burmistrov.ru/", name = "TaskEndpoint")
@XmlSeeAlso({ObjectFactory.class})
public interface TaskEndpoint {

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findTaskByNameRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findTaskByNameResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findTaskByName/Fault/Exception")})
    @RequestWrapper(localName = "findTaskByName", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindTaskByName")
    @ResponseWrapper(localName = "findTaskByNameResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindTaskByNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.burmistrov.tm.endpoint.TaskDto findTaskByName(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId,
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/createTaskRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/createTaskResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/createTask/Fault/Exception")})
    @RequestWrapper(localName = "createTask", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.CreateTask")
    @ResponseWrapper(localName = "createTaskResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.CreateTaskResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.burmistrov.tm.endpoint.TaskDto createTask(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId,
        @WebParam(name = "projectId", targetNamespace = "")
        java.lang.String projectId,
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "description", targetNamespace = "")
        java.lang.String description,
        @WebParam(name = "dateEnd", targetNamespace = "")
        java.lang.String dateEnd,
        @WebParam(name = "status", targetNamespace = "")
        java.lang.String status
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByDateBeginRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByDateBeginResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByDateBegin/Fault/Exception")})
    @RequestWrapper(localName = "findAllTasksSortByDateBegin", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksSortByDateBegin")
    @ResponseWrapper(localName = "findAllTasksSortByDateBeginResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksSortByDateBeginResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.TaskDto> findAllTasksSortByDateBegin(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByStatusRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByStatusResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByStatus/Fault/Exception")})
    @RequestWrapper(localName = "findAllTasksSortByStatus", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksSortByStatus")
    @ResponseWrapper(localName = "findAllTasksSortByStatusResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksSortByStatusResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.TaskDto> findAllTasksSortByStatus(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeAllTasksInProjectRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeAllTasksInProjectResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeAllTasksInProject/Fault/Exception")})
    @RequestWrapper(localName = "removeAllTasksInProject", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveAllTasksInProject")
    @ResponseWrapper(localName = "removeAllTasksInProjectResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveAllTasksInProjectResponse")
    public void removeAllTasksInProject(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId,
        @WebParam(name = "projectId", targetNamespace = "")
        java.lang.String projectId
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeAllTasksRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeAllTasksResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeAllTasks/Fault/Exception")})
    @RequestWrapper(localName = "removeAllTasks", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveAllTasks")
    @ResponseWrapper(localName = "removeAllTasksResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveAllTasksResponse")
    public void removeAllTasks(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksInProjectRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksInProjectResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksInProject/Fault/Exception")})
    @RequestWrapper(localName = "findAllTasksInProject", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksInProject")
    @ResponseWrapper(localName = "findAllTasksInProjectResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksInProjectResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.TaskDto> findAllTasksInProject(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId,
        @WebParam(name = "projectId", targetNamespace = "")
        java.lang.String projectId
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByDateEndRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByDateEndResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByDateEnd/Fault/Exception")})
    @RequestWrapper(localName = "findAllTasksSortByDateEnd", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksSortByDateEnd")
    @ResponseWrapper(localName = "findAllTasksSortByDateEndResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksSortByDateEndResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.TaskDto> findAllTasksSortByDateEnd(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findTaskByDescriptionRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findTaskByDescriptionResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findTaskByDescription/Fault/Exception")})
    @RequestWrapper(localName = "findTaskByDescription", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindTaskByDescription")
    @ResponseWrapper(localName = "findTaskByDescriptionResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindTaskByDescriptionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.burmistrov.tm.endpoint.TaskDto findTaskByDescription(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId,
        @WebParam(name = "description", targetNamespace = "")
        java.lang.String description
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/updateTaskByIdRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/updateTaskByIdResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/updateTaskById/Fault/Exception")})
    @RequestWrapper(localName = "updateTaskById", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.UpdateTaskById")
    @ResponseWrapper(localName = "updateTaskByIdResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.UpdateTaskByIdResponse")
    public void updateTaskById(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId,
        @WebParam(name = "projectId", targetNamespace = "")
        java.lang.String projectId,
        @WebParam(name = "taskId", targetNamespace = "")
        java.lang.String taskId,
        @WebParam(name = "newName", targetNamespace = "")
        java.lang.String newName,
        @WebParam(name = "description", targetNamespace = "")
        java.lang.String description,
        @WebParam(name = "dateEnd", targetNamespace = "")
        java.lang.String dateEnd,
        @WebParam(name = "status", targetNamespace = "")
        java.lang.String status
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasks/Fault/Exception")})
    @RequestWrapper(localName = "findAllTasks", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasks")
    @ResponseWrapper(localName = "findAllTasksResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.TaskDto> findAllTasks(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeTaskByIdRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeTaskByIdResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeTaskById/Fault/Exception")})
    @RequestWrapper(localName = "removeTaskById", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveTaskById")
    @ResponseWrapper(localName = "removeTaskByIdResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveTaskByIdResponse")
    public void removeTaskById(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId,
        @WebParam(name = "taskId", targetNamespace = "")
        java.lang.String taskId
    ) throws Exception_Exception;
}
