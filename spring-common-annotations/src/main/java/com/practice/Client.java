package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfig.class);
		//System.out.println("beans xml loaded");
		College college= context.getBean("college", College.class);
		System.out.println("college object created by spring is: "+ college);
		college.test();
		
		((AnnotationConfigApplicationContext)context).close();
	}
}
