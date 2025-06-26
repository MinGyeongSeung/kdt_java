package homework08;
//2. 1~10까지의 값을 배열에 넣고 총 합을 출력
public class ArrayTask02 {
	public static void main(String[] args) {
		
		// 어떤 값을 넣을 지 알면 바로 int[] ar1 배열 선언 후 10개의 값을 입력
		// while문 선언하여 [0] <= [9] 보다작으면 값을 더하는 반복문 출력 
		
		
		int[] ar1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			while(ar1[0] <= ar1[9]) {
				System.out.println(ar1[9]);
				break;
			}
		
		//	    System.out.println(ar1[0] + ar1[1] + ar1[2]+ ar1[3]+ ar1[4]+ ar1[5]+ ar1[6]+ ar1[7]+ ar1[8]+ ar1[9] );
		
	}
}
