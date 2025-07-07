package homework15_민경승;

// 부모 클래스 상속
public class Student extends Person {

	// 필드 : boolean stu
	private boolean stu;
	
	// 부모 클래스 상속 받아 자식클래스에서 부모 생성자를 호출해야 함
	public Student(String name, int age, String birth, boolean stu) {
		super(name, age, birth);
		//자식클래스 필드 생성자 생성
		this.stu = stu;
	}
	
	// 메소드 : study() 이름이 공부합니다 출력
	public void study() {
		System.out.println(getName() + "이/가 공부합니다");
	}

	// 메소드 오버라이딩 : 이름은 학생입니다 출력
	@Override
	public void introduce() {
		super.introduce();
		System.out.println(getName() + "은/는 학생입니다.");
	}
	
	
 



	
	
	
	

}
