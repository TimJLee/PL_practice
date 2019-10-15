
class Overload2 {
void test() {
System.out.println("매개변수 없음");
}
void test(int a, int b) {
System.out.println("매개변수 int " + a
+ "와 int " + b);
}
void test(double a) {
System.out.println("매개변수 double " + a);
}
//오버로딩 - 매개변수 갯수 다름. 
}

public class Ex39_OverloadDemo2 {
	public static void main(String args[]) {
		Overload2 ob = new Overload2();
		int i = 88;
		ob.test();
		ob.test(10, 20);
		ob.test(i);
		//double은 아마 8byte 이므로 ( int 4byte)
		// 자동형변환을 거쳐 void test(double a)를 실행
		ob.test(123.2);
		}
}
