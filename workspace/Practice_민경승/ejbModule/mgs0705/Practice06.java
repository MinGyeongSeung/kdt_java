package mgs0705;
// 조건문
import java.util.Scanner;
// 3. 나이로 구분하기
public class Practice06 {
	public static void main(String[] args) {
//		사용자의 나이를 입력받아 아래 기준으로 출력하세요.
//
//		나이	출력 내용
//		0~12	어린이입니다
//		13~18	청소년입니다
//		19~64	성인입니다
//		65 이상	노인입니다
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		num = sc.nextInt();
		
		if(num <= 12) {
			System.out.println("어린이 입니다");
		}else if(num <= 18) {
			System.out.println("청소년 입니다");
		}else if(num <= 64) {
			System.out.println("성인입니다");
		}else  {
			System.out.println("노인입니다");
		}
		sc.close();
	}
}
