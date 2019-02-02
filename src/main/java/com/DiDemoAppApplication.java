package com;

import com.example.controllers.ConstructorInjectedController;
import com.example.controllers.MyController;
import com.example.controllers.PropertyInjectedController;
import com.example.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoAppApplication {

    public static void main(String[] args) {
       ApplicationContext context=  SpringApplication.run(DiDemoAppApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");

        System.out.println(myController.hello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
    }

}

