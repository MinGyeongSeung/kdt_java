package mgs0706;
// 메서드
public class Practice07 {
	public static void main(String[] args) {
		
		Person p = new Person();
		for(int i = 0; i < 3; i++) {
			p.printHello();
		}
	}
}



class Person {
	void printHello() {
		System.out.println("Hello");
	}
	
}