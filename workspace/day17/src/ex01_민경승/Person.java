package ex01_민경승;

public class Person {
//	   필드 : 이름, 나이(접근제한자 private)
//	   생성자 : 매개변수 모두 받는 생성자(접근제한자 public)
//	   점수계산메소드(접근제한자 public, 메소드명 score) => 점수가 없습니다 출력
	
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		age = 10;
		System.out.println(age);
	}

	public static void main(String[] args) {
		Person age = new Person();
	}
	
	
	
	
	
}
