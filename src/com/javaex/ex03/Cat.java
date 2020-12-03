package com.javaex.ex03;

public class Cat implements Soundable {
	
	public String sound() {
		return "야옹";
	}
	//인터페이스에서 같은 메소드를 사용했다
	//하지만 인터페이스의 기본 디폴트 메소드는
	//public String sound(); 이지만 실은
	//public abstract String sound(); 로 abstract가 숨겨져있다.(그래서 써도 에러가안남)
	//여튼 추상클래스에서도 말했듯 오버라이딩해서 써야되는 것이다 여기서 야옹을 리턴값으로
	//주고나서 -->Soundable 인터페이스에서 계속 설명
}
