package com.javaex.ex03;

public class SoundApp {

    public static void main(String[] args) {
      
    	//인스턴스 객체를 사용하면 "야옹"이든 "멍멍"이든 나오는 곳이다
    	printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }
    
    //스태틱으로 놓으면 애초에 메모리가 스태틱이 있는곳으로 빠지기에
    //새로 클래스를 인스턴스화 시키지 않아도 사용할 수가 있다
    

    								//Soundable을 자료형으로쓰고
    						//Soundable을 자료형으로 하는 참조변수
                //soundable이 들어가있다 그말인 즉슨
    			//만약 String name이라는 매개변수를 넣을 공간을 만들어줬다면
    //"이영훈"이런걸 넣었을 것이다 따라서 String name = "이영훈" 이 된다
    //그 뒤에 보통 this.name = name; 을쓰지않았나? 
    //this.name = "이영훈"; 과 같은 효과였다
    // 그럼 Soundable soundable 이라는 인터페이스자료형 참조변수에 무엇을 넣을까?
    // 섞어쓰기를 생각해보자 Shape a = new Circle() 이렇게 쓰지않았나?
    //이렇게 넣는 이유는 Soundable은 인터페이스이고 인터페이스는 자기자신이 데이터타입이
    //안된다는 이유도있고 뒤에 어떤 클래스를 인스턴스화 시키느냐에 따라서
    //인터페이스의 메소드가 오버라이딩 되는 것이다르다
    //한마디로 정리해서 Soundable soundable = new Cat(); 이렇게 들어갈수 있다는 것이다.
    //( Soundable을 Cat이 상속(구현)하고있기 떄문
    public static void printSound( Soundable soundable ) {
        //구현
    	
    	System.out.println(soundable.sound());
    					//soundable 매개변수로 들어간 soundable 자체가
    		//어떤 값이 들어가느냐따라 그 뒤에 값이 반영이 된다
    	//메인 메소드에서printSound( new Cat() ); 이렇게 작성했다면
    	//soundable 뒤에는 new Cat();이 기다리게 되는 것이다
    	//Soundable soundable = new Cat(); 이 되었고
    	//soundable.sound(); 메소드를 사용하면 되는데 이건
    	//캣 클래스에서 계속 설명하겠다
    	
    }
    
}


