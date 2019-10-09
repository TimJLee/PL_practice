
class Fruit {
int apple = 5; // 객체 참조 변수
int straw = 10;
int grapes = 15;
}

class Ex37_Buy extends Fruit {
public static void main(String[] args) {
int quantity1, quantity2;
Fruit f1 = new Fruit();
Fruit f2 = f1; // 얕은복사. 참조되는 객체의 값이 변경되면 같이 다 변경된다. 
System.out.println("f1" + f1);
System.out.println("f2" + f2);
quantity1 = f1.apple + f1.straw + f1.grapes;
quantity2 = f2.apple + f2.straw + f2.grapes;
System.out.println("객체 f1의 초기 과일 개수 "+quantity1+"개");
System.out.println("객체 f2의 초기 과일 개수 "+quantity2+"개");
f1.apple = 10;
f2.straw = 20;
f1.grapes = 30;
quantity1 = f1.apple + f1.straw + f1.grapes;
quantity2 = f2.apple + f2.straw + f2.grapes;
System.out.println("객체 f1의 값 변동 후 개수 "+quantity1+"개");
System.out.println("객체 f2의 값 변동 후 개수 "+quantity2+"개");
}
}
