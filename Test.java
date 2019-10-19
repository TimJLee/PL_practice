class C1{
	int method1(int x, int y) {
		System.out.println("C1-int return method");
		return (x | y) >>> 1;
	}
	double method1(int x, double y) {
		System.out.println("C1-double return method");
		return (x*y);
	}
}

class C2 extends C1 {
	int method1(int x, int y) {
		System.out.println("C2-int return method");
		return (x & y) << 2;
	}
}
public class Test {
	public static void main(String[] args) {
		C1 c1 = new C1();
		C2 c2 = new C2();
		
		int num = 10;
		switch ((num%2)==0 ? 1 : 2) {
		case 1:
			System.out.println(c1.method1(2,3/2));
		case 2:
			System.out.println(c2.method1(2,(double)3/2));
		}
	}
}

/*
 * 
 * C1-int return method
1 // 정수끼리의 연산이므로 자료형은 int 로 나오며, 소수점은 버림
C1-double return method
3.0
*/
