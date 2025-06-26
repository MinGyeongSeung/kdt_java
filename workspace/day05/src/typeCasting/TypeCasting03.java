package typeCasting;
//4번 : 문자열과 다른 자료형과의 형변환
public class TypeCasting03 {
	public static void main(String[] args) {
		String data1 = "10"; // 문자형 String의 data1를 10 으로 선언한다
		String data2 = "abc"; // 문자형 String의 data2를 abc 으로 선언한다

		System.out.println(data1 + 1); // 문자열 + 1 => 연결
		System.out.println(data2); // 문자열 + 1 => 연결

		char alpha = data2.charAt(1); // 문자열 data2의 abc의 2번째 'b'를 변수형 char alpha로 선언
		System.out.println(alpha); // 변수형 b 출력
//		"True"
		boolean result1 = Boolean.parseBoolean("True"); // 논리형 result1 값 True로 선언 
		System.out.println(result1); // true 출력
		//문자열이 TRUE(대소문자 무관)이면 true를 반환하고, 그렇지 않으면 false를 반환
	}
}
