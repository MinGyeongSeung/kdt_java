package homework15_민경승;

//부모 클래스 상속
public class Employee extends Person {

	//부모 클래스 상속
	public Employee(String name, int age, String birth) {
		//super 이용하여 부모클래스 생성자 호출
		super(name, age, birth);
	}
	
	// 메소드 : work() 업무를 처리중입니다 출력
	public void work() {
		System.out.println("업무를 처리중입니다.");
	}

	// 메소드 오버라이딩 : 저의 이름은 이고 회사원입니다 출력
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("저의 이름은 " + getName() + " 이고 회사원 입니다.");
	}
}
