package homework_민경승;

import java.util.Scanner;

public class HomeWork6_16 {
	public static void main(String[] args) {
		
	//2차월 배열을 활용한 로또
	
	//당첨번호 리스트
	int[][] lotto = {{32,12,17,25,39,41}, {12,36,13,28,37,44}};
	
	//입력창 생성 후 출력 후 입력
	Scanner scan = new Scanner(System.in);
	String myNum = "";
	System.out.println("숫자 6개를 연속으로 입력하세요");
	myNum = scan.next();
	// boolean 타입 isWin 선언후 false, 당첨여부확인
	boolean isWin = false;
	
	//반복문 선언하여 배열 길이 증감식 작성
	for(int i = 0; i < lotto.length; i++) {
		String lottoNumber = "";
		// 
		for(int j = 0; j < lotto[i].length; j++) {
			lottoNumber += lotto[i][j];
		}
		
		if(myNum.equals(lottoNumber)) {
			isWin = true;
			break;
		}
	}
	
		if(isWin) {
			System.out.println(myNum + "번호 당첨");
		} else {
			System.out.println(myNum + "당첨되지 못했습니다");
			}
		scan.close();
	}
}
