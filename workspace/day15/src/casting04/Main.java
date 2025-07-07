package casting04;

public class Main {
	public static void main(String[] args) {
		
		//업캐스팅
		Hero ironMan = new IronMan("아이언맨");
		ironMan.superPower(); // 오버라인 된 메소드가 호출
	
		Hero hulk = new Hulk("혈크");
		hulk.superPower();
		
		//다운캐스팅
		IronMan ironMan2 = (IronMan) ironMan;
		System.out.println(((Hulk)hulk));
	}
}
