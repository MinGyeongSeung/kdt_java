package twoForTest;
//2) 단별로 가로로 출력하기 Gugudan02
public class Gugudan02 {
// main 중괄호 시작
	public static void main(String[] args) {
// for문 바깥쪽 중괄호 영역에 정수형 i에 1 입력 (초기식)
// i가 9보다 작거나 같을 때까지 반복 (조건식)
// 반복마다 i에 +1을 추가 (증감식)
		for(int i = 1; i <= 9; i ++) {
// for문 안쪽 영역에 정수형 dan에 2 입력 (초기식)
// dan이 9보다 작거나 같을 때까지 반복 (조건식)
// 반복마다 dan에 +1을 추가 (증감식)
			for(int dan = 2; dan <= 9; dan ++) {
// print를 사용하여 dan x i = 결과 형식으로 출력하고,
// \t로 가로 정렬 유지
//				System.out.print(dan + "x" + i + "=" + (dan * i ) + "\t") ;
				System.out.printf("%d x %d = %2d\t", dan, i, dan * i) ;
// 안쪽 for문 종료
			}
// 줄 바꿈을 위한 println() 호출
			System.out.println();
// 바깥쪽 for문 종료
		}
// main 중괄호 종료
	}
}

