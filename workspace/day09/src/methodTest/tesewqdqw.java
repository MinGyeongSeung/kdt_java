package methodTest;

import java.util.Scanner;

public class tesewqdqw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

