
public class Ex22_WideningTypeConversion {
	public static void main(String[] args) {
		short s=1; int i; long l;
		float f; double d;
		
		i=s; l=i;
		System.out.println("s = " + s + " , i = " + i + " , l = " + l);
		f = l; d = f;
		// ���� �Ѱ� ���� ���� ���� ���� �Ѱ� ���� ���� ������ �ڵ����� ��ȯ
		System.out.println("f = " + f + " , d = " + d);
	}
}
