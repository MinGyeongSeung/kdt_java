package karaoke;

import java.util.Scanner;

// 과제 4
public class SingTask03 {
	public static void main(String[] args) { //main 중괄호 시작 영역
		
		/*
		클래스명 : SingTask03
		총 부른 곡 수에 따른 보너스 곡 지급
		5곡을 부르면 1곡 추가 제공
		 */

		//로직 설계
		//1) Scanner 선언
		//2) 금액 입력 출력 및 생성
		//3) 상수 곡당 200원 선언
		//4) 총 부를 수 있는 곡 작성
		//5) 잔돈 작성
		//6) 총 부른 곡 수가 5 이상이면 보너스 곡 1곡 추가 작성
		//7) 출력

		Scanner sc = new Scanner(System.in); // 입력 클래스 import 선언
		
		System.out.println("금액을 넣어주세요 : "); // "금액을 넣어주세요 : " 출력
		int money = sc.nextInt(); // 금액 입력
		final int SONG_PRISE = 200; // 상수 곡 가격 SONG_PRISE 선언 후 200원 값 입력
		
		int song_Count = money / SONG_PRISE; // 금액에 곡 가격 나눈 song_Count 선언
		int change = money % SONG_PRISE; // 금액에 곡 가격 나누고 나머지값 change 선언
		
		if(song_Count >= 5) { // if문 부를 수 있는 곡을 5이상이면 
			song_Count += 1; // 보너스 곡 1곡 추가 생성
			System.out.println("보너스 1곡 추가 되었습니다"); // "보너스 1곡 추가 되었습니다" 출력
		}
		
        System.out.println("총 부를 수 있는 곡 수는 " + song_Count + "곡 입니다."); // "총 부를 수 있는 곡 수는 song_Count 곡 입니다." 출력
        System.out.println("잔돈은 " + change + "원 입니다."); // "잔돈은 change 원 입니다" 출력

		sc.close(); // Scanner 닫기	
	} //main 중괄호 종료
}
