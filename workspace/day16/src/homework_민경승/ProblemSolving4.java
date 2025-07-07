package homework_민경승;

import java.util.Random;

public class ProblemSolving4 {
	public static void main(String[] args) {
        int count = 0;         // 반복 횟수
        int dice1, dice2;      // 두 주사위 변수

        while (true) {
            count++; // 횟수 증가

            // Math.random()을 사용하여 주사위 눈(1~6) 생성
            dice1 = (int)(Math.random() * 6) + 1;
            dice2 = (int)(Math.random() * 6) + 1;

            // 현재 주사위 눈 출력
            System.out.println(count + "번째 시도 → 주사위1: " + dice1 + ", 주사위2: " + dice2);

            // 두 주사위 눈이 같으면 종료
            if (dice1 == dice2) {
                System.out.println("두 주사위가 같은 값입니다! (" + dice1 + ")");
                System.out.println("총 시도 횟수: " + count + "회");
                break;
            }
        }
	}
}
