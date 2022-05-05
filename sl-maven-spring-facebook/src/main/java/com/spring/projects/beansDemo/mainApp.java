package com.spring.projects.beansDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

    public static void main(String[] args) {

        //Get the context and start it
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();

        //Find the bean
        Calculator calculatorBean = context.getBean("calculatorBean", Calculator.class);

        //Execute as a regular class
        System.out.println("Addition: " + calculatorBean.add());
        System.out.println("Subtraction: " + calculatorBean.subtract());


        context.stop();
        context.close();
    }
}
