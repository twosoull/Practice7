package com.javaex.ex02;

public abstract class Bird {
	//필드
	//2가지 방법 프로텍티드로 제어자를 바꿔주고
	//자손메소드에서 super.name으로 받거나
	//private를 유지하면서 겟네임을 abstract로 사용하지않고
	//메소드내용으로 오버라이드 시키느냐
    private String name;
    
    //메소드 g/s
    //이름을 세팅하기 위해 사용했다
    public String getName() {
    	return name;
    }
  

	public void setName(String name) {
		this.name = name;
	}
	
	//메소드 일반
	public abstract void sing();

    public abstract void fly();
    
    public abstract void showName();
    



}
