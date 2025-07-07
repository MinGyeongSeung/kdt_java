package mgs01;

public class Practice01 {
	public static void main(String[] args) {

		      
		      for(int k=2;k<=9;k++) {
		         System.out.print("제 "+k+"단	"); // 단 이름
		      }                                  
		      System.out.println(); // 없으면 구구단으로 줄바꿈이 되지 않음
		            
		   for(int j=1;j<=9;j++) {
		      for(int i=2;i<=9;i++) {
		         System.out.print(i+"X"+j+"="+(i*j)+"	");
		      }
		      System.out.println(" ");
		   }
	}
}
