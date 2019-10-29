class D1 {
  int x = 1000;
  void display() {
    System.out.println("상위클래스 D1의 display() 메소드 입니다");
  }
}

class D2 extends D1 {
  int x = 2000;
  void display() {
    System.out.println("하위클래스 D2의 display() 메소드 입니다");
  }
  void write() {
	  this.display();
	  super.display();
	  System.out.println("D2 클래스 객체의 x 값은 : " + x);
	  System.out.println("D1 클래스 객체의 x 값은 : " + super.x);
   }
}
public class Ex48_InheritanceSuper {
	 public static void main(String args[]) {
		    D2 d = new D2();
		    d.write();
		  }
}
