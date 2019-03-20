package com.anand.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) throws InterruptedException {
		//BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));--> Deprecated
		AbstractApplicationContext appcontext = new ClassPathXmlApplicationContext("Spring.xml");
		appcontext.registerShutdownHook();
		/*Triangle tri = (Triangle) appcontext.getBean("triangle");
		tri.draw();*/
		/*Triangle tri = new Triangle();
		tri.draw();
		*/
		Shape tri = (Shape) appcontext.getBean("circle");
		tri.draw();
		//appcontext.close();
		System.out.println("Anand");
		String msg = appcontext.getMessage("greeting", null, "Hel!!",null);
		//Thread.sleep(1000);
		System.out.println(msg);
	}

}
