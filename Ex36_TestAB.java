class A {
private int result;
public int add(int x, int y) {
result = x + y;
return result;
}
public int subtraction(int x,int y) {
result = x - y;
return result;
}
}
class B extends A {
private int result;
public int multi(int x,int y) {
result = x * y;
return result;
}
public int divide(int x,int y) {
result = x / y;
return result;
}
}
class Ex36_TestAB  {
public static void main(String args[]) {
int temp;
A objecta = new A();
B objectb = new B();
temp = objecta.add(10,20);
System.out.println("A�� add ������" + temp);
temp = objectb.add(1,2);
System.out.println("B�� add ������" + temp);
temp = objectb.multi(2,2);
System.out.println("B�� multi ������" + temp);
//temp = (objecta).multi(20,20); //����Ŭ������ ����Ŭ���� �޼ҵ� ��밡��������, �ݴ�� �ȵ�. ����.
System.out.println("A�� multi ������" + temp);
}
}
