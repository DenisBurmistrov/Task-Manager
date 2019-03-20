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
 * 2019-03-20T16:28:32.948+03:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://endpoint.tm.burmistrov.ru/", name = "TaskEndpoint")
@XmlSeeAlso({ObjectFactory.class})
public interface TaskEndpoint {

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findTaskByNameRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findTaskByNameResponse")
    @RequestWrapper(localName = "findTaskByName", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindTaskByName")
    @ResponseWrapper(localName = "findTaskByNameResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindTaskByNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.burmistrov.tm.endpoint.Task findTaskByName(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/createTaskRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/createTaskResponse", fault = {@FaultAction(className = ParseException_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/createTask/Fault/ParseException")})
    @RequestWrapper(localName = "createTask", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.CreateTask")
    @ResponseWrapper(localName = "createTaskResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.CreateTaskResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.burmistrov.tm.endpoint.Task createTask(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        java.lang.String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        java.lang.String arg4
    ) throws ParseException_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByDateBeginRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByDateBeginResponse")
    @RequestWrapper(localName = "findAllTasksSortByDateBegin", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksSortByDateBegin")
    @ResponseWrapper(localName = "findAllTasksSortByDateBeginResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksSortByDateBeginResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.Task> findAllTasksSortByDateBegin(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeAllTasksInProjectRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeAllTasksInProjectResponse")
    @RequestWrapper(localName = "removeAllTasksInProject", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveAllTasksInProject")
    @ResponseWrapper(localName = "removeAllTasksInProjectResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveAllTasksInProjectResponse")
    public void removeAllTasksInProject(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByStatusRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByStatusResponse")
    @RequestWrapper(localName = "findAllTasksSortByStatus", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksSortByStatus")
    @ResponseWrapper(localName = "findAllTasksSortByStatusResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksSortByStatusResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.Task> findAllTasksSortByStatus(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeAllTasksRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeAllTasksResponse")
    @RequestWrapper(localName = "removeAllTasks", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveAllTasks")
    @ResponseWrapper(localName = "removeAllTasksResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveAllTasksResponse")
    public void removeAllTasks(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksInProjectRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksInProjectResponse")
    @RequestWrapper(localName = "findAllTasksInProject", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksInProject")
    @ResponseWrapper(localName = "findAllTasksInProjectResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksInProjectResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.Task> findAllTasksInProject(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByDateEndRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksSortByDateEndResponse")
    @RequestWrapper(localName = "findAllTasksSortByDateEnd", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksSortByDateEnd")
    @ResponseWrapper(localName = "findAllTasksSortByDateEndResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksSortByDateEndResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.Task> findAllTasksSortByDateEnd(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findTaskByDescriptionRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findTaskByDescriptionResponse")
    @RequestWrapper(localName = "findTaskByDescription", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindTaskByDescription")
    @ResponseWrapper(localName = "findTaskByDescriptionResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindTaskByDescriptionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.burmistrov.tm.endpoint.Task findTaskByDescription(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/findAllTasksResponse")
    @RequestWrapper(localName = "findAllTasks", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasks")
    @ResponseWrapper(localName = "findAllTasksResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllTasksResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.Task> findAllTasks(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/updateTaskByIdRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/updateTaskByIdResponse", fault = {@FaultAction(className = ParseException_Exception.class, value = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/updateTaskById/Fault/ParseException")})
    @RequestWrapper(localName = "updateTaskById", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.UpdateTaskById")
    @ResponseWrapper(localName = "updateTaskByIdResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.UpdateTaskByIdResponse")
    public void updateTaskById(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        java.lang.String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        java.lang.String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        java.lang.String arg5
    ) throws ParseException_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeTaskByIdRequest", output = "http://endpoint.tm.burmistrov.ru/TaskEndpoint/removeTaskByIdResponse")
    @RequestWrapper(localName = "removeTaskById", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveTaskById")
    @ResponseWrapper(localName = "removeTaskByIdResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveTaskByIdResponse")
    public void removeTaskById(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );
}
