class Overload1 {
void test() {
System.out.println("�Ű����� ����");
}
void test(int a) {
System.out.println("�Ű����� int " + a);
}
void test(int a, int b) {
System.out.println("�Ű����� int " + a
+ "�� int " + b);
}
double test(double a) {
System.out.println("�Ű����� double " + a);
return a * 2;
}
}
class Ex38_OverloadDemo1 {
public static void main(String args[]) {
Overload1 ob = new Overload1();
double result;
ob.test();
ob.test(100);
ob.test(5, 10);
result = ob.test(4.2);
System.out.println("ob.test(4.2)�� ��� : " + result);
}
}