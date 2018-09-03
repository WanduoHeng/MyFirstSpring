package com.tutorialspoint;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args) {
//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
//        helloWorld.getMessage1();
//        helloWorld.getMessage2();

//        HiWorld hiWorld = (HiWorld)context.getBean("hiWorld");
//        hiWorld.setMessage("Hi 衡万铎");
//        hiWorld.getMessage();

//        HelloIndia helloIndia = (HelloIndia)context.getBean("helloIndia");
//        helloIndia.getMessage1();
//        helloIndia.getMessage2();
//        helloIndia.getMessage3();

//        context.registerShutdownHook();

        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
       /* TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();*/
    }
}
