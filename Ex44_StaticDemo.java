class Box {
	int width;
	int height;
	int depth;
	long idNum;
	static long boxID = 0;
	// static 이기 때문에 , 객체를 4개를 생성해도 boxID는 공유하게 된다. 즉 네개의 객체가 생성
	// 될 때, 4개의 공간이 아니라 하나의 메모리 공간을 참조하게 된다. 
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
		System.out.println("mybox1의 id 번호 : " + mybox1.idNum);
		System.out.println("mybox2의 id 번호 : " + mybox2.idNum);
		System.out.println("mybox3의 id 번호 : " + mybox3.idNum);
		System.out.println("mybox4의 id 번호 : " + mybox4.idNum);
		System.out.println("전체 박스의 개수는 "+ Box.boxID + "입니다.");
		}
}
/*
mybox1의 id 번호 : 0
mybox2의 id 번호 : 1
mybox3의 id 번호 : 2
mybox4의 id 번호 : 3
전체 박스의 개수는 4입니다.
*/
