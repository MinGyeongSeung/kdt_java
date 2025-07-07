package mgs0705;
// 조건문
import java.util.Scanner;
//2. 시험 합격/불합격
public class Practice05 {
	public static void main(String[] args) {
		
//	점수를 입력받아서 60점 이상이면 합격, 아니면 불합격으로 출력하세요.
//	[입력 예시]
//	점수 입력: 75
//	[출력 예시]
//	합격입니다.
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("점수를 입력하세요.");
	num = sc.nextInt();
	
	if(num >= 60) {
		System.out.println("합격입니다.");
	} else {
		System.out.println("불합격입니다.");
	}
	sc.close();
 }
}
