
public class Ex25_ExplicitTypeConversion {
	public static void main(String[] args) {
		int x;
		float y, z;
		char c='A';
		x = 7 / 2; // int 끼리의 연산이므로 결과값도 int 가 나와서 버림이 되는 것. 
		y = (float) 7 / 2; 
		z = 7 / 2;
		// 두 개의 다른 형을 가지고 연산을 수행 시에 묵시적으로 큰 한계 값을 가진
		// 형으로 변환되어 구현
		System.out.println("x = " + x + " y = " + y + " z = " + z);
		c++;
		System.out.println("c = " + c);
	}
	/*
	  x = 3 y = 3.5 z = 3.0
	  c = B
	 */
}
