
public class IntType {
	public static void main(String[] args) {
		int i;
		long l = 99999L*99999L;
		i = (int)l;
		System.out.println(Integer.toBinaryString(i)); // Integer 클래스의 toBinaryString 메소드는 아마 숫자를 이진수의 문자열로 표현하는 기능을 가진듯.
		System.out.println(Long.toBinaryString(l)); // long형이 int형보다 더 큰 숫자를 표현 가능
		System.out.println("i = " + i + "\n" + "l = " + l); // 출력결과로 i,l 그대로 나오는 거 보니 위에꺼는 일시적 변경인듯. 그리고 int 역시 14억(?)정도 표시되는 듯.
		
		float f = 1.0f/3.0f;
		double d = 1.0/3.0; // java 에서 소수의 default 자료형은 double 임. 따라서 위에서처럼 float 로 자료형을 나타내려면, float 로 캐스팅을 해줘야 한다.
		System.out.println("f = " + f + "\n" + "d = " + d);
	}
}
