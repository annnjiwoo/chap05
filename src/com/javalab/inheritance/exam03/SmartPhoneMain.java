package com.javalab.inheritance.exam03;

public class SmartPhoneMain {
	public static void main(String[] args) {
		//1. SmartPhone 객체 생성
		SmartPhone myphone = new SmartPhone ();	// 이건 생성자다~
		myphone.model = "아이폰11pro";			//이건 객체다~
		myphone.color = "실버";
		myphone.frequency = "4G";
		
		//myphone 정보 조회
		myphone.showSmartInfo();
		System.out.println();
		
		//2. 또 다른 SmartPhone 객체 생성
		SmartPhone yourPhone = new SmartPhone ("iPhone", "Grey", "5G");
		
		//yourPhone 정보 조회
		yourPhone.showSmartInfo();
		
	}



}
