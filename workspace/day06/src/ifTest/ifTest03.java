package ifTest;
//12번 : if ~ else if ~ else문
public class ifTest03 {
   public static void main(String[] args) { //main 중괄호 시작 영역
      //양수, 음수, 0인지 출력하기
      System.out.println("출력 시작"); //입력 클래스 import 선언
      
      int num = 17; // 정수형 변수 num 선언 후 값 입력
      
      if (num > 0) { // if문 num이 0보다 크면
         System.out.println("양수입니다"); // "양수입니다" 출력
      }else if (num < 0) { // else if문 num이 0보다 작으면
         System.out.println("음수입니다"); // "음수입니다" 출력
      }else { // else문 그 외에는
         System.out.println("0입니다"); // "0입니다" 출력
      }
      
      if (num > 5 && num < 15) { // if문 논리연산자로 num이 5보다 크거나, 15보다 작으면
         System.out.println("5보다 크거나 15보다 작습니다"); // "5보다 크거나 15보다 작습니다" 출력
      }else if (num < 5) { // else if문으로 num이 5보다 작으면
         System.out.println("5보다 작습니다"); // "5보다 작습니다" 출력
      }else{ // else 문으로 그 외에는
         System.out.println(num); // num 출력
      }
      
      System.out.println("출력 끝"); // "출력 끝" 출력
   } //main 중괄호 종료
}
