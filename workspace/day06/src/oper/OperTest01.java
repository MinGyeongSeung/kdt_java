package oper;
//3번 : 관계연산자와 논리 연산자
public class OperTest01 {
	public static void main(String[] args) { //main 시작

		System.out.println("========= 관계 연산자 =========");
		
		int num1 = 10, num2 = 20, num3 = 10; // 정수형 num1, num2, num3에 값 입력
		System.out.println(num1 + ">" + num2 + " : " + (num1 > num2)); // 10>20 맞으면 true, 틀리면 false
		System.out.println(num1 + "<" + num2 + " : " + (num1 < num2)); // 10<20 맞으면 true, 틀리면 false
		System.out.println(num1 + ">=" + num2 + " : " + (num1 >= num2)); // 10>=20 맞으면 true, 틀리면 false
		System.out.println(num1 + "<=" + num2 + " : " + (num1 <= num2)); // 10<=20 맞으면 true, 틀리면 false
		System.out.println(num1 + "==" + num2 + " : " + (num1 == num2)); // 10==20 맞으면 true, 틀리면 false
		System.out.println(num1 + "!>" + num2 + " : " + (num1 != num2)); // 10!>20 맞으면 true, 틀리면 false
		System.out.println(num1 + "==" + num2 + " : " + (num1 == num3)); // 10==20 맞으면 true, 틀리면 false
		
//		System.out.println(10 >= 10);
		
		System.out.println("\n========논리 연산자 ========");
		System.out.println("and : 둘 다 참이면 참(&&)");
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false
		
		System.out.println("\nor : 둘 중 하나라도 참이면 참(||)");
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		System.out.println(false || false); //false

		System.out.println("\nnot : 참이면 거짓, 거짓이면 참(!)");
		System.out.println(!true); //false
		System.out.println(!false); //true
		

		
		
	} // main 끝
}
