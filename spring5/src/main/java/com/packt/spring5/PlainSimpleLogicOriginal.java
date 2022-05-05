package com.packt.spring5;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class PlainSimpleLogicOriginal implements InitializingBean {

    public PlainSimpleLogicOriginal() {
        System.out.println("Class was created");

    }

    public void init(){
        System.out.println("Class initialized with @PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("Class was initialized in afterPropertiesSet");

    }

    public void destroyed(){
        System.out.println("Bean is about to be destroyed");
    }


}
