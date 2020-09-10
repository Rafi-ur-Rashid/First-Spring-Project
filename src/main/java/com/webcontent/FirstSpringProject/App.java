package com.webcontent.FirstSpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
//        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//        
//        Vehicle obj= (Vehicle)context.getBean("car");
//        obj.drive();
//        Tyre t= (Tyre)context.getBean("tyre");
//        System.out.println(t);
    	ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung s10=factory.getBean(Samsung.class);
    	s10.config();
    }
}
