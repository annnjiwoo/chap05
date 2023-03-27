package com.javalab.inheritance.exam08;

public class Professor extends Person {
	String pid;
	
	public Professor() {
		super();
		
	}
	
	public Professor(String name, int age, String email, String pid, String major) {
		super(name, age, email,pid, major);	//부모생성자 호출
		this.pid = pid;
		
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("교수ID : " +pid);
		System.out.println("학과 : " +major);


		
	}
}
