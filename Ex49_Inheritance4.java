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

	    subOb.setij(10, 12);  // 클래스 A2로부터 상속된 메소드
	    subOb.sum();          // 클래스 B2의 메소드
	    System.out.println("두수의 합계는 : " + subOb.total);
	  }
}
