
class Java{
	String teacher = "������ ������";
	public void print(String className) {
		System.out.println(teacher + "�� " + className);
	}
}
class PL extends Java{
	@Override // �� Ű���� ���̴� �� ��õ��. ���� Ŭ������ equals() Ŭ������ �� �� �� Ű���带 ���� �ʰ�,
			// 
	public void print(String className){
		System.out.println(teacher + "�� " + className);
	}
	// �������̵��� �����ε��� �޸� �Լ��� �Ű������� ������ �Ȱ��� �ؾ���.
}
public class Ex40_OverrideTest {
	public static void main(String[] args){
		String class_1 = "Java ����";
		String class_2 = "PL ����";
		Java j = new Java();
		PL p = new PL();
		j.print(class_1);
		p.print(class_2);
		System.out.println("===================");
		Java jp = new PL(); // ������. �ݴ�� �ȵǴ� �ɷ� ��.
		// �ڽ� Ŭ������ �θ� Ŭ������ ���� �� ������ �ϹǷ�... int double �� �����ؼ� �����ϴ� �͵� ������ ����ε�
		jp.print(class_2);
		}
}
