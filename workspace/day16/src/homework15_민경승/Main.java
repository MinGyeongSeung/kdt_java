package homework15_민경승;

public class Main {
	
	//static 메소드(printInfo()) 실행
	public static void printInfo(Person p) {
		//introduce() 메소드 실행
		p.introduce();
		
		// 객체 간 타입 비교(instanceof)
		// if문 활용하여 p(person)이 학생(Student)이면
		if (p instanceof Student) {
			//소괄호 활용하여 Down Casting 후 study()메소드 실행
			((Student) p).study();
		// else if 문 활용하여 p(person)이 선생(Teacher)이면
		} else if(p instanceof Teacher) {
			//소괄호 활용하여 Down Casting 후 teach()메소드 실행
			((Teacher) p).teach();
		// else if 문 활용하여 p(person)이 선생(Teacher)이면
		} else if(p instanceof Employee) {
			//소괄호 활용하여 Down Casting 후 work()메소드 실행
			((Employee) p).work();
		}
	}
		
	//main 메소드 실행
	public static void main(String[] args) {
		Person s = new Student("홍길동", 12, "20120101", true);
		Person t = new Teacher("김선생", 20, "20050101");
		Person e = new Employee("민경승", 34, "19921212");
		
		//내용 출력
        // introduce 메소드 직접 실행 (오버라이딩된 메소드가 실행됨)
        s.introduce();
        t.introduce();
        e.introduce();

        System.out.println();
        // printInfo 호출 시, 실제 객체 타입에 따라 적절한 메소드 실행됨 (다형성)
        printInfo(s);
        System.out.println();

        printInfo(t);
        System.out.println();

        printInfo(e);

		
		/*
		※main 메소드 실행하는건 잘 몰라서 구글 도움을 받았습니다 ㅠㅠ※
		
		※개념설명
		printInfo()라는 static 메소드를 통해, 전달된 Person 타입 객체에 따라 다르게 동작
		각 객체가 Student, Teacher, Employee일 경우, 해당하는 전용 메소드를 다운캐스팅 후 호출
		 */
		
	}
}
