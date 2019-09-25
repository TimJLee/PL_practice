
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
		// 미세하게나마 전위연산자가 후위연산자보다 속도가 더 빠름.
	}
}
