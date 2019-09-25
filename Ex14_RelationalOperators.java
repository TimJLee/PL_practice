
public class Ex14_RelationalOperators {
	public static void main(String args[]) {
		int x=3,y=5,z=7;
		boolean f,t;
		
		f=x>y;
		t=x<y && y<z;
		System.out.println("f = " + f + ", t = " +t);
		
		f = x <= y;
		t = x >= y == y >= x;
		System.out.println("f = " + f + ", t = " + t);
	}
}
