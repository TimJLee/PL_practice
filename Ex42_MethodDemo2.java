
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
private void count() { // count() 라는 메소드를 숨긴다
sum = a + s + g;
}
public int gettotal() {
// 모든 과일의 합은 이 메소드를 통해서만 접근
return sum;
}
public int getapple() {
// a 값에 대해 읽기만 허용하기 위한 메소드
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
total = f1.gettotal(); // f1.count()를 사용하면 에러 발생
System.out.println("객체 f1의 총 개수 = " + total);
System.out.println("객체 f1의 apple 개수 = " + f1.getapple());
// 메소드를 이용하여 사과의 개수를 읽어 오는것만 가능하다.
// 만일 사용자가 "f1.a = 50;" 과 같은 문장으로 객체 속성 변수에
// 직접 접근하려 한다면 에러가 발생된다.
System.out.println("객체 f1의 straw 개수 = " + f1.getstraw());
System.out.println("객체 f1의 grapes 개수 = "
+ f1.getgrapes());
}
}