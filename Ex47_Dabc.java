class A1 {
  int aa = 1;
}
class B1 extends A1 {
  int bb = 2;
}
class C1 extends B1 {
  int cc = 3;
}

public class Ex47_Dabc {
	public static void main(String[] args) {
	    C1 objc = new C1();
	    System.out.println("objc��ü�� ��ü�Ӽ����� aa�� ���� " + objc.aa);
	    System.out.println("objc��ü�� ��ü�Ӽ����� bb�� ���� " + objc.bb);
	    System.out.println("objc��ü�� ��ü�Ӽ����� cc�� ���� " + objc.cc);
	  }
}
