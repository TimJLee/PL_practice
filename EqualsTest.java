
public class EqualsTest {
	public static void main(String[] args) {
		String str1, str2;
		str1 = "������б�����б�";
		str2 = str1; // �������� �Ͼ. �ּҸ� ������. �ּҰ� ���� ��. 
		System.out.println("String1 : " + str1);
		System.out.println("String2 : " + str2);
		System.out.println("Same object? " + (str1 == str2));
		str2 = new String(str1); // ���������Ͼ. �� ��ü�� ������. ���ο� ��ü �����ϰ� �Ǹ� ������ ������ �ּҰ� �ٸ��� ��. �ڹٺ���
		System.out.println("String1 : " + str1);
		System.out.println("String2 : " + str2);
		System.out.println("Same object?" + (str1 == str2));
		System.out.println("Same value?" + str1.equals(str2));
	}
}
