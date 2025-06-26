package review;
// 과제1 : 금액과 곡 당 가격을 입력받아 부를 수 있는 곡 수와 잔돈 계산
import java.util.Scanner;
public class SingTask01 {
	public static void main(String[] args) { //main 중괄호 시작 영역
		
		/*
		클래스명 : SingTask01
		1) 한 곡당 금액도 입력받기
		금액입력 : 1000
		곡 당 가격 입력 : 300
		[출력]
		3곡을 부를 수 있으며 잔돈은 100원 입니다

		2) 잔돈이 부족할 경우 안내하기
		금액입력 : 100
		곡 당 가격 입력 :
		 */
		
		//1) 입력클래스 import
		//2) 정수형변수 4개 선언
		//3) 금액 입력 메시지 출력
		//4) 변수1 nextInt() 입력받아 저장
		//5) 곡 당 입력 메시지 출력
		//6) 변수2 nextInt() 입력받아 저장
		//7) if ~ else문
			//if문 조건식 변수1 < 변수2{
			//입력한 금액과 부족한 금액 출력
			//}else문 {
			//변수3 변수1 / 변수2
			//변수4 변수1 % 변수2
			//부를 수 있는 곡수와, 잔돈 출력
			//}
		//8) 스캐너 닫기
		
		Scanner sc = new Scanner(System.in);
		int money = 0, price = 0, song = 0, change = 0;
		System.out.println("금액 입력 : ");
		money = sc.nextInt();
		System.out.println("곡 당 가격 입력 : ");
		price = sc.nextInt();
		if (money < price) {
			System.out.printf("입력한 금액은 %d원입니다. 한 곡당 가격은 %d원이므로 %d원이 부족합니다.", money, price, price-money);
		}else {
			song = money / price;
			change = money % price;
			System.out.printf("%d 곡을 부를 수 있으며 잔돈은 %d원입니다.", song, change);
		}
		
		/*
		//1) 로직구성
		//입력 클래스 import 선언
		Scanner sc = new Scanner(System.in);
		//메시지 "금액입력" 출력
		System.out.println("금액 입력 : ");
		//금액 price 선언후 입력
		int price = Integer.parseInt(sc.next());
		//메시지 "곡 당 가격" 출력
		System.out.println("곡 당 가격 : ");
		//곡 당 가격 price_c 선언후 입력
		int price_c = Integer.parseInt(sc.next());
		//정수형 singc 금액과 곡 당 가격 나누기
		int singc = price / price_c;
		//정수형 change 선언 후 singc 나머지 값 계산
		int change = price % price_c;
		//3곡을 부를 수 있으며 잔돈은 100원 입니다 출력
		System.out.println(singc + "곡을 부를 수 있으며," + " 잔돈은 " + change + "원 입니다");

		//if 문 작성하여 change < price 일때 "곡 당 가격은" price_c "입니다" 출력
		if(change < price) {
		System.out.println("\n곡 당 가격은 " + price_c + "원 입니다");
		}
		sc.close(); // Scanner 닫기
		*/
	} //main 중괄호 종료
}
