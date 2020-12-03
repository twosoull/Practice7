package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {
		//abstract이기 때문에 메모리에 올릴 수없다
		//abstract를 없애던가 인스턴스화를 안하는게 답일것인데
		//Ractangl에도 draw가 없으니 빼주는게 좋을듯하다
		Shape s = new Shape("빨강");
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		((Ractangle)sr1).setWidth(12);
		((Ractangle)sr1).setHeight(10);
		//또는 가로의 값을 합해주는 메소드를 쓸수도있지만
		//굳이 sater가 있으므로 그럴 필요는 없겠다.
		((Ractangle)sr1).showInfo();
		
		
		//sr1의 가로크기 출력
		
		//두가지 방법이있다
		//둘다 다운캐스팅이지만 하나는 그냥 멤버변수를 가져오는 방법
		//System.out.println("sr12의 가로는 "+((Ractangle)sr1).getWidth()+" 입니다.");
		
		//메소드를 만들어 가져오는 방법도있다.
		System.out.println("sr1"+((Ractangle)sr1).showWidth());
	}
}

	
	