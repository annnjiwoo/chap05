package com.javalab.inheritance.exam08;

public class PersonMain {
	public static void main(String[] args) {
		
		//raw data를 메모리에 저장할 수 있는 배열
		Person[] persons = new Person[5];
		
		// 부모 타입 배열로 형변환
		persons[0] = new Student("김보희", 20, "alice@example.com", "72345678", "컴퓨터공학과");
		persons[1] = new Student("미정이", 19, "bob@hotmail.com", "87654321", "문헌정보학과");
		persons[2] = new Student("채필립", 22, "marine@google.com", "6587658", "영문학과");
		persons[3] = new Professor("김명룡", 45, "charlie@example.com", "13265872", "문헌정보학과");
		persons[4] = new Professor("이덕임", 50, "diana@example.com", "23456789", "컴퓨터공학과");
		
		for (Person person : persons) {
			person.show();
		}
	}

}
