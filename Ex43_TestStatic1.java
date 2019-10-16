class Static1{
	int instanceVariable = 10;
	static int classVariable = 20;
	void instanceMethod() {
		System.out.println(instanceVariable);
		System.out.println(classVariable);
	}
	static void staticMethod() {
		//System.out.println(instanceVariable);
		//클래스 메소드에는 클래스 변수(static)만이 사용 가능
		//아마 static 이 메모리에 먼저 올라오기 때문에, 아직 올라오지도 않은 instance 값을
		//출력하는 것은 어불성설.
		System.out.println(classVariable);
	}
}
public class Ex43_TestStatic1 {
	public static void main(String[] args) {
		Static1 st = new Static1();
		st.instanceMethod();
		st.staticMethod();
	}
}
