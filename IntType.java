
public class IntType {
	public static void main(String[] args) {
		int i;
		long l = 99999L*99999L;
		i = (int)l;
		System.out.println(Integer.toBinaryString(i)); // Integer Ŭ������ toBinaryString �޼ҵ�� �Ƹ� ���ڸ� �������� ���ڿ��� ǥ���ϴ� ����� ������.
		System.out.println(Long.toBinaryString(l)); // long���� int������ �� ū ���ڸ� ǥ�� ����
		System.out.println("i = " + i + "\n" + "l = " + l); // ��°���� i,l �״�� ������ �� ���� �������� �Ͻ��� �����ε�. �׸��� int ���� 14��(?)���� ǥ�õǴ� ��.
		
		float f = 1.0f/3.0f;
		double d = 1.0/3.0; // java ���� �Ҽ��� default �ڷ����� double ��. ���� ������ó�� float �� �ڷ����� ��Ÿ������, float �� ĳ������ ����� �Ѵ�.
		System.out.println("f = " + f + "\n" + "d = " + d);
	}
}
