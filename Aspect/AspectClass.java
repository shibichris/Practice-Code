package Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectClass {
	
	@Before("execution(* workingDemo.Admission.Student())")
	public void p1() {
		System.out.println("Before I will Work");
	}
}