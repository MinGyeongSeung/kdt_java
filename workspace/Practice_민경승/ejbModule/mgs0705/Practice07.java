package mgs0705;
// 조건문
import java.util.Scanner;
// 4. 두 숫자 중 큰 값 출력
public class Practice07 {
	public static void main(String[] args) {
//		두 개의 숫자를 입력받아서 더 큰 수를 출력하세요. 두 수가 같으면 "같습니다"라고 출력합니다.
//		입력
//		숫자1: 23
//		숫자2: 45
//		출력
//		더 큰 수는 45입니다.
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요");
		num1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("더 큰 수는 " + num1 + "입니다.");
		} else if(num1 < num2) {
			System.out.println("더 큰 수는 " + num2 + "입니다.");
		} else {
			System.out.println("같습니다");
		}
			
		sc.close();
	}
}
