package com.packt.spring5;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*
La clase Spring5Application ejecuta y pinta los Beans que encuentra
Cuando el Bean es prototype, entonces pinta 3 beans diferentes,
en cambio, cuando el Bean es singleton pinta el mismo Bean 3 veces.

Hay dos maneras de definir los Beans,
1 con annotations,
2 con WiringConfiguration.

Ademas, como el Bean SimpleLogic es autowired, entonces desde el PlainSimpleLogic
lo puede ver y ejecutar su metodo.
 */

@Component
public class SimpleLogic implements InitializingBean {
    public SimpleLogic() {
        System.out.println("Class was created");

    }

    @PostConstruct
    public void init(){
        System.out.println("Class initialized with @PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("Class was initialized in afterPropertiesSet");

    }

    @PreDestroy
    public void destroyed(){
        System.out.println("Bean is about to be destroyed");
    }


    public void doSimpleWork() {
        System.out.println("Work from SimpleLogic");
    }
}
