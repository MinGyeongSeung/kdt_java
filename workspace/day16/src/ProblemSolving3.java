package homework_민경승;

public class ProblemSolving3 {
	public static void main(String[] args) {
		//1~100까지 반복
		for (int i = 1; i <= 100; i++) {
			// 2로 나누어 떨어지면 짝수
			if (i % 2 == 0) {
				//짝수 출력
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		//1~100까지 반복
		for (int i = 1; i <= 100; i++) {
			// 2로 나누어 안떨어지면 홀수
			if (i % 2 == 1) {
				//홀수 출력
				System.out.println(i);
			}
		}
	}

}
