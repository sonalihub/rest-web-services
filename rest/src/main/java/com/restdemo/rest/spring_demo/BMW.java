package com.restdemo.rest.spring_demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Primary
public class BMW implements Engine{

    @Override
    public String display() {
        return "BMW Engine";
    }
    //mark @Primary at the class level
}
