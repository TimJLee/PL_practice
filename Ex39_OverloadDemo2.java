
class Overload2 {
void test() {
System.out.println("�Ű����� ����");
}
void test(int a, int b) {
System.out.println("�Ű����� int " + a
+ "�� int " + b);
}
void test(double a) {
System.out.println("�Ű����� double " + a);
}
//�����ε� - �Ű����� ���� �ٸ�. 
}

public class Ex39_OverloadDemo2 {
	public static void main(String args[]) {
		Overload2 ob = new Overload2();
		int i = 88;
		ob.test();
		ob.test(10, 20);
		ob.test(i);
		//double�� �Ƹ� 8byte �̹Ƿ� ( int 4byte)
		// �ڵ�����ȯ�� ���� void test(double a)�� ����
		ob.test(123.2);
		}
}
