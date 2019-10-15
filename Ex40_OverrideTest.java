
class Java{
	String teacher = "방혜자 교수님";
	public void print(String className) {
		System.out.println(teacher + "의 " + className);
	}
}
class PL extends Java{
	@Override // 이 키워드 붙이는 걸 추천함. 상위 클래스의 equals() 클래스를 쓸 때 이 키워드를 쓰지 않고,
			// 
	public void print(String className){
		System.out.println(teacher + "의 " + className);
	}
	// 오버라이딩은 오버로딩과 달리 함수의 매개변수를 완전히 똑같이 해야함.
}
public class Ex40_OverrideTest {
	public static void main(String[] args){
		String class_1 = "Java 수업";
		String class_2 = "PL 수업";
		Java j = new Java();
		PL p = new PL();
		j.print(class_1);
		p.print(class_2);
		System.out.println("===================");
		Java jp = new PL(); // 다형성. 반대는 안되는 걸로 앎.
		// 자식 클래스가 부모 클래스에 비해 더 광범위 하므로... int double 과 비유해서 이해하는 것도 괜찮은 방법인듯
		jp.print(class_2);
		}
}
