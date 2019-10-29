class Parent1 { 
	protected void doSomething() { 
		System.out.println("Parent1.doSomething()"); 
	} 
} 
class Child1 extends Parent1 { 
	public void doSomething() { 
		System.out.println("Child1.doSomething()"); 
	} 
} // parent의 접근 한정자가 public 일 때, 자식의 접근 한정자는 public 만 됨. protectecd, private 불가
public class Ex51_UseBoth {
	public void doOtherThing() { 
		Parent1 p1=new Parent1(); 
		Child1 c1 = new Child1(); 
		Parent1 p2=new Child1(); 
		p1.doSomething(); 
		c1.doSomething();
		p2.doSomething(); 
		System.out.println("UseBoth.doOtherthing()"); 
	} 
	public static void main(String[] args) { 
		Ex51_UseBoth ub=new Ex51_UseBoth(); 
		ub.doOtherThing(); 
	} 
}
// 변수명 instanceof 클래스이름 => 변수가 해당 클래스에 속하는지 boolean 값으로 반환