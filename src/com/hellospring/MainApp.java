package com.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	      ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");

	      Greeting obj = (Greeting) context.getBean("greeter");
	      System.out.println("Hello world from "+ obj.getGreeting());
	   }
}
