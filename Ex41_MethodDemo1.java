//캡슐화가 제대로 적용되지 않은 사례. 42번과 비교하기(잘 사용된 사례)
class Fruit1{
	int apple;
	int straw;
	int grapes; //원래 private 를 붙여야함.(접근 한정자의 바람직한 사용이 필요함.)
	int sum;
	Fruit1(int apple, int straw, int grapes){
		this.apple=apple;
		this.straw=straw;
		this.grapes=grapes;
	}
	public int count() {
		sum=apple+straw+grapes;
		return sum;
	}
}
public class Ex41_MethodDemo1 {
	public static void main(String[] args) {
		int total;
		Fruit1 f1 = new Fruit1(30, 30, 30);
		total = f1.count();
		System.out.println("객체 f1의 총 개수 = " + total);
		System.out.println("객체 f1의 apple 개수 = " + f1.apple);
		// 사과의 개수를 읽어 오기 위해 객체 속성 변수에 직접 접근
		// 객체 속성 변수의 값을 직접 변경(f1.apple=90;)할 수도 있다
		System.out.println("객체 f1의 straw 개수 = " + f1.straw);
		System.out.println("객체 f1의 grapes 개수 = " + f1.grapes);
		}
}
