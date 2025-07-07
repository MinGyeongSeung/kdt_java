package mgs0706;
// 메서드 호출
public class Practice06 {
	public static void main(String[] args) {
		// Calculator 클래스의 객체 생성
		Calculator calc = new Calculator();
		// 다른 클래스(Calculator)의 add 메서드 호출
		int result = calc.add(2, 2);
		
		System.out.println(result); // 출력
		
	}
}
