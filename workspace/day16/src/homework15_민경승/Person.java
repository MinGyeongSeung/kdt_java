package homework15_민경승;

public class Person {
	
	
	// 공통필드 생성
	private String name;
	private int age;
	private String birth;
	
	// 이름, 나이, 생일 생성자 생성
	public Person(String name, int age, String birth) {
		this.name = name;
		this.age = age;
		this.birth = birth;
	}

	// private 필드는 getter(alt + shift + s + r) 단축키로 메소드 만들어야 함 
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String birTh() {
		return birth;
	}
	
	
	// 메소드 : introduce() 이름, 나이입니다 출력
	public void introduce() {
		System.out.println("이름: " + name + ", 나이: " + age + "살 입니다." + "생년월일은 " + birth + " 입니다.");
	}
	
}
