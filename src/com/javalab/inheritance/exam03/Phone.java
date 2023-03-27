package com.javalab.inheritance.exam03;
// 부모클래스
public class Phone {
	//필드 선언
	public String model;
	public String color;
	
	
	//생성자 선언
	public Phone() {
		super();	
		// 자신의 클래스에 super을 넣는 경우는, object라는 최고 부모의 값을 상속받기 위함이다.
		// 사실은 public class Phone extends Object 인것!
	}
	
	public Phone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	//phoneInfo()메소드 구현
	
	public void showphoneInfo(){
		System.out.println("[Phone Info]");
		System.out.println("휴대폰의 모델은? : " + model);
		System.out.println("휴대폰의 색상은? : " + color);
	}
}
