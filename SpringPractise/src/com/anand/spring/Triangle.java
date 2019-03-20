package com.anand.spring;

public class Triangle {
	
	public Triangle(){
		System.out.println("Triangle Constructor is called..");
	
	}
	public Triangle(String type){
		System.out.println("Constructor is called..");
		this.type = type;
	}
	public Triangle(int height){
		System.out.println("Constructor 2 is called..");
		this.height = height;
	}
	public Triangle(String type,int height){
		System.out.println("Constructor 3 is called..");
		this.type = type;
		this.height = height;
	}
	
	private String type;
	private int height;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw(){
		System.out.println(type+" Triangle drawn.."+ getHeight());
	}

}
