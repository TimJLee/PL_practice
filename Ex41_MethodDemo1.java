//ĸ��ȭ�� ����� ������� ���� ���. 42���� ���ϱ�(�� ���� ���)
class Fruit1{
	int apple;
	int straw;
	int grapes; //���� private �� �ٿ�����.(���� �������� �ٶ����� ����� �ʿ���.)
	int sum;
	Fruit1(int apple, int straw, int grapes){
		this.apple=apple;
		this.straw=straw;
		this.grapes=grapes;
	}
	public int count() {
		sum=apple+straw+grapes;
		return sum;
	}
}
public class Ex41_MethodDemo1 {
	public static void main(String[] args) {
		int total;
		Fruit1 f1 = new Fruit1(30, 30, 30);
		total = f1.count();
		System.out.println("��ü f1�� �� ���� = " + total);
		System.out.println("��ü f1�� apple ���� = " + f1.apple);
		// ����� ������ �о� ���� ���� ��ü �Ӽ� ������ ���� ����
		// ��ü �Ӽ� ������ ���� ���� ����(f1.apple=90;)�� ���� �ִ�
		System.out.println("��ü f1�� straw ���� = " + f1.straw);
		System.out.println("��ü f1�� grapes ���� = " + f1.grapes);
		}
}
