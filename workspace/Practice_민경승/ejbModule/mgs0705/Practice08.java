package mgs0705;
//조건문
import java.util.Scanner;
// 5. 세 개의 수를 입력받아 가장 큰 수를 출력하기
public class Practice08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("첫 번째 숫자를 입력하세요");
		num1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요");
		num2 = sc.nextInt();
		System.out.println("세 번째 숫자를 입력하세요");
		num3 = sc.nextInt();
		
		int max = num1; // 처음엔 num1이 가장 크다고 가정
		 
		if (num1 == num2 && num2 == num3) {
			System.out.println("세 숫자 모두 같습니다" + num1);
		} else {
		 
		if (num2 > max) {
			max = num2;
		} 
		if (num3 > max) {
			max = num3;
		} 
		System.out.println("가장 큰 수는 " + max + " 입니다.");
		}
		
		if ((num1 == max && num2 == max) || (num1 == max && num3 == max) || (num2 == max && num3 == max)) {
			System.out.println(" 가장 큰 숫자가 둘 이상입니다");
		}
		
		sc.close();
	}
}

