class Box1 {
	int width;
	int height;
	int depth;
	long idNum;
	static long boxID = 100;

	static long getcurrentID() { // Ŭ���� �޼ҵ�� Ŭ���� ������ ���
		return boxID++;
	}
}

public class Ex46_StaticMethodDemo {
	public static void main(String args[]) {
		Box1 mybox1 = new Box1();
		mybox1.idNum = Box1.getcurrentID(); // Ŭ���� ���� ���Ͽ� �޼ҵ� ���
		Box1 mybox2 = new Box1();
		mybox2.idNum = Box1.getcurrentID();
		System.out.println("mybox1�� id ��ȣ : " + mybox1.idNum);
		System.out.println("mybox2�� id ��ȣ : " + mybox2.idNum);
		System.out.println("���� �ڽ��� ��ȣ�� " + Box1.boxID + "�� �Դϴ�.");
	}
}
