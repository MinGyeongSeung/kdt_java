package typeCasting;
//2번 : 다른자료형 -> 문자열로
// + "값"
public class TypeCasting01 {

	public static void main(String[] args) {
		int num1 = 10; // 정수 num1 에 10를 선언
		float num2 = 20.17f; // 정수 num2 에 20.17f를 선언
		long num3 = 30L; // 정수 num3 에 30L를 선언
		double num4 = 40.17; // 실수 num4 에 40.17를 선언
		boolean isTrue = true; // 문자열 isTrue에 true를 선언
		char alpha = 'a'; // 문자열 alpha에 a를 선언
		
		System.out.println(num1); // 10을 출력
		System.out.println(num2); // 20.17를 출력
		System.out.println(num3); // 30를 출력
		System.out.println(isTrue); // true를 출력
		System.out.println(alpha); // a를 출력
		
		System.out.println(num1 + num3); //정수 + 정수 = 정수
		System.out.println(num2 + num4); //실수 + 실수 = 실수
		System.out.println(num1 + num4); //정수 + 실수 = 실수
		
		String result1 = num1 + num3 + ""; //40
						//10 + 30 => 40 + "" => "40"
		String result2 = "" + num1 + num3; //1030
						//"10" + 30 => "1030"
		System.out.println(result1); // 10 + 30 => 40
		System.out.println(result2); // 문자열 먼저 생성되어 + 30 하면 1030
		System.out.println(isTrue + ""); // true 문자열로 생성
		System.out.println(alpha + ""); // a 문자열로 생성
		
	}
}
