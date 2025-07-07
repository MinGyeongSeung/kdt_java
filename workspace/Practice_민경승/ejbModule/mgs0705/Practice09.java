package mgs0705;
// 제어문
import java.util.Scanner;
// 1. 구구단 출력
public class Practice09 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("출력할 단을 입력하세요: ");
	int dan;
	dan = sc.nextInt();
	
	for(int i = 1; i <= 9; i++) {
		System.out.println(dan + " * " + i + " = " + (dan * i) );
	}
	sc.close();
	}
}
