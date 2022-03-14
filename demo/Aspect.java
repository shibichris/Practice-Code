package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
	@Pointcut("execution(public void com.example.demo.Employe.Employee())")
	public void p1() {
		
	}
	@Before("p1()")
public void begin() {
	System.out.println("Started");
}
	@AfterThrowing("p1()")
	public void throwss() {
		System.out.println("Throwing exception");
	}
	@After("p1()")
	public void after() {
		System.out.println("Ended");
	}
	
	}

