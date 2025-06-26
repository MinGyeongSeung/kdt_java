package methodTest;

import java.util.Scanner;

public class MethodTask02 {
    public static void main(String[] args) { 
        MethodTask02 task = new MethodTask02();
        
        //1. 정수1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
        System.out.println("========1번=========");
        System.out.println(task.checkNum(8)); // 매개변수o, 리턴값o => syso(객체명.메소드명(인수))

        //2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
        System.out.println("========2번=========");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 정수형 배열 선언 후 10칸에 정수값 입력
        System.out.println(task.getSum(arr)); // 매개변수, 리턴값 받게되면 syso(객체명(task).메소드명(getSum)((arr)정수));
        
        System.out.println("========3번=========");
        //3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
        System.out.println(task.reverseStr("Black")); // 매개변수, 리턴값 받게되면 syso(객체명(task).메소드명(reverseStr)(("hello")문자열));
        
        System.out.println("========4번=========");
        //4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
        System.out.println(task.contains(arr, 11)); // 매개변수, 리턴값 받게되면 syso(객체명(task).메소드명(contains)((arr)정수, (10)인수));

        System.out.println("========5번=========");
        //5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력하는 메소드
        task.printGugudan(3); // 리턴타입 void로 객체명(task), 메소드명(printGugudan)((10)인수));

        System.out.println("========6번=========");
        //6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
        System.out.println(task.compareLength("java", "code")); // 매개변수, 리턴값 받게되면 syso(객체명(task).메소드명(compareLength)(("java")문자열, ("code")문자열));

//        System.out.println("========7번=========");
//        //7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
//        task.loginTry("admin", "1234"); // 리턴타입 void로 객체명(task), 메소드명(loginTry)(("admin")문자열, ("12345")문자열));
//        task.loginTry("admin", "12345"); // 리턴타입 void로 객체명(task), 메소드명(loginTry)(("admin")문자열, ("12345")문자열));
//        task.loginTry("admin", "1234"); // 리턴타입 void로 객체명(task), 메소드명(loginTry)(("admin")문자열, ("12345")문자열));
//        task.loginTry("admin", "12345"); // 리턴타입 void로 객체명(task), 메소드명(loginTry)(("admin")문자열, ("12345")문자열));
    }
    //1. 정수1개를 받아서 짝수입니다, 홀수입니다를 반환하는 메소드
    //메소드명 : checkNum
    //1) 기능
    //2) 리턴타입 => void
    //3) 메소드명 => checkNum
    //4) 매개변수 => 정수형 변수1개
    //5) 실행할문장 =>  삼항연산자
    //6) return => return 매개변수 % 2 == 0 ? "짝수입니다" : "홀수입니다"
    //7) 리턴타입 변경 => String
    public String checkNum(int num) { //리턴타입 String, 메소드명 checkNum, 매개변수 정수형 1개
        return (num % 2 == 0) ? "짝수입니다" : "홀수입니다"; // return (매개변수 % 2 == 0)-> true이면 짝수 false면 홀수
    }

    //2. 10칸짜리 정수 배열을 받아 총합을 계산하여 반환하는 메소드
    // 메소드명 : getSum
    //1) 리턴타입 => void
    //2) 메소드명 => getSum
    //3) 매개변수 => int[] 매개변수명
    //4) 실행할문장(기능 구현) =>
    //		총합구할변수 선언
    //		for-each문(자료형 변수명 : 배열명) {
    //			총합구할변수 += 변수명;
    //		{
    //5)	return 총합구할변수
    //6) 리턴타입 => int
    
    public int getSum(int[] arr) {//리턴타입 int, 메소드명 getSum, 매개변수 정수형 배열
        int sum = 0; // 정수형 sum(총합) 선언 후 0값 입력
        for (int num : arr) { // for문으로 int num선언 후 num arr 참거짓
            sum += num; // 총합 += num;
        }
        return sum; // return 값 반납
    }
  
    //3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
    //메소드명 : reverseStr
    // hello => olleh
    
    //1) char[]을 이용한 방식
    //리턴타입 => void
    //메소드명 => reverseStr1
    //매개변수 => String 1개
    //실행할문장 =>
    //   조건식(if문)   매개변수 == null
    //         { return; }
    //   int 변수1 = 매개변수명.length();
    //   문자형배열 변수2 = new char[변수1];
    //   반복문(for문) int i = 0; i < 변수1; i++
    //   {   변수1[i] = 매개변수.charAt(변수1 - 1 - i); }
    //return => 문자열변수 
    
    //매개변수 o, 리턴값 x 메소드 정의
    String resverseStr1(String str) {
//       if(str == null) {
//          return null;
//       }
       int len = str.length();
       char[] reverse = new char[len];
       String result = "";
       for(int i = 0; i < len; i++) {
          reverse[i] = str.charAt(len - 1 - i);
       }
       return new String(reverse);
    }
    
    //2) 뒤에서부터 문자를 하나씩 더해서 새로운 문자열 만드는 방식
    // 리턴타입 => void
    // 메소드명 => reverseStr2
    // 매개변수 => String str
    // 실행할 문장 => 
    //   조건문 if(str == null){ return null; }
    //   문자열 변수 선언
    //  반복문(for문) int i = str.length() -1; i >= 0; i-- 
    //      { 변수 += str.charAt(i); }
    // return => 변수
    // 리턴타입 변경 => String
    
    String reverseStr2(String str) {
       if(str == null) {
          return null;
       }
       String result ="";
       for(int i = str.length() - 1; i >= 0; i--) {
          result += str.charAt(i);
       }
       return result;
    }
    
    //3) char[] 새로 만들어서 앞뒤 바꿔서 복사하는 방식
    // 리턴타입 => void
    // 메소드명 => reverseStr3
    // 매개변수 => String str
    // 실행할 문장(기능구현)
    //      조건문if   str ==null {return null;}
    //      정수형 변수1 = str.length();
    //      문자형배열 변수2 = new char[변수1];
    //      반복문for문 int i = 0; i < 변수1; i++
    //      {   변수2 = str.charAt(변수1 - 1 - i); }
    //      String 변수3 = ""
    //      for-each
    //      for(char 변수 : 변수2){
    //         변수3 += 변수;
    //      }
    //   리턴타입 변수3; String타입으로 변경
    String reverseStr3(String str) {
       if(str == null) {
          return null;
       }
       
       int len = str.length();
       char[] reverse = new char[len];
       
       for(int i = 0; i < len; i++) {
          reverse[i] = str.charAt(len - 1 - i);
       }
       String result= "";
       for(char c : reverse) {
          result += c;
       }
       return result;
    }
    
//    //4) 메소드를 이용하는 방식
//    public static String reverseStr(String str) {
//        return new StringBuilder(str).reverse().toString();
//    }
    
    public String reverseStr(String str) { //리턴타입 String, 메소드명 reverseStr, 매개변수 문자열 1개
        char[] chars = str.toCharArray(); // 문자형 chars 배열선언 후 
        String result = ""; // 문자열 result 선언 후 "" 입력
        for (int i = chars.length - 1; i >= 0; i--) { // 정수형 i 선언후 초기식 i = chars 문자열 길이 - 1, i가 0보다 크거나 같으면 i 감소
            result += chars[i]; // result chars[i]에 ++
        }
        return result; // return 값 반납
    }
    
    //4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
    //메소드명 : contains
    //배열 요소 중에 10이라는 값을 반드시 넣고 10을 매개변수로 전달
    //   syso(메소드명(배열명, 10)) => true
    
    // 리턴타입 => void -> boolean
    // 메소드명 => contains
    // 매개변수 => 정수형배열 1개, 정수형변수 1개
    // 구현부{
    //      if(매개변수1 == null){
    //         return false; }
    //      for(정수형 변수 : 배열명){
    //         조건문(if문) 변수 == 정수형변수 {
    //            return true;
    //         }
    //      }
    //      return false;
    //   }
    
    boolean contains(int[] arr, int num) {
       if(arr == null) {
          return false;
       }
       for(int i : arr) {
          if(i == num) {
             return true;
          }
       }
       return false;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public boolean contains(int[] arr, int value) { //리턴타입 boolean, 메소드명 contains, 매개변수 정수형 배열 1개, 정수형 1개
//        for (int num : arr) { //for-each문으로 요소의 int 타입 변수형 num : arr 배열
//            if (num == value) { // if문으로 int 타입 변수형 요소에 대한 작업 수행, num값이 value 값과 일치하면
//                return true; // return 값 true 반납
//            }
//        }
//        return false; // value 값과 일치하지 않으면 false
//    }
    //5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력하는 메소드
    public void printGugudan(int dan) { //리턴타입 void, 메소드명 printGugudan, 매개변수 정수형 1개
        for (int i = 1; i <= 19; i++) { // for문으로 int형 i 선언 후 값 1 입력, i(1)이 19보다 작거나 같으면, 증감
            System.out.println(dan + " x " + i + " = " + (dan * i)); // dan값 입력하면 19값보다 작거나 같으면, dan "X" i = (dan * 1)
        }
    }
    //6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름 반환하는 메소드
    public String compareLength(String str1, String str2) { //리턴타입 String, 메소드명 compareLength, 매개변수 문자열 2개
        return (str1.length() == str2.length()) ? "같음" : "다름"; // str1, str2 문자열이 같으면 true로 "같음" false면 "다름"
    }
    
    
    //메소드 밖에서 클래스 안에 변수 선언
    //7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금 반환
    //loginTry
    //리턴타입 => void => String
    //메소드명 =>  loginTry
    //매개변수 => 문자열 2개
    //구현부 => 
    //      고정값 id, pw 선언(상수)
    //      횟수 확인할 변수1 선언
    //      if문 변수1 >= 3
    //         return 계정잠금
    //      if문 상수id.equals(매개변수id) && 상수pw.equals(매개변수pw)
    //         변수1 초기화
    //         return 로그인 성공
    //      else{
    //         변수1++
    //         if(변수1 >= 3){
    //         return 계정잠금}
    //      return 로그인실패
    //      }
    //}}
    
    //메소드 밖에서 클래스 안에 변수 선언
//    int tryCount = 0;
//    
//    String loginTry(String inputId, String inputPw) {
//       final String ID = "admin";
//       final String PW = "1234";
//       System.out.println(tryCount + "번");
//       if(tryCount >= 3) {
//          return "계정잠금";
//       }
//       if(ID.equals(inputId) && PW.equals(inputPw)) {
//          tryCount = 0;
//          return "로그인 성공";
//       }else {
//          if(tryCount >= 3) {
//             return "계정잠금";
//          }
//          tryCount++;
//          System.out.println(tryCount);
//          return "로그인실패";
//       }
//    }
    
    
    
    

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    int tryCount = 0;
    String id, passwd, result;
    Scanner sc = new Scanner(System.in);
    
    while(true) {
       System.out.println("아이디 입력 : ");
       id = sc.nextLine();
       System.out.println("비밀번호 입력 : ");
       passwd = sc.nextLine();
       
       result = mt.loginTry1(id, passwd);
       
       if(result.equals("로그인 성공")) {
          System.out.println("로그인 성공");
          break;
       }else {
          tryCount++;
          if(tryCount >= 3) {
             System.out.println("3회 이상 실패로 계정 잠금");
             break;
          }
          System.out.println("로그인 실패");
       }
    }
}
}

      
    
  


