package ru.burmistrov.tm.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-03-20T11:37:45.612+03:00
 * Generated source version: 3.2.7
 *
 */
@WebService(targetNamespace = "http://endpoint.tm.burmistrov.ru/", name = "SessionEndpoint")
@XmlSeeAlso({ObjectFactory.class})
public interface SessionEndpoint {

    @WebMethod
    @Action(input = "http://endpoint.tm.burmistrov.ru/SessionEndpoint/getNewSessionRequest", output = "http://endpoint.tm.burmistrov.ru/SessionEndpoint/getNewSessionResponse")
    @RequestWrapper(localName = "getNewSession", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.GetNewSession")
    @ResponseWrapper(localName = "getNewSessionResponse", targetNamespace = "http://endpoint.tm.burmistrov.ru/", className = "ru.burmistrov.tm.endpoint.GetNewSessionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.burmistrov.tm.endpoint.Session getNewSession(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
