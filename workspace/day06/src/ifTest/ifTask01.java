package ifTest;

import java.util.Scanner;

//11번 : if~else문 실습1
public class ifTask01 {
	public static void main(String[] args) { //main 중괄호 시작 영역
		
		//1. 사용자로부터 숫자를 입력받아서 짝수인지 홀수인지 출력하기
		
		// 로직구성
		//1) 입력클래스 import 생성
		//2) 정수형 변수 선언
		//3) 입력 메시지 출력
		//4) 변수 입력메소드 사용
		//5) 조건문 (if ~ else)문
			//if 조건식 (산술연산자(%), 관계연산자(!=1))
			//	출력메소드
			//else
			//	출력메소드
		//6) 스캐너 닫기
		
		Scanner sc = new Scanner(System.in); //입력 클래스 import 선언
		int choice = 0; // 정수형 변수 choice 선언후 0 입력
		//자료형들의 기본값
		//정수 0, 실수 0.0, 문자형 ' ', 문자열 " " or null, 논리형 false
		System.out.println("숫자 1개 입력 : "); // "숫자 1개 입력 : " 출력
		choice = sc.nextInt(); // 숫자 입력
		if(choice % 2 == 0) { // if문에 숫자값에 2를 나눈 나머지 값이 0이면
			System.out.println("짝수입니다"); // "짝수입니다" 출력
		}else { // 아니면 else문에
			System.out.println("홀수입니다"); // "홀수입니다" 출력
		}
		sc.close(); // Scanner 닫기	
		
		//삼향연산자
		System.out.println((choice % 2 == 0) ? "짝수입니다" : "홀수입니다"); // 삼향연산자로 "짝수입니다" : "홀수입니다" 비교하며 출력
	} //main 중괄호 종료
}
