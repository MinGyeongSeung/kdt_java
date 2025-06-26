package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		//사용자로부터 입력받은 숫자가 1부터 10까지의 숫자인 경우에만 해당 숫자의 제곱을 출력하고
		//그 외 숫자를 입력시에는 잘못 입력했습니다 출력하기
		
		/*로직구성
		입력 클래스 import 선언
		정수형 변수
		숫자를 입력하세요 출력
		정수형 변수 입력 메소드
		if 조건식 1 <= 변수 && 변수 <= 10, 0 < 변수 && 변수 < 11
			//) 변수 * 변수 출력
		else
			잘못입력했습니다 출력
		sc.close
		*/
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("1부터 10 사이의 숫자만 입력하세요");
		num = sc.nextInt();
		if (1 <= num && num < 11) {
			System.out.println(num * num);
			System.out.println(num * 2);
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		// 문자열끼리의 비교는 관계연산자(==)를 사용하지 않고
		//.equals() 메소드를 사용해서 비교한다!!
		System.out.println("문자열 1 입력 : ");
		String data1 = sc.nextLine();
		System.out.println("문자열 2 입력 : ");
		String data2 = sc.nextLine();
		System.out.println(data1 == data2);
		System.out.println(data1.equals(data2)); //true
		if(data1.equals(data2)) {
	         System.out.println("두 문자열 같습니다");
	      }else {
	         System.out.println("두 문자열은 같지 않습니다");
	      }
		
		
		sc.close();
	}
}
