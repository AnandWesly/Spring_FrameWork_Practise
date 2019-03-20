package com.anand.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape,ApplicationEventPublisherAware{
	
	@Autowired
	private MessageSource message;
	private ApplicationEventPublisher publisher;
	
	public MessageSource getMessage() {
		return message;
	}

	public void setMessage(MessageSource message) {
		this.message = message;
	}

	@Override
	public void draw() {
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
		System.out.println(center.getX() +","+center.getY());
		
	}
	
	@Resource(name="pointC")
	private Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void init(){
		
		System.out.println("init..."+message.getMessage("greeting", null, "Hel!!",null));
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroy...");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
}
