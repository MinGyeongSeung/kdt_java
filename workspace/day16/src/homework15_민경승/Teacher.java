package homework15_민경승;

//부모 클래스 상속
public class Teacher extends Person {
	
	// 부모클래스 상속받아 생성자 생성
	public Teacher(String name, int age, String birth) {
		//super 이용하여 부모클래스 생성자 호출
		super(name, age, birth);
	}
	
	// 메소드 : teach() 이름이 가르칩니다 출력
	public void teach() {
		System.out.println(this.getName() + " 이/가 가르칩니다");
	}

	// 메소드 오버라이딩 : 저는 선생님입니다 출력
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("저는 선생님 입니다.");
	}

}
