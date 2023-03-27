package com.javalab.inheritance.exam05.package02;

import com.javalab.inheritance.exam05.package01.A;

public class D extends A{
	//생성자 선언
	public D() {
		//A() 생성자 호출
		super();	//o
	}
	
	//메소드 선언
	public void mathod1() {
		//A 필드값 변경
		this.field = "value";	//o
		//A. 메소드 호출
		this.method();			//o
	}
	
	//메소드 선언
	public void mathod2() {// 자식이 부모를 호출할 때엔, 자식 생성자에 super();를 사용하여 호출한다.
		//A a = new A();			//x
		//a.feild = "value";		//x
		//a.method();				//x
	}

}
