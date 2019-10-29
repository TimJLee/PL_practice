class Parent1 { 
	protected void doSomething() { 
		System.out.println("Parent1.doSomething()"); 
	} 
} 
class Child1 extends Parent1 { 
	public void doSomething() { 
		System.out.println("Child1.doSomething()"); 
	} 
} 
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
