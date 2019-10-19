class T{
	int a;
	static int num;
	static int b;
	static int c;
	
	void getNum(int n) {
		num=n;
	}
	
	static int binary() {
		num=(-num)>>>2;
		return num;
	}
}
public class testFortest {
	public static void main(String[] args) {
		int m;
		T a = new T();
		a.a = 127;
		a.b = 64;
		//T.b = 63;
		T.c = 121;
		m = (a.a > a.b) ? a.a : a.b;
		m = (m > a.c) ? m : a.c;
		
		a.getNum(m);
		
		System.out.println(Integer.toBinaryString(T.binary()));
	}
}
