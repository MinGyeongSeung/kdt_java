package homework_민경승;

public class ProblemSolving6 {
	public static void main(String[] args) {
	
		int line = 4; // 삼각형의 높이 (출력할 줄 수)

		// 줄 수만큼 반복
		for (int i = 1; i <= line; i++) {
			// 공백 출력 (줄 번호 - 1 만큼 출력)
			for (int j = 1; j < i; j++) {
				System.out.print("w");
			}
			// 별 출력 (2 * (남은 줄 수) - 1 만큼 출력)
			for (int k = 1; k <= (2 * (line - i + 1)) - 1; k++) {
				System.out.print("*");
			}
			// 줄 바꿈
			System.out.println();
        }
	}
}
