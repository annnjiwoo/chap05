package com.javalab.inheritance.exam03;

public class SmartPhone extends Phone{
	
	public String frequency;
	
	public SmartPhone() {
		super();
	}
	
	
	public SmartPhone(String model, String color) {
		super(model, color);
	}

	public SmartPhone(String model, String color, String frequency) {
		super(model, color);
		this.frequency = frequency;
	}

	public void showSmartInfo() {
		this.showphoneInfo();
		System.out.println("[SmartPhone Info]");
		System.out.println("휴대폰의 버전?은? : " + frequency);
	}
	
	//자식생성자 선언 안함
}
