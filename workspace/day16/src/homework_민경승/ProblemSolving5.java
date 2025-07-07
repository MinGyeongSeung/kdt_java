package homework_민경승;

public class ProblemSolving5 {
	public static void main(String[] args) {
//	line = 4 → 삼각형의 높이 설정
//	line - i 만큼 " " 공백 출력 → 가운데 정렬을 위해 왼쪽 공백 추가
//	2 * i - 1 만큼 "*" 출력 → 홀수 개의 별을 찍어 삼각형 형태 생성
//	출력
		
	// 총 줄 수를 설정 (4줄)
	int line = 4;

	// 줄 수만큼 반복
	for (int i = 1; i <= line; i++) { 
		// 공백 출력 : 전체 줄 수 - 현재 줄 수 만큼 공백
		for (int j = 1; j <= line - i; j++) {
			System.out.print("a");
			}
		// 별 출력 (2 * 현재 줄 번호 - 1 만큼)
		for (int k = 1; k <= 2 * i - 1; k++) {
			System.out.print("*");
			}
		// 한 줄 끝나면 줄바꿈
			System.out.println();
		}
	}
}
