
public class Ex21_CastOperator {
	public static void main(String[] args) {
		int i = 0xffff; //16���� - 65535 - 2^16-1 => 111...11(16�� 1) ���� short(2byte) ������ 1�� �� �����̹Ƿ� MSB �� 1�ν� ������ ��Ȳ. �̶� 111...1(16��Ʈ) �� 2�� ������ -1���� �� �� ����. 
		short s;
		
		s = (short) i;
		System.out.println("i = " + i);
		System.out.println("s = "+ s);
	}
}

