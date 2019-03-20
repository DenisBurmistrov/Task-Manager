
package ru.burmistrov.tm.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.burmistrov.tm.endpoint package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ClassNotFoundException_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "ClassNotFoundException");
    private final static QName _IOException_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "IOException");
    private final static QName _JAXBException_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "JAXBException");
    private final static QName _LoadDataByDefault_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "loadDataByDefault");
    private final static QName _LoadDataByDefaultResponse_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "loadDataByDefaultResponse");
    private final static QName _LoadDataByFasterXml_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "loadDataByFasterXml");
    private final static QName _LoadDataByFasterXmlJson_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "loadDataByFasterXmlJson");
    private final static QName _LoadDataByFasterXmlJsonResponse_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "loadDataByFasterXmlJsonResponse");
    private final static QName _LoadDataByFasterXmlResponse_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "loadDataByFasterXmlResponse");
    private final static QName _LoadDataByJaxbJson_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "loadDataByJaxbJson");
    private final static QName _LoadDataByJaxbJsonResponse_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "loadDataByJaxbJsonResponse");
    private final static QName _LoadDataByJaxbXml_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "loadDataByJaxbXml");
    private final static QName _LoadDataByJaxbXmlResponse_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "loadDataByJaxbXmlResponse");
    private final static QName _SaveDataByDefault_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "saveDataByDefault");
    private final static QName _SaveDataByDefaultResponse_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "saveDataByDefaultResponse");
    private final static QName _SaveDataByFasterXml_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "saveDataByFasterXml");
    private final static QName _SaveDataByFasterXmlJson_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "saveDataByFasterXmlJson");
    private final static QName _SaveDataByFasterXmlJsonResponse_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "saveDataByFasterXmlJsonResponse");
    private final static QName _SaveDataByFasterXmlResponse_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "saveDataByFasterXmlResponse");
    private final static QName _SaveDataByJaxbJson_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "saveDataByJaxbJson");
    private final static QName _SaveDataByJaxbJsonResponse_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "saveDataByJaxbJsonResponse");
    private final static QName _SaveDataByJaxbXml_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "saveDataByJaxbXml");
    private final static QName _SaveDataByJaxbXmlResponse_QNAME = new QName("http://endpoint.tm.burmistrov.ru/", "saveDataByJaxbXmlResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.burmistrov.tm.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClassNotFoundException }
     * 
     */
    public ClassNotFoundException createClassNotFoundException() {
        return new ClassNotFoundException();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link JAXBException }
     * 
     */
    public JAXBException createJAXBException() {
        return new JAXBException();
    }

    /**
     * Create an instance of {@link LoadDataByDefault }
     * 
     */
    public LoadDataByDefault createLoadDataByDefault() {
        return new LoadDataByDefault();
    }

    /**
     * Create an instance of {@link LoadDataByDefaultResponse }
     * 
     */
    public LoadDataByDefaultResponse createLoadDataByDefaultResponse() {
        return new LoadDataByDefaultResponse();
    }

    /**
     * Create an instance of {@link LoadDataByFasterXml }
     * 
     */
    public LoadDataByFasterXml createLoadDataByFasterXml() {
        return new LoadDataByFasterXml();
    }

    /**
     * Create an instance of {@link LoadDataByFasterXmlJson }
     * 
     */
    public LoadDataByFasterXmlJson createLoadDataByFasterXmlJson() {
        return new LoadDataByFasterXmlJson();
    }

    /**
     * Create an instance of {@link LoadDataByFasterXmlJsonResponse }
     * 
     */
    public LoadDataByFasterXmlJsonResponse createLoadDataByFasterXmlJsonResponse() {
        return new LoadDataByFasterXmlJsonResponse();
    }

    /**
     * Create an instance of {@link LoadDataByFasterXmlResponse }
     * 
     */
    public LoadDataByFasterXmlResponse createLoadDataByFasterXmlResponse() {
        return new LoadDataByFasterXmlResponse();
    }

    /**
     * Create an instance of {@link LoadDataByJaxbJson }
     * 
     */
    public LoadDataByJaxbJson createLoadDataByJaxbJson() {
        return new LoadDataByJaxbJson();
    }

    /**
     * Create an instance of {@link LoadDataByJaxbJsonResponse }
     * 
     */
    public LoadDataByJaxbJsonResponse createLoadDataByJaxbJsonResponse() {
        return new LoadDataByJaxbJsonResponse();
    }

    /**
     * Create an instance of {@link LoadDataByJaxbXml }
     * 
     */
    public LoadDataByJaxbXml createLoadDataByJaxbXml() {
        return new LoadDataByJaxbXml();
    }

    /**
     * Create an instance of {@link LoadDataByJaxbXmlResponse }
     * 
     */
    public LoadDataByJaxbXmlResponse createLoadDataByJaxbXmlResponse() {
        return new LoadDataByJaxbXmlResponse();
    }

    /**
     * Create an instance of {@link SaveDataByDefault }
     * 
     */
    public SaveDataByDefault createSaveDataByDefault() {
        return new SaveDataByDefault();
    }

    /**
     * Create an instance of {@link SaveDataByDefaultResponse }
     * 
     */
    public SaveDataByDefaultResponse createSaveDataByDefaultResponse() {
        return new SaveDataByDefaultResponse();
    }

    /**
     * Create an instance of {@link SaveDataByFasterXml }
     * 
     */
    public SaveDataByFasterXml createSaveDataByFasterXml() {
        return new SaveDataByFasterXml();
    }

    /**
     * Create an instance of {@link SaveDataByFasterXmlJson }
     * 
     */
    public SaveDataByFasterXmlJson createSaveDataByFasterXmlJson() {
        return new SaveDataByFasterXmlJson();
    }

    /**
     * Create an instance of {@link SaveDataByFasterXmlJsonResponse }
     * 
     */
    public SaveDataByFasterXmlJsonResponse createSaveDataByFasterXmlJsonResponse() {
        return new SaveDataByFasterXmlJsonResponse();
    }

    /**
     * Create an instance of {@link SaveDataByFasterXmlResponse }
     * 
     */
    public SaveDataByFasterXmlResponse createSaveDataByFasterXmlResponse() {
        return new SaveDataByFasterXmlResponse();
    }

    /**
     * Create an instance of {@link SaveDataByJaxbJson }
     * 
     */
    public SaveDataByJaxbJson createSaveDataByJaxbJson() {
        return new SaveDataByJaxbJson();
    }

    /**
     * Create an instance of {@link SaveDataByJaxbJsonResponse }
     * 
     */
    public SaveDataByJaxbJsonResponse createSaveDataByJaxbJsonResponse() {
        return new SaveDataByJaxbJsonResponse();
    }

    /**
     * Create an instance of {@link SaveDataByJaxbXml }
     * 
     */
    public SaveDataByJaxbXml createSaveDataByJaxbXml() {
        return new SaveDataByJaxbXml();
    }

    /**
     * Create an instance of {@link SaveDataByJaxbXmlResponse }
     * 
     */
    public SaveDataByJaxbXmlResponse createSaveDataByJaxbXmlResponse() {
        return new SaveDataByJaxbXmlResponse();
    }

    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JAXBException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "JAXBException")
    public JAXBElement<JAXBException> createJAXBException(JAXBException value) {
        return new JAXBElement<JAXBException>(_JAXBException_QNAME, JAXBException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDataByDefault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "loadDataByDefault")
    public JAXBElement<LoadDataByDefault> createLoadDataByDefault(LoadDataByDefault value) {
        return new JAXBElement<LoadDataByDefault>(_LoadDataByDefault_QNAME, LoadDataByDefault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDataByDefaultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "loadDataByDefaultResponse")
    public JAXBElement<LoadDataByDefaultResponse> createLoadDataByDefaultResponse(LoadDataByDefaultResponse value) {
        return new JAXBElement<LoadDataByDefaultResponse>(_LoadDataByDefaultResponse_QNAME, LoadDataByDefaultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDataByFasterXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "loadDataByFasterXml")
    public JAXBElement<LoadDataByFasterXml> createLoadDataByFasterXml(LoadDataByFasterXml value) {
        return new JAXBElement<LoadDataByFasterXml>(_LoadDataByFasterXml_QNAME, LoadDataByFasterXml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDataByFasterXmlJson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "loadDataByFasterXmlJson")
    public JAXBElement<LoadDataByFasterXmlJson> createLoadDataByFasterXmlJson(LoadDataByFasterXmlJson value) {
        return new JAXBElement<LoadDataByFasterXmlJson>(_LoadDataByFasterXmlJson_QNAME, LoadDataByFasterXmlJson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDataByFasterXmlJsonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "loadDataByFasterXmlJsonResponse")
    public JAXBElement<LoadDataByFasterXmlJsonResponse> createLoadDataByFasterXmlJsonResponse(LoadDataByFasterXmlJsonResponse value) {
        return new JAXBElement<LoadDataByFasterXmlJsonResponse>(_LoadDataByFasterXmlJsonResponse_QNAME, LoadDataByFasterXmlJsonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDataByFasterXmlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "loadDataByFasterXmlResponse")
    public JAXBElement<LoadDataByFasterXmlResponse> createLoadDataByFasterXmlResponse(LoadDataByFasterXmlResponse value) {
        return new JAXBElement<LoadDataByFasterXmlResponse>(_LoadDataByFasterXmlResponse_QNAME, LoadDataByFasterXmlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDataByJaxbJson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "loadDataByJaxbJson")
    public JAXBElement<LoadDataByJaxbJson> createLoadDataByJaxbJson(LoadDataByJaxbJson value) {
        return new JAXBElement<LoadDataByJaxbJson>(_LoadDataByJaxbJson_QNAME, LoadDataByJaxbJson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDataByJaxbJsonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "loadDataByJaxbJsonResponse")
    public JAXBElement<LoadDataByJaxbJsonResponse> createLoadDataByJaxbJsonResponse(LoadDataByJaxbJsonResponse value) {
        return new JAXBElement<LoadDataByJaxbJsonResponse>(_LoadDataByJaxbJsonResponse_QNAME, LoadDataByJaxbJsonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDataByJaxbXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "loadDataByJaxbXml")
    public JAXBElement<LoadDataByJaxbXml> createLoadDataByJaxbXml(LoadDataByJaxbXml value) {
        return new JAXBElement<LoadDataByJaxbXml>(_LoadDataByJaxbXml_QNAME, LoadDataByJaxbXml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadDataByJaxbXmlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "loadDataByJaxbXmlResponse")
    public JAXBElement<LoadDataByJaxbXmlResponse> createLoadDataByJaxbXmlResponse(LoadDataByJaxbXmlResponse value) {
        return new JAXBElement<LoadDataByJaxbXmlResponse>(_LoadDataByJaxbXmlResponse_QNAME, LoadDataByJaxbXmlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDataByDefault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "saveDataByDefault")
    public JAXBElement<SaveDataByDefault> createSaveDataByDefault(SaveDataByDefault value) {
        return new JAXBElement<SaveDataByDefault>(_SaveDataByDefault_QNAME, SaveDataByDefault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDataByDefaultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "saveDataByDefaultResponse")
    public JAXBElement<SaveDataByDefaultResponse> createSaveDataByDefaultResponse(SaveDataByDefaultResponse value) {
        return new JAXBElement<SaveDataByDefaultResponse>(_SaveDataByDefaultResponse_QNAME, SaveDataByDefaultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDataByFasterXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "saveDataByFasterXml")
    public JAXBElement<SaveDataByFasterXml> createSaveDataByFasterXml(SaveDataByFasterXml value) {
        return new JAXBElement<SaveDataByFasterXml>(_SaveDataByFasterXml_QNAME, SaveDataByFasterXml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDataByFasterXmlJson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "saveDataByFasterXmlJson")
    public JAXBElement<SaveDataByFasterXmlJson> createSaveDataByFasterXmlJson(SaveDataByFasterXmlJson value) {
        return new JAXBElement<SaveDataByFasterXmlJson>(_SaveDataByFasterXmlJson_QNAME, SaveDataByFasterXmlJson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDataByFasterXmlJsonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "saveDataByFasterXmlJsonResponse")
    public JAXBElement<SaveDataByFasterXmlJsonResponse> createSaveDataByFasterXmlJsonResponse(SaveDataByFasterXmlJsonResponse value) {
        return new JAXBElement<SaveDataByFasterXmlJsonResponse>(_SaveDataByFasterXmlJsonResponse_QNAME, SaveDataByFasterXmlJsonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDataByFasterXmlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "saveDataByFasterXmlResponse")
    public JAXBElement<SaveDataByFasterXmlResponse> createSaveDataByFasterXmlResponse(SaveDataByFasterXmlResponse value) {
        return new JAXBElement<SaveDataByFasterXmlResponse>(_SaveDataByFasterXmlResponse_QNAME, SaveDataByFasterXmlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDataByJaxbJson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "saveDataByJaxbJson")
    public JAXBElement<SaveDataByJaxbJson> createSaveDataByJaxbJson(SaveDataByJaxbJson value) {
        return new JAXBElement<SaveDataByJaxbJson>(_SaveDataByJaxbJson_QNAME, SaveDataByJaxbJson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDataByJaxbJsonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "saveDataByJaxbJsonResponse")
    public JAXBElement<SaveDataByJaxbJsonResponse> createSaveDataByJaxbJsonResponse(SaveDataByJaxbJsonResponse value) {
        return new JAXBElement<SaveDataByJaxbJsonResponse>(_SaveDataByJaxbJsonResponse_QNAME, SaveDataByJaxbJsonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDataByJaxbXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "saveDataByJaxbXml")
    public JAXBElement<SaveDataByJaxbXml> createSaveDataByJaxbXml(SaveDataByJaxbXml value) {
        return new JAXBElement<SaveDataByJaxbXml>(_SaveDataByJaxbXml_QNAME, SaveDataByJaxbXml.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDataByJaxbXmlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.tm.burmistrov.ru/", name = "saveDataByJaxbXmlResponse")
    public JAXBElement<SaveDataByJaxbXmlResponse> createSaveDataByJaxbXmlResponse(SaveDataByJaxbXmlResponse value) {
        return new JAXBElement<SaveDataByJaxbXmlResponse>(_SaveDataByJaxbXmlResponse_QNAME, SaveDataByJaxbXmlResponse.class, null, value);
    }

}
