package accessModifier02;

import accessModifier01.AccessTarget;

public class SomeMain {
	public static void main(String[] args) {
		System.out.println("======= 다른 패키지 내 접근 =======");
		AccessTarget a1 = new AccessTarget(); //public 생성자
//		AccessTarget a2 = new AccessTarget("hello"); //protected 생성자
//		AccessTarget a3 = new AccessTarget(123); //default 생성자
//		AccessTarget a4 = new AccessTarget(3.14); // private 생성자
		
		a1.publicMethod();

	}
}
