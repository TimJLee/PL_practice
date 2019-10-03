
public class Ex22_WideningTypeConversion {
	public static void main(String[] args) {
		short s=1; int i; long l;
		float f; double d;
		
		i=s; l=i;
		System.out.println("s = " + s + " , i = " + i + " , l = " + l);
		f = l; d = f;
		// 낮은 한계 값을 가진 형이 높은 한계 값을 가진 형으로 자동으로 변환
		System.out.println("f = " + f + " , d = " + d);
	}
}
