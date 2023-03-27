package com.javalab.inheritance.exam01;

public class Child  extends Parent{
	public String address;
	public String phone;

	// 기본생성자
	public Child() {
		super(); // 첫줄에서 부모 객체 기본 생성자 호출
		//super();는 항상 첫줄에
		//적지 않아도 디폴트로 들어가겠지만 그래도 넣자
	}

	public Child(String address) {
		super("김길동", 29); // 부모필드 초기화
		this.address = address;	//자기필드 초기화
		System.out.println("자식 객체의 생성자1");
	}

	public Child(String address, String phone) {
		super();
		this.address = address;
		this.phone = phone;
		System.out.println("자식 객체의 생성자");

	}
}
