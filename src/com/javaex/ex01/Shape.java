package com.javaex.ex01;

public class Shape {
	//abstract이기 때문에 메모리에 올릴 수없다
	//abstract를 없애던가 인스턴스화를 안하는게 답일것인데
	//Ractangl에도 draw가 없으니 빼주는게 좋을듯하다
	protected String fillColor;
	
	public Shape(String fillColor){
		this.fillColor=fillColor;
	}
	
	public void draw() {
		
	}
}


