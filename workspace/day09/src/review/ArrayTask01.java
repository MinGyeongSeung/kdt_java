package review;

public class ArrayTask01 {
	public static void main(String[] args) {
		
		//1) 크기가 100인 배열 선언
		//2) for문 통해 100부터 1까지 값 저장
		//3) for문 배열 출력
		//4) for문 통해 100부터 1까지 값 저장
		//4) for문 배열 출력

		int[] arr = new int[100];
		System.out.println(arr);
		
		//값 저장하는 반복문
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 100 - i; // 100 - 0;
								// 100 - 1;
		}
		//값 출력하는 반복문
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	      }
	}
}
