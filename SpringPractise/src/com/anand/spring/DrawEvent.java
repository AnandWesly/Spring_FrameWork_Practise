package com.anand.spring;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent{

	public DrawEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "DrawEvent [source=" + source + ", getTimestamp()=" + getTimestamp() + ", getSource()=" + getSource()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
