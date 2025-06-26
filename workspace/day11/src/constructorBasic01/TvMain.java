package constructorBasic01;
//1번 : 생성자 기초
public class TvMain {
	public static void main(String[] args) {
		Tv myTv = new Tv();
		myTv.brand = "LG";
		myTv.color = "black";
		myTv.ch = 10; //초기 채널
		myTv.vol = 5; //초기 볼륨
		
		System.out.println(myTv.brand + " tv 를 조작합나다");
		myTv.nextChannel();
		myTv.powerOnOff();
		myTv.nextChannel();
		myTv.decreaseVolume();
		
		Tv myTv2 = new Tv();
		myTv.brand = "삼성";
		myTv.color = "red";
		myTv.ch = 100;
		myTv.vol = 50;
		System.out.println(myTv2.brand + " tv 를 조작합니다");
		System.out.println(myTv2.power);
		myTv2.previousChannel();
		myTv2.powerOnOff();
		myTv2.previousChannel();
	}
}
