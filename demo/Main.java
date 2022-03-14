package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext();
	Employe employe=context.getBean("employe",Employe.class);
	System.out.println(employe);
	try {
		employe.Employee();
	} catch (Exception e) {
		
		
	}
}
}
