package print;

public class EscapeCharacte {
//7번 : 이스케이프 문자
	public static void main(String[] args) {
		//이스케이프문자는 문자열 안에서 \를 이용해 작성한다
		// "\n" "\t" "\'" "\"" "\\" 를 표현한다
		
		//줄바꿈 : \n
		System.out.println("안녕하세요. \n4일차 수업중입니다.\n");
		System.out.println("지금은\n이스케이프 문자\n배우는 중입니다.");
		
		// 탭 간격 : \t
		System.out.println("이름 : 민경승, 나이 : 34");
		System.out.println("이름 : 민경승,\t나이 : 34");
		System.out.println("자바는 정말 재미없다. 자바 2일차... ㅠㅠ");
		System.out.println("자바는 정말 재미없다.\t\t자바 2일차... ㅠㅠ");
		
		
		//문자열 안에서 작은따옴표, 큰 따옴표 표현 : \', \"
		System.out.println("오늘 날씨는 \"흐림\"입니다.");
		System.out.println("오늘 날씨는 \'비\'가 옵니다.");
		
		//역슬래쉬 : \\
		System.out.println("워크스페이스 경로는 D:\\web_0900_mgs입니다");
		
		//복합사용
		System.out.println("문자열 안에서 다양한 제어문자를 표현 할 수 있다.\n\"\\n\"을 쓰면 줄바꿈이 된다"
				+ "\n\t '\\t\'을 쓰면 탭키가 적용된다");
	}

}
