package com.example;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.sayHelloTrail();
    }

    public void sayHelloTrail() {
        System.out.println("Start Greeting!");

        // prepare ws configuration
        HelloClient client = new HelloClient();
        client.setDefaultUri("http://localhost:8080/ws");
        client.setMarshaller(marshaller());
        client.setUnmarshaller(marshaller());

        // start message exchange
        client.sayHello("hello from client");
        client.sayHello("");
    }

    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.example.model");
        return marshaller;
    }
}