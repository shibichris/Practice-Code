package com.example.demo;

import java.security.Provider.Service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Main.class);
	TxService service=context.getBean("Service",TxService.class);
	service.Employee();
}
}
