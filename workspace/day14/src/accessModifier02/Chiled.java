package accessModifier02;

import accessModifier01.Parents;
// 다른 패키지 다른 클래스(상속관계)
public class Chiled extends Parents {
	public void printAccess() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
//		System.out.println(defaultVar));
//		System.out.println(privateVar));
	}

}
