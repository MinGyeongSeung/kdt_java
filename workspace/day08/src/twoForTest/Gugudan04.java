package twoForTest;
// while문으로 단마다 출력하기
public class Gugudan04 {
    public static void main(String[] args) { //main 중괄호 시작
        int i = 1; // 정수형 i선언 후 1 입력
        int danTitle = 2; // 정수형 danTitle 선언 후 2 입력
        
        while (danTitle <= 9) { // while문 선언 2가 9보다 작거나 같을시 
            System.out.print(danTitle + "단\t"); // while 중괄호 영역에 "2단\t" 출력 
            danTitle++; // 2에 +1 증감
        } // while 중괄로 영역 종료
        System.out.println(); // 빈줄출력

        while (i <= 9) { //while문으로 1이 9보다 작거나 같으면
            int dan = 2; // int dan선언 후 2 입력
            while (dan <= 9) { // while 중괄호 내에 내부 while문 추가하여 2가 9보다 작거나 같으면
                System.out.print(dan + " x " + i + " = " + (dan * i) + "\t"); // "2 x 1 = (2 * 1)\t 출력"
                dan++; // dan(2) 증감
            } //내부 중괄호 while 종료
            System.out.println(); //외부 중괄호 내에 빈줄 추가
            i++; // i(1)에 증감 
        } //외부 중괄호 종료
    } //main 중괄호 종료
}