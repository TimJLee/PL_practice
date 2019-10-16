class Static1{
	int instanceVariable = 10;
	static int classVariable = 20;
	/*class 변수는 static 키워드가 붙은 변수이다.
	 * compile 시에 bytecode 로 변환이 되며 method 영여긍로 올라간다.
	 * 딱 하나의 메모리 공간만 잡히게 되며, 선언된 객체들은 그 하나의 공간에만 접근한다.
	 * 
	 * 
	 */
	void instanceMethod() {
		System.out.println(instanceVariable);
		System.out.println(classVariable);
	}
	static void staticMethod() {
		//System.out.println(instanceVariable);
		//클래스 메소드에는 클래스 변수(static)만이 사용 가능
		//아마 static 이 메모리에 먼저 올라오기 때문에, 아직 올라오지도 않은 instance 값을
		//출력하는 것은 어불성설.
		//조교님의 설명 : 인스턴스 변수는 객체가 만들어 져야지만 사용가능 하므로
		//static 함수 안에서 instance 변수를 사용하면 에러가 뜨는 것이다.
		System.out.println(classVariable);
	}
	// 객체 선언하지 않고 이름으로 바로 접근 가능.
}
public class Ex43_TestStatic1 {
	public static void main(String[] args) {
		Static1 st = new Static1();
		st.instanceMethod();
		st.staticMethod();
	}
}

