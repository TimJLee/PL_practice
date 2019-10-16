class Box {
	int width;
	int height;
	int depth;
	long idNum;
	static long boxID = 0;
	// static �̱� ������ , ��ü�� 4���� �����ص� boxID�� �����ϰ� �ȴ�. �� �װ��� ��ü�� ����
	// �� ��, 4���� ������ �ƴ϶� �ϳ��� �޸� ������ �����ϰ� �ȴ�. 
	public Box() {
		idNum = boxID++;
	}
}
public class Ex44_StaticDemo {
	public static void main(String args[]) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		Box mybox3 = new Box();
		Box mybox4 = new Box();
		System.out.println("mybox1�� id ��ȣ : " + mybox1.idNum);
		System.out.println("mybox2�� id ��ȣ : " + mybox2.idNum);
		System.out.println("mybox3�� id ��ȣ : " + mybox3.idNum);
		System.out.println("mybox4�� id ��ȣ : " + mybox4.idNum);
		System.out.println("��ü �ڽ��� ������ "+ Box.boxID + "�Դϴ�.");
		}
}
/*
mybox1�� id ��ȣ : 0
mybox2�� id ��ȣ : 1
mybox3�� id ��ȣ : 2
mybox4�� id ��ȣ : 3
��ü �ڽ��� ������ 4�Դϴ�.
*/
