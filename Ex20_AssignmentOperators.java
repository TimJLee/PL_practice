
public class Ex20_AssignmentOperators {
	public static void main(String[] args) {
		int x,y=2;
		
		x = 10; x += y; System.out.println(" 1. x = "+ x);
		x = 10; x -= y; System.out.println(" 2. x = "+ x);
		x = 10; x *= y; System.out.println(" 3. x = "+ x);
		x = 10; x /= y; System.out.println(" 4. x = "+ x);
		x = 10; x%= y; System.out.println(" 5. x = "+ x);
		x = 10; x &=y; System.out.println(" 6. x = "+ x);
		x = 10; x |= y; System.out.println(" 7. x = "+ x);
		x = 10; x ^= y; System.out.println(" 8. x = "+ x);
		x = 10; x <<= y; System.out.println(" 9. x = "+ x);
		x = 10; x >>= y; System.out.println("10. x = "+ x);
		x = 10; x >>>= y; System.out.println("11. x = "+ x);
		// >>> 는 unsigned 를 유지하면서 시프트연산을 하겠다는 것임. 즉, 부호에 관계없이 하겠다...
		//즉, 13번의 경우 오른쪽 시프트 연산을 해서 비는 공간을 signed 일 때와 달리 1로 채우지 않고 0으로 채워서 
		//결국 양수값이 나오게 되며, 결과적으로 MSB두개가 0이며 나머지는 1이고, 마지막 네 비트가 1101 이기 때문에 계산해보면, 컴파일한 값과 동일하게 얻어짐을 알 수 있음.
		// 또한, 음수값을 표현 할 때에는, 2의 보수를 활용하며 이는 1의 보수에 1을 더한 값과 같다. 디지털 논리 회로 책을 참조하면, 2의 보수로 곧바로 구하는 방법이 있음. 까먹으면 다시 볼것.
		// 그리고 int 기 때문에 32비트로 계산을 해줘야 13번을 이해할 수 있음. 나머지 문제는 8비트로 해도 답은 같음.
		x = -10; x >>= y; System.out.println("12. x = "+ x);
		x = -10; x >>>= y; System.out.println("13. x = "+ x); // 결론적으로 >>> 연산은 음수일 때 피연산자가 음수일때 문제가 발생함. 양수일 때는 상관이 없음을 알 수 있음.
	}
}
