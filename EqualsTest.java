
public class EqualsTest {
	public static void main(String[] args) {
		String str1, str2;
		str1 = "서울과학기술대학교";
		str2 = str1; // 얕은복사 일어남. 주소를 가져옴. 주소가 같게 됨. 
		System.out.println("String1 : " + str1);
		System.out.println("String2 : " + str2);
		System.out.println("Same object? " + (str1 == str2));
		str2 = new String(str1); // 깊은복사일어남. 값 자체를 복사함. 새로운 객체 생성하게 되면 내용은 같지만 주소가 다르게 됨. 자바복습
		System.out.println("String1 : " + str1);
		System.out.println("String2 : " + str2);
		System.out.println("Same object?" + (str1 == str2));
		System.out.println("Same value?" + str1.equals(str2));
	}
}
