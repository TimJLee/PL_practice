
public class Ex25_ExplicitTypeConversion {
	public static void main(String[] args) {
		int x;
		float y, z;
		char c='A';
		x = 7 / 2; // int ������ �����̹Ƿ� ������� int �� ���ͼ� ������ �Ǵ� ��. 
		y = (float) 7 / 2; 
		z = 7 / 2;
		// �� ���� �ٸ� ���� ������ ������ ���� �ÿ� ���������� ū �Ѱ� ���� ����
		// ������ ��ȯ�Ǿ� ����
		System.out.println("x = " + x + " y = " + y + " z = " + z);
		c++;
		System.out.println("c = " + c);
	}
	/*
	  x = 3 y = 3.5 z = 3.0
	  c = B
	 */
}
