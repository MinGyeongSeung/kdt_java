package mgs0706;
// 제어문
import java.util.Scanner;
// 3. 로그인 시스템 만들기
public class Practice01 {
	public static void main(String[] args) {
//[입력 예시]
//아이디 입력: admin  
//비밀번호 입력: 1234

//[출력 예시]
//로그인 성공!
//[입력 예시]
//아이디 입력: admin  
//비밀번호 입력: 0000

//[출력 예시]
//로그인 실패
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		System.out.println("비밀번호를 입력하세요");
		int num = sc.nextInt();
		
		if(id.equals("admin") && num == 1234) { //.equals() → 문자열 비교
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패");			
		}
	}
}
