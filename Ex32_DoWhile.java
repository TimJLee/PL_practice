
public class Ex32_DoWhile {
	public static void main(String[] args) {
		int N = 1; //실행 이후 N을 10으로 바꾼 뒤 재실행 해볼 것
		System.out.println("구구단 3단");
		do{
		System.out.println( 3 + "*" + N + " = " + (3 * N));
		N++;
		}while(N < 10);
	}
}
