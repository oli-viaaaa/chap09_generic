package com.javalab.generic.pkg05;

/*
 * 제네릭 메소드를 사용하는 실행클래스
 * 
 * 제네릭 메소드 boxing()
 * 	- 맨 앞의 <T> : 타입 파라미터
 * 	- Box<T> : 반환타입
 * 	- boxing(T t) : 메소드명(파라미터)
 */

public class GenericExample {

	// 제네릭 메소드 Boxing()
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box; // 제네릭 객체(Integer 객체를 갖고 있는)
	}

	// main 메소드
	public static void main(String[] args) {

		Box<Integer> box1 = boxing(100); // 제네릭 메소드
		int intValue = box1.get();
		System.out.println(intValue);

		// 제네릭 메소드 호출
		Box<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
