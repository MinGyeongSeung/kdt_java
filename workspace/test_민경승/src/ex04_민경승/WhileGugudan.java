package ex04_민경승;

public class WhileGugudan {
	public static void main(String[] args) {
		
//		문제 4. 구구단을 2단부터 9단까지 출력하세요. (20점)
//		- while문 이용(WhileGugudan) 로직구성 필요없음
		
//		for(int k = 2; k <= 9; k++) {
//		System.out.printf("[" + k + "]단" + "	");
//		}
//		
//		int[]i = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		int[]j = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		while(true) {
			for(int i = 1; i <= 9; i++) {
					System.out.println();
				for(int j = 2; j <= 9; j++) {
					System.out.printf(j + " * " + i + " = " + (i*j) + "	");
				}
			}break;
			
		}
		System.out.println();
		}
	}


//      int i = 1;
//      
//      while(i <= 9) {
//         int dan = 2; //단
//         while(dan <= 9) {
//            System.out.printf("%d x %d = %2d\t", dan, i, (dan * i));
//            dan++;
//         }
//         System.out.println();
//         i++;
//      }
//      
//      
//   }
//}





		

