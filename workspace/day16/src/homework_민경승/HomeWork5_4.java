package homework_민경승;

public class HomeWork5_4 {
	public static void main(String[] args) {
		
		// 변수 선언
		int num = 6;
		
		// 공백생성
		for (int i = 0; i <= 4; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
		for (int k = num; k >= 0; k--) {
			System.out.print("*");
		}
		num = num - 2;
		System.out.println();
		}
	}
}
