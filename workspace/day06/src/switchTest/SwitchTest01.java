package switchTest;
//14번 : switch문
public class SwitchTest01 {
	public static void main(String[] args) { //main 중괄호 시작 영역

		String animal = "고양이"; // 문자열 animal 선언 후 고양익 입력
		
//		switch ("강아지") {
//		case "고양이":
//			System.out.println("선택한 동물은 고양이입니다");
//			break;
//		case "강아지":
//			System.out.println("선택한 동물은 강아지입니다");
//			break;
//		case "호랑이":
//			System.out.println("선택한 동물은 호랑이입니다");
//			break;
//		default:
//			System.out.println("선택한 동물이 없습니다");
//			break;
//		}
		
		switch (10) { // switch문 값 입력
		case 10: // 값이 10이면
			System.out.println("10입니다"); // "10입니다" 출력
			break; // 종료
		case 100: // 값이 100이면
			System.out.println("100입니다"); // "100입니다" 출력
			break; // 종료
		case 50: // 값이 50이면
			System.out.println("50입니다"); // "50입니다" 출력
			break; // 종료
		default: // 그 외에 값이면
			System.out.println("case에 값이 없습니다");  // "case에 값이 없습니다" 출력
			break; // 종료
		}
		
		
		
	} //main 중괄호 종료 영역
}
