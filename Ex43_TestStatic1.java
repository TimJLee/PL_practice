class Static1{
	int instanceVariable = 10;
	static int classVariable = 20;
	void instanceMethod() {
		System.out.println(instanceVariable);
		System.out.println(classVariable);
	}
	static void staticMethod() {
		//System.out.println(instanceVariable);
		//Ŭ���� �޼ҵ忡�� Ŭ���� ����(static)���� ��� ����
		//�Ƹ� static �� �޸𸮿� ���� �ö���� ������, ���� �ö������ ���� instance ����
		//����ϴ� ���� ��Ҽ���.
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
