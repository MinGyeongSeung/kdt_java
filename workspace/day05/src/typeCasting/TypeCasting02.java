package typeCasting;
//3번 : 문자열 자료형 -> 다른 기본 자료형으로
public class TypeCasting02 {

	public static void main(String[] args) {
			//기본자료형 -> 문자열 자료형
			String str1 = 3 + ""; // 3를 문자열로 선언
			String str2 = 6.17 + ""; // 6.17를 문자열로 선언
			String str3 = 'a' + ""; // a를 문자열로 선언
			String str4 = true + ""; // true를 문자열로 선언
			
			System.out.println(str1); // 문자열 3 출력
			System.out.println(str2); // 문자열 6.17 출력
			System.out.println(str3); // 문자열 a 출력
			System.out.println(str4); // 문자열 true 출력
			
			//문자열 -> 기본자료형으로
			int number1 = Integer.parseInt(str1); // 문자열 str1을 int 정수로 변환
			System.out.println(number1); // 정수 3 출력
			double number2 = Double.parseDouble(str2); // 문자열 str2을 number 실수로 변환
			System.out.println(number2); // 실수 6.17 출력
			boolean isTrue2 = Boolean.parseBoolean(str4); // 문자열 str4을 isTrue 논리형으로 변환
			System.out.println(!isTrue2); // 논리형 false 출력
			char ch = "Hello".charAt(4); //  char 변수 ch 선언 및 Hello 문자열에서 인덱스 4에 해당하는 문자를 가져옴
			System.out.println(ch); // Hello 4번째 문자 o 출력
	}
}
