class A2 {
  int i; 
  int j; 

  void setij(int x, int y) {
    i = x;
    j = y;
  }
}

class B2 extends A2 {
  int total;

  void sum() {
    total = i + j; 
  }
}

public class Ex49_Inheritance4 {
	public static void main(String args[]) {
	    B2 subOb = new B2();

	    subOb.setij(10, 12);  // Ŭ���� A2�κ��� ��ӵ� �޼ҵ�
	    subOb.sum();          // Ŭ���� B2�� �޼ҵ�
	    System.out.println("�μ��� �հ�� : " + subOb.total);
	  }
}
