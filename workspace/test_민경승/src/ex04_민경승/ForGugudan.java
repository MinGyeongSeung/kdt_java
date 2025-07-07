package ex04_민경승;

public class ForGugudan {
	public static void main(String[] args) {
		
//		문제 4. 구구단을 2단부터 9단까지 출력하세요. (20점)
//		- for문 이용 (ForGugudan) 로직구성 필요없음
		
		
//		for(int k = 2; k <= 9; k++) {
//			System.out.printf("[" + k + "]단" + "		");
//
//		}
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf(j + " * " + i + " = " + (i*j) + "	");
			}
			System.out.println();
		}
	}

}
