package review;

public class Person {
   // alt + shift + a : 그리드 모드
   //필드
   private String name;
   private int age;
   private String birth;
   //생성자
   //생성자는 이름을 갖고 있는 생성자
   public Person(String name) {
      super();
      this.name = name;
   }
   
   //메소드
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public String getBirth() {
      return birth;
   }
   public void setBirth(String birth) {
      this.birth = birth;
   }
   public String getName() {
      return name;
   }
   
   void introduce() {
      System.out.println("이름은 " + this.name + 
            "이고, 나이는 " + this.age + "살입니다.");
   }
   
//   공통메소드 : introduce()   자식클래스에서는 오버라이딩
//   모든 필드는 private
//   생성자는 이름을 갖고 있는 생성자
//
//   Person 클래스
//   필드 : 이름, 나이, 생년월일(8자리)
//   메소드 : introduce() 이름, 나이입니다 출력
//

//
//   Teacher 클래스
//   필드 : x
//   메소드 : teach()
//      이름이 가르칩니다 출력
//   메소드 오버라이딩 : 저는 선생님입니다 출력
//
//   Employee 클래스
//   필드 : x
//   메소드 : work() 
//      업무를 처리중입니다 출력
//   메소드 오버라이딩 : 저의 이름은 이고 회사원입니다 출력
//
//   Main 클래스
//   static 메소드(printInfo())
//      객체 타입에 따라 다운 캐스팅하여 전용 메소드 실행
}
