
public class Ex23_NarrowingTypeConversion {
	public static void main(String[] args) {
		short s; int i; long l;
		float f; double d=1.2345678912345678;
		f = (float)d; // 명시적 형 변환
		System.out.println("f = " + f + " , d = " + d);
		l = (long)f; i = (int)l; s = (short)i; // 명시적 형 변환
		System.out.println("s = " + s + " , i = " + i + " , l = " + l);
	}
}
