package com.javaex.ex03;

public interface Soundable {

    public String sound();
    
//    public static void printSound( Soundable soundable ) {
//        //구현
//    	System.out.println(soundable.sound());
    
    //메인클래스의 이 메소드에 들어가는 그 sound()의 값이 캣 클래스에서 오버라이딩된
    //sound(); 메소드가 된다
    //그러므로 메인메소드에서
    
//    public static void main(String[] args) {
//        
//    	//인스턴스 객체를 사용하면 "야옹"이든 "멍멍"이든 나오는 곳이다
//    	printSound( new Cat() );
    //이렇게 입력했다면 다시말해 Soundable soundable = new Cat();
    //라는 식이되니 오버라이딩된 "야옹" 이 불러와진다.
    
}
