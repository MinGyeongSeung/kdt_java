package mgs0705;

public class Practice03 {
	public static void main(String[] args) {
        
		int num = 1; // 시작 숫자

        for (int i = 0; i < 4; i++) { // 총 4줄
            if (i % 2 == 0) {
                // 짝수 줄: 오름차순 출력
                for (int j = 0; j < 5; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            } else {
                // 홀수 줄: 미리 5개 숫자 증가해 둔 뒤 내림차순 출력
                num += 4; // 5개 중 마지막 숫자로 이동

                for (int j = 0; j < 5; j++) {
                    System.out.print(num - j + " ");
                }

                num += 1; // 다음 줄을 위해 다시 +1
            }

            System.out.println(); // 줄 바꿈
        }
		
		
	}
}
