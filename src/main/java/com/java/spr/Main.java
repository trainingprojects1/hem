package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new 
			    ClassPathXmlApplicationContext("com/java/spr/Name.xml");

		Name obj = (Name)ctx.getBean("beanHem");
	
		System.out.println(obj.fullName());
	}

}
