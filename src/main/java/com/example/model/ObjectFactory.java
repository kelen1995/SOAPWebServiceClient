package com.example.model;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _HELLO_QNAME = new QName("https://examplewebservice/", "Hello");
    private final static QName _HELLORESPONSE_QNAME = new QName("https://examplewebservice/", "HelloResponse");


    public ObjectFactory() {
    }

    public Hello createHello() {
        return new Hello();
    }

    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    @XmlElementDecl(namespace = "https://examplewebservice/", name = "Hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return  new JAXBElement<Hello>(_HELLO_QNAME, Hello.class, null, value);
    }

    @XmlElementDecl(namespace = "https://examplewebservice/", name = "HelloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return  new JAXBElement<HelloResponse>(_HELLORESPONSE_QNAME, HelloResponse.class, null, value);
    }
}
