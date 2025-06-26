package ifTest;
// 13번 : if~if문, if~else if문 차이 / if문 중첩
public class ifTest04 {
	public static void main(String[] args) { //main 중괄호 시작 영역
		//if~if문 : 위의 조건식이 true라도 아래 if문의 조건식을 확인한다
		int num = 10, grade = 100; // 정수형 num, grade 선언 후 값 입력
		if(num > 5) { // if 문으로 5보다 크면
			System.out.println("num은 5보다 큼니다"); // "num은 5보다 큼니다" 출력
		}
		if(num > 3) { // if 문으로 3보다 작으면
			System.out.println("num은 3보다 큼니다"); // "num은 3보다 큼니다" 출력
		}
		
		//if~elde if문 : 위의 조건식이 true면 아래 있는 조건식은 무시된다
		if(num > 5) { // if문으로 5보다 크면
			System.out.println("num은 5보다 큽니다"); // "num은 5보다 큽니다" 출력
		}else if(num > 3) { // else if 문으로 5보다 크면
			System.out.println("num은 3보다 큼니다"); // "num은 3보다 큼니다" 출력
		}
		
		//if문 중첩
		//90점 이상은 A, 100점은 만점으로 A 출력
		if(grade == 100) { // if문으로 grade가 100이랑 같거나
		}else if(grade >= 90) { // grade가 90보다 크거나 같으면
			System.out.println("A"); // "A" 출력
		}
		
		if(grade >= 90) { // if문으로 grade가 90보다 크거나 같거나
			if(grade == 100) { //grade가 100 과같으면
				System.out.println("만점으로 A"); // "만점으로 A" 출력
			}else{ // 그외에는
				System.out.println("A"); // "A" 출력
			}
		}
	} //main 중괄호 종료
}
