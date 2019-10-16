class Static2 {
	void instanceMethod() {
		System.out.println("이 문장은 한번 출력됩니다.");
	}

	static void staticMethod() {
		System.out.println("이 문장은 두번 출력됩니다.");
	}

	void instanceMethod2() {
		instanceMethod();
		staticMethod();
	}

	static void staticMethod2() {
		// instanceMethod();
		// 클래스 메소드에는 클래스 메소드만이 호출 가능.
		staticMethod();
	}
}

public class Ex45_TestStatic2 {
	public static void main(String[] args) {
		Static2 st2 = new Static2();
		st2.instanceMethod2();
		st2.staticMethod2();
	}
}

// 클래스 메소드 안에서는 클래스 메소드와 클래스 변수만 사용 가능.
