package com.javalab.inheritance.exam08;

public class Student extends Person{
	String sid;
	
	public Student() {
		super();
		
	}
	
	public Student(String name, int age, String email, String sid, String major) {
		super(name, age, email,sid, major);	//부모생성자 호출
		this.sid = sid;
		
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("학번 : " +sid);
		System.out.println("학과 : " +major);

		
	}
	
}
