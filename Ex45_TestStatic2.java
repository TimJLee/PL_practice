class Static2 {
	void instanceMethod() {
		System.out.println("�� ������ �ѹ� ��µ˴ϴ�.");
	}

	static void staticMethod() {
		System.out.println("�� ������ �ι� ��µ˴ϴ�.");
	}

	void instanceMethod2() {
		instanceMethod();
		staticMethod();
	}

	static void staticMethod2() {
		// instanceMethod();
		// Ŭ���� �޼ҵ忡�� Ŭ���� �޼ҵ常�� ȣ�� ����.
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

// Ŭ���� �޼ҵ� �ȿ����� Ŭ���� �޼ҵ�� Ŭ���� ������ ��� ����.
