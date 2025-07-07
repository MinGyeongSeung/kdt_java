package mgs0705;
// 조건문
import java.util.Scanner;
// 1. 짝수/홀수 판별기
public class Practice04 {
	public static void main(String[] args) {
		
//	사용자로부터 정수를 입력받아서 짝수인지 홀수인지 출력하세요.
//	[입력 예시]
//	숫자를 입력하세요: 7
//	[출력 예시]
//	7은 홀수입니다.
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		num = sc.nextInt();
		
		if(num % 2 == 0 ) {
			System.out.println(num + "은 짝수입니다");
		} else {
			System.out.println(num + "은 홀수입니다");
		}
	}
}
