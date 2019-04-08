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
 * 2019-04-08T14:41:46.166+03:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://endpoint.tm.burmistrov.ru/", name = "ProjectEndpoint")
@XmlSeeAlso({ObjectFactory.class})
public interface ProjectEndpoint {

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/removeProjectByIdRequest", output = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/removeProjectByIdResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/removeProjectById/Fault/Exception")})
    @RequestWrapper(localName = "removeProjectById", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveProjectById")
    @ResponseWrapper(localName = "removeProjectByIdResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveProjectByIdResponse")
    public void removeProjectById(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId,
        @WebParam(name = "projectId", targetNamespace = "")
        java.lang.String projectId
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/createProjectRequest", output = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/createProjectResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/createProject/Fault/Exception")})
    @RequestWrapper(localName = "createProject", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.CreateProject")
    @ResponseWrapper(localName = "createProjectResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.CreateProjectResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.burmistrov.tm.endpoint.ProjectDto createProject(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId,
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
    @Action(input = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findAllProjectsSortByDateEndRequest", output = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findAllProjectsSortByDateEndResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findAllProjectsSortByDateEnd/Fault/Exception")})
    @RequestWrapper(localName = "findAllProjectsSortByDateEnd", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllProjectsSortByDateEnd")
    @ResponseWrapper(localName = "findAllProjectsSortByDateEndResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllProjectsSortByDateEndResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.ProjectDto> findAllProjectsSortByDateEnd(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findProjectByDescriptionRequest", output = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findProjectByDescriptionResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findProjectByDescription/Fault/Exception")})
    @RequestWrapper(localName = "findProjectByDescription", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindProjectByDescription")
    @ResponseWrapper(localName = "findProjectByDescriptionResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindProjectByDescriptionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.burmistrov.tm.endpoint.ProjectDto findProjectByDescription(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId,
        @WebParam(name = "description", targetNamespace = "")
        java.lang.String description
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findAllProjectsSortByDateBeginRequest", output = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findAllProjectsSortByDateBeginResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findAllProjectsSortByDateBegin/Fault/Exception")})
    @RequestWrapper(localName = "findAllProjectsSortByDateBegin", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllProjectsSortByDateBegin")
    @ResponseWrapper(localName = "findAllProjectsSortByDateBeginResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllProjectsSortByDateBeginResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.ProjectDto> findAllProjectsSortByDateBegin(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findProjectByNameRequest", output = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findProjectByNameResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findProjectByName/Fault/Exception")})
    @RequestWrapper(localName = "findProjectByName", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindProjectByName")
    @ResponseWrapper(localName = "findProjectByNameResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindProjectByNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.burmistrov.tm.endpoint.ProjectDto findProjectByName(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId,
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/removeAllProjectsRequest", output = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/removeAllProjectsResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/removeAllProjects/Fault/Exception")})
    @RequestWrapper(localName = "removeAllProjects", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveAllProjects")
    @ResponseWrapper(localName = "removeAllProjectsResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.RemoveAllProjectsResponse")
    public void removeAllProjects(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findAllProjectsSortByStatusRequest", output = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findAllProjectsSortByStatusResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findAllProjectsSortByStatus/Fault/Exception")})
    @RequestWrapper(localName = "findAllProjectsSortByStatus", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllProjectsSortByStatus")
    @ResponseWrapper(localName = "findAllProjectsSortByStatusResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllProjectsSortByStatusResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.ProjectDto> findAllProjectsSortByStatus(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId
    ) throws Exception_Exception;

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/updateProjectByIdRequest", output = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/updateProjectByIdResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/updateProjectById/Fault/Exception")})
    @RequestWrapper(localName = "updateProjectById", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.UpdateProjectById")
    @ResponseWrapper(localName = "updateProjectByIdResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.UpdateProjectByIdResponse")
    public void updateProjectById(
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
    @Action(input = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findAllProjectsRequest", output = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findAllProjectsResponse", fault = {@FaultAction(className = Exception_Exception.class, value = "http://endpoint.tm.burmistrov.ru/ProjectEndpoint/findAllProjects/Fault/Exception")})
    @RequestWrapper(localName = "findAllProjects", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllProjects")
    @ResponseWrapper(localName = "findAllProjectsResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.FindAllProjectsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ru.burmistrov.tm.endpoint.ProjectDto> findAllProjects(
        @WebParam(name = "session", targetNamespace = "")
        ru.burmistrov.tm.endpoint.Session session,
        @WebParam(name = "userId", targetNamespace = "")
        java.lang.String userId
    ) throws Exception_Exception;
}
