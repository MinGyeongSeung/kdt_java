package review;
// 과제 3
import java.util.Scanner;
public class SingTask02 {
	public static void main(String[] args) { //main 중괄호 시작 영역
		
		/*
		클래스명 : SingTask02
		남은 금액으로 음료 구매 가능 여부 추가(한 곡당 금액 200원, 음료 금액은 100원)
		급액입력 : 1000
		[출력]
		5곡을 부를 수 있으며 잔돈은 0원 입니다
		음료를 마시고 싶으면 4곡을 부를 수 있으며 잔돈은 100원 입니다
		 */
		
		/*
		1️) Scanner 생성
		2) 금액 입력 출력 및 생성
		3) 곡당 금액 (200원), 음료 금액 (100원) 상수 선언
		4) 곡 수 = 금액 / 곡당 금액
		5) 잔돈 = 금액 % 곡당 금액
		6) 기본 출력 (곡 수, 잔돈)
		7) 음료를 마시는 경우, 음료 금액만큼 금액에서 차감
		8) 출력
		9) Scanner 닫기
		 */
		
		Scanner sc = new Scanner(System.in); //입력 클래스 import 선언
        System.out.print("금액 입력 : "); // "금액 입력 : " 출력
        int money = sc.nextInt();  // 금액 입력
        
		final int song_Price = 200; // 상수형 곡 금액 선언
		final int drink_Price = 100; // 음료 금액 선언
		
        // 노래만 부를 경우
        int songCount = money / song_Price;  // 금액에 곡 금액 나누는 songCount 선언
        int change = money % song_Price;     // 금액에 곡 금액 나누고 남은 값 change 선언
        System.out.println(songCount + "곡을 부를 수 있으며 잔돈은 " + change + "원 입니다");
        // " songCount 곡을 부를 수 있으며 잔돈은 change 원 입니다" 출력
		
        // 음료를 마시고 노래를 부를 경우 출력
		if (money >= drink_Price) { //if문 선언으로 금액이 음료값보다 같거나 크면
			int drink_pay = money - drink_Price; // 금액에 음료값 차감하는 drink_pay 선언
			int song_With_drink = drink_pay / song_Price; // 음료값 차감값에 곡 금액 나누는 song_With_drink 선언
			int change_Drink_pay = drink_pay % song_Price; // 음료값 차감값에 곡 금액 나누고 남은 값 change_Drink_pay 선언
			System.out.println("음료를 마시고 싶으면 " + song_With_drink + "곡을 부를 수 있으며, 잔돈은 " + change_Drink_pay + "원 입니다");
			// "음료를 마시고 싶으면 song_With_drink 곡을 부를 수 있으며, 잔돈은 change_Drink_pay 원입니다" 출력
		} else if (money < drink_Price) {
			System.out.println("금액이 부족합니다"); 
		}
		sc.close(); // Scanner 닫기
	} //main 중괄호 종료
}