
public class Ex20_AssignmentOperators {
	public static void main(String[] args) {
		int x,y=2;
		
		x = 10; x += y; System.out.println(" 1. x = "+ x);
		x = 10; x -= y; System.out.println(" 2. x = "+ x);
		x = 10; x *= y; System.out.println(" 3. x = "+ x);
		x = 10; x /= y; System.out.println(" 4. x = "+ x);
		x = 10; x%= y; System.out.println(" 5. x = "+ x);
		x = 10; x &=y; System.out.println(" 6. x = "+ x);
		x = 10; x |= y; System.out.println(" 7. x = "+ x);
		x = 10; x ^= y; System.out.println(" 8. x = "+ x);
		x = 10; x <<= y; System.out.println(" 9. x = "+ x);
		x = 10; x >>= y; System.out.println("10. x = "+ x);
		x = 10; x >>>= y; System.out.println("11. x = "+ x);
		// >>> �� unsigned �� �����ϸ鼭 ����Ʈ������ �ϰڴٴ� ����. ��, ��ȣ�� ������� �ϰڴ�...
		//��, 13���� ��� ������ ����Ʈ ������ �ؼ� ��� ������ signed �� ���� �޸� 1�� ä���� �ʰ� 0���� ä���� 
		//�ᱹ ������� ������ �Ǹ�, ��������� MSB�ΰ��� 0�̸� �������� 1�̰�, ������ �� ��Ʈ�� 1101 �̱� ������ ����غ���, �������� ���� �����ϰ� ������� �� �� ����.
		// ����, �������� ǥ�� �� ������, 2�� ������ Ȱ���ϸ� �̴� 1�� ������ 1�� ���� ���� ����. ������ �� ȸ�� å�� �����ϸ�, 2�� ������ ��ٷ� ���ϴ� ����� ����. ������� �ٽ� ����.
		// �׸��� int �� ������ 32��Ʈ�� ����� ����� 13���� ������ �� ����. ������ ������ 8��Ʈ�� �ص� ���� ����.
		x = -10; x >>= y; System.out.println("12. x = "+ x);
		x = -10; x >>>= y; System.out.println("13. x = "+ x); // ��������� >>> ������ ������ �� �ǿ����ڰ� �����϶� ������ �߻���. ����� ���� ����� ������ �� �� ����.
	}
}
