
public class Ex26_AnotherBlock {
	public static void main(String[] args) {
		int x = 1;
		{ int y = 2;
		System.out.println("Block 1: x = " + x + ", y = " + y);
		}
		{ int y = 3;
		System.out.println("Block 2: x = " + x + ", y = " + y);
		}
	}
}
