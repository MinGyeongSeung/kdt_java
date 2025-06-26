package scanner;

import java.util.Scanner;

//10번 : 입력 클래스, 입력 메소드 실습2
public class ScannerTask02 {
	public static void main(String[] args) {

		
		//1. 줄 단위로 입력받아 출력하기(입력은 반드시 3번, 출력은 1번만 사용)
		//입력1 : 자바는
		//입력2 : 객체지향
		//입력3 : 언어입니다
		//[출력]
		//자바는
		//객체지향
		//언어입니다
		
		//1) 입력클래스 import
		//2) 출력메시지1
		//3) 문자열 변수1 선언, next()
		//4) 출력메시지2
		//5) 문자열 변수2 선언, next()
		//6) 출력메시지3
		//7) 문자열 변수3 선언, next()
		//8) 출력 println import
		
		Scanner sc = new Scanner(System.in);
		
//	    System.out.print("입력1 : ");
//	    String str1 = sc.next();
//	    System.out.print("입력2 : ");
//	    String str2 = sc.next();
//	    System.out.print("입력3 : ");
//	    String str3 = sc.next();
//	    System.out.println(str1 + "\n" + str2 + "\n" + str3);
		
// 		↓내가 한거
//		String commend1, commend2, commend3;
//		System.out.println("입력1 :");
//		commend1 = sc.next();
//		System.out.println("입력2 :");
//		commend2 = sc.next();
//		System.out.println("입력3 :");
//		commend3 = sc.next();

//		System.out.printf( "%s %s %s",commend1, commend2, commend3);
		
		
		
		
		
		
		//2. 이름과 나이, 취미를 순서대로 입력받기(입력메소드 이름과 취미 nextLine()사용, 나이는 next()사용)
//		출력 시 printf 사용, 형변화 반드시 적용해서 출력할 것
		//이름입력 : 민경승
		//나이입력 : 34
		//취미입력 : 게임
		//[출력]
		//민경승은 34살이고 취미는 게임입니다.
		//민경승은 2026년에 35살 입니다.
		
		//1) 임력 클래스, import
		//2) 임력 메시지 출력
		System.out.println("이름입력 :");
		//3) String 변수 3개,
		String name, age, hobby;
		//4) name 변수 = nextLine()
		name = sc.nextLine();
		//5) 입력 메시지 출력
		System.out.printf("\n 나이입력 :");
		//6) age 변수 = next()
		age = sc.next();
		//7) 버퍼 비우기
		sc.nextLine();
		//8) 입력메시지 출력
		System.out.printf("\n 취미입력 :");
		//9) hobby 변수 = nextLine()
		hobby = sc.nextLine();
		//10) 결과 출력 printf(), 형변환 덧셈연산 후 출력
		System.out.printf("%s의 나이는 %d이고 취미는 %s입니다.", name, Integer.parseInt(age), hobby);
	    System.out.printf("%s는 2026년에 %d입니다", name, Integer.parseInt(age) + 1);
	    //11) Scanner 닫기
		sc.close();
	}
}
