
public class Ex24_LowerToUpperConversion {
	public static void main(String[] args) throws java.io.IOException {
			char c;
			int x;
			System.out.print("Enter the lower char = ");
			c = (char) System.in.read(); // ���ڷ� �޾ƿ� �� ��������� char �� �� ��ȯ
			if (c >= 'a' && c <= 'z')
			x = c + ('A' - 'a'); // ���� ���� �����ڸ� �̿��ؼ� �ҹ��ڸ� �빮�ڷ� ��ȯ. 
			else x = c;
			System.out.println("Upper char of "+ c + " = "+(char) x);
	}
}
