
public class Ex24_LowerToUpperConversion {
	public static void main(String[] args) throws java.io.IOException {
			char c;
			int x;
			System.out.print("Enter the lower char = ");
			c = (char) System.in.read(); // 숫자로 받아온 걸 명시적으로 char 로 형 변환
			if (c >= 'a' && c <= 'z')
			x = c + ('A' - 'a'); // 덧셈 뺄셈 연산자를 이용해서 소문자를 대문자로 변환. 
			else x = c;
			System.out.println("Upper char of "+ c + " = "+(char) x);
	}
}
