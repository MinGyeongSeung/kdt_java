package oper;

import java.util.Scanner;

public class OperTest02 {
	public static void main(String[] args) { //main 시작
	
		//조건식 ? 참일때의 값 : 거짓일때의값;
		//조건식은 반드시 boolean 결과를 반환해야한다(true, false)
		//사항 연산자는 값을 반환하므로 변수에 저장하거나 바로 출력할 수 있다
		
		System.out.println(true ? "참입니다" : "거짓입니다"); // true면 "참입니다" 출력
		System.out.println(false ? "참입니다" : "거짓입니다"); // false면 "거짓입니다" 출력
							//true
		System.out.println(10 > 5 ? "10이 더 큰수입니다" : "10이 큰수가 아닙니다"); // 10이 5보다 크면 "10이 더 큰수입니다" 출력
		System.out.println(10 > 5 && 10 == 5 ? "true입니다" : "false입니다"); // 10 > 5, 10 == 5 두 조건이 맞지 않아 "false 출력"
		
		int number = 1 < 2 ? 1 : -1; 
		System.out.println(number); // 1 < 2 → true → 1이 선택되어 number에 저장
		
		//정수 2개를 입력받아서 큰 수 구하기
		//입력클래스 import
		//입력 메시지 출력
		//정수형 변수 2개 선언
		//문자열 변수 1개 선언, 삼항연산자 대입
		//출력
		//sc.close
		
		Scanner sc = new Scanner(System.in); //입력 클래스 import 선언
		System.out.println("비교할 두 숫자를 입력하세요"); // "비교할 두 숫자를 입력하세요" 출력
		int num1 = sc.nextInt(); // num1 입력
		int num2 = sc.nextInt(); // num2 입력
		String result = num1 < num2 ? num2 + "가 큼니다" : num2 + "가 크지 않습니다";
		// 문자열 result에 num1이 num2보다 크면 "num2가 큼니다" 선언, false면 "num2 가 크지 않습니다" 선언
		System.out.println(num1 + "과 " + num2 + "비교 결과는 " + result);
		// "num1 과 num2 비교결과는 num1 출력"
				
				
				
		
		
	} //main 끝
}
