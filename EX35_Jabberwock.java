
public class EX35_Jabberwock {
	// �Ʒ��� 4���� ������ ������ Ư���� ��Ÿ����.
	String color; //������ ����
	String sex; //������ ����
	String animal; //������ �̸�
	boolean hungry; //������ �Ļ�����
	void feedJabberwock() { //������ �Ļ������� �����ϴ� �޼ҵ�
	if (hungry == true) {
	System.out.println("Yum -- a Hambuger!");
	hungry = false;
	} else
	System.out.println("No, thanks -- already ate.");
	}
	void showAttributes() { //������ ���¸� ��Ÿ���� �޼ҵ�
	System.out.println("This is a " + sex + " " + color + " "
	+animal+".");
	if (hungry == true)
	System.out.println("The " +animal+" is hungry.");
	else
	System.out.println("The "+animal+ " is full.");
	}
	public static void main (String arguments[]) {
	EX35_Jabberwock dog = new EX35_Jabberwock(); //��ü����� Ȱ��ȭ
	EX35_Jabberwock cat= new EX35_Jabberwock();
	dog.color = "orange"; //dog�̶�� ��ü�� Ư���� ����
	dog.sex = "male";
	dog.animal="dog";
	dog.hungry = true;
	cat.color="white"; //cat�̶�� ��ü�� Ư���� ����
	cat.sex="female";
	cat.animal="cat";
	cat.hungry = false;
	System.out.println("Calling showAttributes ...");
	dog.showAttributes(); //dog�� ���¸� ǥ���ϴ� �޼ҵ�ȣ��
	System.out.println("-----");
	System.out.println("Feeding the dog ...");
	dog.feedJabberwock(); //dog�� �Ļ������� �����ϴ� �޼ҵ� ȣ��
	System.out.println("-----");
	System.out.println("Calling showAttributes ...");
	dog.showAttributes(); //dog�� ���¸� ǥ���ϴ� �޼ҵ� ȣ��
	System.out.println("-----");
	System.out.println("Feeding the dog ...");
	dog.feedJabberwock(); //dog�� �Ļ������� �����ϴ� �޼ҵ� ȣ��
	System.out.println("Calling showAttributes ...");
	cat.showAttributes(); //cat�� ���¸� ǥ���ϴ� �޼ҵ� ȣ��
	System.out.println("-----");
	System.out.println("Feeding the cat ...");
	cat.feedJabberwock(); //cat�� �Ļ������� ǥ���ϴ� �޼ҵ� ȣ��
	System.out.println("-----");
	System.out.println("Calling showAttributes ...");
	cat.showAttributes(); //cat�� ���¸� ǥ���ϴ� �޼ҵ� ȣ��
	System.out.println("-----");
	System.out.println("Feeding the cat ...");
	cat.feedJabberwock(); //cat�� �Ļ������� ǥ���ϴ� �޼ҵ� ȣ��
	}
	}
