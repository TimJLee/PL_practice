
public class Ex21_CastOperator {
	public static void main(String[] args) {
		int i = 0xffff; //16진수 - 65535 - 2^16-1 => 111...11(16개 1) 따라서 short(2byte) 에서는 1이 꽉 찬것이므로 MSB 가 1로써 음수인 상황. 이때 111...1(16비트) 의 2의 보수는 -1임을 알 수 있음. 
		short s;
		
		s = (short) i;
		System.out.println("i = " + i);
		System.out.println("s = "+ s);
	}
}

