package mgs0705;
//제어문
import java.util.Scanner;
//2. 1부터 N까지의 합 구하기
public class Practice10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구할 숫자를 입력하세요");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <=num; i++) {
			sum += i; // sum = sum + i
		}
		
		System.out.println("1부터" + num + "까지의 합은" + sum + "입니다.");
	}
}
