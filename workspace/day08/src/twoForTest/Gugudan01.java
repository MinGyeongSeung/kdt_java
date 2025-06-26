package twoForTest;
//1) 구구단 단별로 세로로 출력하기 Gugudan01
public class Gugudan01 {
	public static void main(String[] args) { // main 중괄호 시작

// for문 바깥쪽 중괄호 영역에 정수형 dan에 2입력(초기식), 2는 9보다 같거나 작으면 2에 +1 추가하는 증감식 작성
		for(int dan = 2; dan <= 9; dan++) {
// "dan 단" 출력
			System.out.println(dan + "단");
// for문 안쪽영역에 정수형 i에 1입력(초기식), 1은 9보다 같거나 작으면, 1에 +1 추가하는 증감식 작성
				for(int i = 1; i <= 9; i++) {
// "dan x i = 결과" 출력
					System.out.println(dan + "x" + i + "=" + (dan * i));
//for문 안쪽 종료
					}
// 빈줄출력
					System.out.println();
// for문 바깥쪽영역 종료
			}
// main 중괄호 종료
		}
	}


