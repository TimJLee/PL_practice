
public class Ex17_IncDecOperators {
	public static void main(String[] args) {
		int x=3,y=5;
		int a,b;
		
		++x; --y;
		System.out.println("x = " + x + " , y = " + y);
		
		a = (++x) + 1;
		System.out.println("x = " + x + " , a = " + a);
		
		b = (y++) + 1;
		System.out.println("y = " + y + " , b = " + b);
		// �̼��ϰԳ��� ���������ڰ� ���������ں��� �ӵ��� �� ����.
	}
}
