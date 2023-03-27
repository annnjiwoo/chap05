package com.javalab.inheritance.exam08;

public class Person {
	String name;
	int age;
	String email;
	String id;
	String major;

	public Person() {

	}

	public Person(String name, int age, String email, String id, String major) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.id = id;
		this.major = major;
	}
	
	//4. Person 클래스에는 공통정보(field)를 보여주는 메소드를 구현하세요
	public void show() {
		System.out.println("----------------\n성별 : " + name);
		System.out.println("나이 : " +age);
		System.out.println("이메일 : " +email);
		

	}

}
