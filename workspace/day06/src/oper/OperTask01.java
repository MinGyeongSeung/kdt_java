package oper;

import java.util.Scanner;

//4번 : ~논리연산자까지 복습문제
public class OperTask01 {
	public static void main(String[] args) {
		
		
		//사용자가 입력한 값 2개를 서로 비교하기
		//nextInt() 사용, 변수를 먼저 만들고 진행할 것!
		//변수 만들 때 의미있는 문자로 사용
		//로직구성부터!
		
		
		// 모니터 개수와 키보드 개수 비교하기
		// 입력클래스 import
		// 정수형 변수 2개 선언
		// 입력 메시지 출력(숫자 2개를 입력(띄어쓰기로) : )
		// 변수 입력메소드 사용 nextInt() 사용하여 모니터 갯수 입력
		// 텍스트 출력(3개)
		//+)sc.close();
		

		Scanner sc =new Scanner(System.in);
		/*
		int num1, num2;
		System.out.println("숫자 2개를 띄어쓰기로 구분하여 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println(num1 + "<" + num2 + " : " + (num1 < num2));
		System.out.println(num1 + ">" + num2 + " : " + (num1 > num2));
		System.out.println(num1 + ">" + num2 + " || " + num1 + "==" + num2 + " : " + (num1 > num2 || num1 == num2 ));

		
		
		
		System.out.println("모니터 갯수 입력 : ");
		int moniter = Integer.parseInt(sc.next());
		System.out.println("마우스 갯수 입력 : ");
		int mouse = Integer.parseInt(sc.next());
		
		System.out.println("========= 관계 연산자 =========");
		
		System.out.println(moniter + ">" + mouse + " : " + (moniter > mouse));
		System.out.println(moniter + "<" + mouse + " : " + (moniter < mouse));
		System.out.println(moniter + ">=" + mouse + " : " + (moniter >= mouse));
		System.out.println(moniter + "<=" + mouse + " : " + (moniter <= mouse));
		System.out.println(moniter + "==" + mouse + " : " + (moniter == mouse));
		System.out.println(moniter + "!>" + mouse + " : " + (moniter != mouse));
		System.out.println(moniter + "==" + mouse + " : " + (moniter == mouse));
		
		sc.close();
		*/
		//실수 관계연산자 사용
		double num3, num4;
		System.out.println("실수 2개를 띄어쓰기로 구분하여 입력하세요 : ");
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		System.out.println(num3 + " < " + num4 + " : " + (num3 < num4));
// 		0.00000001 0.00000000001
//		0.0E-8 < 1.0E-11 : false
//		1.0E-8 10의 -8제곱(소수점아래 8자리)
//		1.0E-11 10의 -11제곱(소수점아래 11자리)
		

	}

}
