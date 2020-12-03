package com.javaex.ex02;

public class Duck extends Bird {
	private String name;
   
	
	//2.하지만 상속관계에서만 읽을 수 있게하기위함이다.
	public String getName() {
		return super.getName();
	}
	
	//1.딱히 안전한 방법으로 보이진 않는다 
	public void setName(String name) {
		super.setName(name);
	}

	public void sing() {
    System.out.println("오리("+getName()+")가 소리내어 웁니다.");
    }

    public void fly() {
    	System.out.println("오리("+getName()+")가 날지 않습니다");
    
    }
    
    public void showName() {
    System.out.println("오리의 이름은"+getName()+" 입니다.");
    }

}
