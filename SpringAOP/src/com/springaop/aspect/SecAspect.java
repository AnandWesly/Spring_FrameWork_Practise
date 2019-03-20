package com.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class SecAspect {
	
	/*@Before("allGetters()")
	public void loggingAdvice(JoinPoint jointPoint){
		System.out.println("Before method call loggin advice called..");
		System.out.println(jointPoint.toString());
	}
	
	@Before("allGetters()")
	public void loggingAdviceSecond(){
		System.out.println("Second Before method call loggin advice called..");
	}

	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
	@Before("within(com.springaop.model..*)")
	public void loggingAdviceThird(){
		System.out.println("within Before method call loggin advice called..*");
	}

	@Before("args(name)")
	public void stringArgs(String name){
		System.out.println("String args called..args"+name);
	}*/
	
	/*@After("args(name)")
	public void afterAd(String name){
		System.out.println("After args called..args"+name);
	}
	
	@AfterReturning(pointcut="args(name)",returning="returnString")
	public void afterAdReturn(String name,Object returnString){
		System.out.println("afterAdReturn args called..args"+name+", returnString:"+returnString);
	}
	
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void afterAdReturnTrhow(String name,Exception ex){
		System.out.println("afterAdReturnTrhow args called..args"+name+", e"+ex);
	}*/
	
	@Before("allGetters()")
	public void loggingAdviceSecond(){
		System.out.println("Security method call loggin advice called..");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	/*
	@Around("@annotation(com.springaop.aspect.Loggable)")
	public Object aroundAd(ProceedingJoinPoint proceedingJoinpoint){
		Object returnValue= null;
		
		try {
			System.out.println("Sec Before advise...");
			//returnValue = proceedingJoinpoint.proceed();
			System.out.println(" Sec After advise...");

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sec After Finally...");

		return returnValue;
		
	}*/
	
/*	@After("args(name)")
	public void afterAd(String name,JoinPoint joinpoint){
		//joinpoint.getTarget()
		System.out.println("After args called..args"+name);
	}*/
}
