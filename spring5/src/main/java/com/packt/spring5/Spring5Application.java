package com.packt.spring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
Very interesting vay to execute methods.
Instead of the traditional way of instantiating a class and creating an object,
the classes are now 'components' which are called by the context and
since there is 'wiring' on them, the container recognizes the relationships between
them and reads what methods are the init and destroy because of this wiring.
 */

@SpringBootApplication
public class Spring5Application {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Spring5Application.class, args);
        System.out.println(context.getBean(PlainSimpleLogic.class));
        System.out.println(context.getBean(PlainSimpleLogic.class));
        System.out.println(context.getBean(PlainSimpleLogic.class));

        context.getBean(PlainSimpleLogic.class).doSomeWork();
    }

}
