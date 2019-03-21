
package ru.burmistrov.tm.endpoint;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-03-21T11:06:59.008+03:00
 * Generated source version: 3.2.7
 */

@WebFault(name = "JAXBException", targetNamespace = "http://endpoint.tm.burmistrov.ru/")
public class JAXBException_Exception extends Exception {

    private ru.burmistrov.tm.endpoint.JAXBException jaxbException;

    public JAXBException_Exception() {
        super();
    }

    public JAXBException_Exception(String message) {
        super(message);
    }

    public JAXBException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public JAXBException_Exception(String message, ru.burmistrov.tm.endpoint.JAXBException jaxbException) {
        super(message);
        this.jaxbException = jaxbException;
    }

    public JAXBException_Exception(String message, ru.burmistrov.tm.endpoint.JAXBException jaxbException, java.lang.Throwable cause) {
        super(message, cause);
        this.jaxbException = jaxbException;
    }

    public ru.burmistrov.tm.endpoint.JAXBException getFaultInfo() {
        return this.jaxbException;
    }
}
