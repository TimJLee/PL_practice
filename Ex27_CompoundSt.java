
public class Ex27_CompoundSt {
	public static void main(String[] args) throws java.io.IOException {
		int n;
		System.out.print("Enter one digit = ");
		n = System.in.read() - '0';
		if (n < 0)
		System.out.println("Negative number !");
		else {
		System.out.println(n + " squared is "+ (n*n));
		System.out.println(n + " cubed is "+(n*n*n));
		}
		
	}
}
