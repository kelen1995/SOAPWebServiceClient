package com.example.model;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HelloResponse", propOrder = {"msg"})
public class HelloResponse {

    @XmlElement(name = "msg")
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}