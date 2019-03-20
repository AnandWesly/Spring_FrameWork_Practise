package com.anand.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TriangleObj {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;

	public TriangleObj(){
		System.out.println("TriangleOBJ consturctor");
	}
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	@SuppressWarnings("deprecation")
	@Required
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println(pointA.getX() + " " + pointA.getY());
		System.out.println(pointB.getX() + " " + pointB.getY());
		System.out.println(pointC.getX() + " " + pointC.getY());
	}
	
}
