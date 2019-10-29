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
	    System.out.println("objc객체의 객체속성변수 aa의 값은 " + objc.aa);
	    System.out.println("objc객체의 객체속성변수 bb의 값은 " + objc.bb);
	    System.out.println("objc객체의 객체속성변수 cc의 값은 " + objc.cc);
	  }
}
