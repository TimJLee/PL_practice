
public class CheckString {
	public static void main(String[] args) {
		String str1 = "�ȳ��ϼ���! PL ���θ� ������ �սô�.";
		String str2 = "hello world!";
		System.out.println("���ڿ� : " + str1);
		System.out.println("���ڿ��� ���� : " + str1.length());
		System.out.println("8��° ���� : " + str1.charAt(7));
		System.out.println("�ε��� 1 ���� 17������ substring : ");
		System.out.println(str1.substring(1,17));
		System.out.println("���� '��'�� �ε��� : " + str1.indexOf('��'));
		System.out.println("substring \"PL\"�� ���� �ε��� : ");
		System.out.println(str1.indexOf("PL"));
		System.out.println("\n���ڿ� : " + str2);
		System.out.println("���ڿ��� �빮�ڷ� : " + str2.toUpperCase());
	}
}
