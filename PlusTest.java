
public class PlusTest {
	public static void main(String[] args) {
		short a,b,c;
		a=1;
		b=2;
		//c=a+b;
		//compile error - 연산시 자동으로 int로 promotion 이 일어남
		c = (short)(a+b);
		System.out.println(c);
	}
}
