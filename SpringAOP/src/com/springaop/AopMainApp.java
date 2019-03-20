package com.springaop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.service.ShapeService;

public class AopMainApp {

	public static void main(String[] args) {
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("Spring.xml");
		appContext.registerShutdownHook();
		ShapeService shape = appContext.getBean("ShapeService",ShapeService.class);
		shape.getCircle().setName("Dummy");
		//System.out.println(shape.getTriangle().getName());
		System.out.println(shape.getCircle().getName());
		appContext.close();
	}

}
