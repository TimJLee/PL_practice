
class Fruit2 {
private int a;
private int s;
private int g;
private int sum;
Fruit2(int apple, int straw, int grapes) {
a = apple ;
s = straw ;
g = grapes ;
this.count();
}
private void count() { // count() ��� �޼ҵ带 �����
sum = a + s + g;
}
public int gettotal() {
// ��� ������ ���� �� �޼ҵ带 ���ؼ��� ����
return sum;
}
public int getapple() {
// a ���� ���� �б⸸ ����ϱ� ���� �޼ҵ�
return a;
}
public int getstraw() {
return s;
}
public int getgrapes() {
return g;
}
}
class MethodDemo2 {
public static void main(String[] args) {
int total;
Fruit2 f1 = new Fruit2(30, 30, 30);
total = f1.gettotal(); // f1.count()�� ����ϸ� ���� �߻�
System.out.println("��ü f1�� �� ���� = " + total);
System.out.println("��ü f1�� apple ���� = " + f1.getapple());
// �޼ҵ带 �̿��Ͽ� ����� ������ �о� ���°͸� �����ϴ�.
// ���� ����ڰ� "f1.a = 50;" �� ���� �������� ��ü �Ӽ� ������
// ���� �����Ϸ� �Ѵٸ� ������ �߻��ȴ�.
System.out.println("��ü f1�� straw ���� = " + f1.getstraw());
System.out.println("��ü f1�� grapes ���� = "
+ f1.getgrapes());
}
}