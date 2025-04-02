package com.example;

import com.example.model.Hello;
import com.example.model.HelloResponse;
import com.example.model.ObjectFactory;
import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class HelloClient extends WebServiceGatewaySupport {

    public HelloResponse sayHello(String greeting) {
        // check greeting
        if (greeting == null || greeting.isBlank()) {
            greeting = "regular hello!";
        }
        System.out.println("send: " + greeting);

        // prepare Hello
        Hello request = new Hello();
        request.setMsg(greeting);

        // send & receive Hello
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<Hello> helloReq = factory.createHello(request);
        JAXBElement<HelloResponse> helloRes = (JAXBElement<HelloResponse>) getWebServiceTemplate().marshalSendAndReceive(helloReq);
        HelloResponse response = helloRes.getValue();
        System.out.println("received: " + response.getMsg());

        return response;
    }
}
