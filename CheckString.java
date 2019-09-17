
public class CheckString {
	public static void main(String[] args) {
		String str1 = "안녕하세요! PL 공부를 열심히 합시다.";
		String str2 = "hello world!";
		System.out.println("문자열 : " + str1);
		System.out.println("문자열의 길이 : " + str1.length());
		System.out.println("8번째 문자 : " + str1.charAt(7));
		System.out.println("인덱스 1 에서 17까지의 substring : ");
		System.out.println(str1.substring(1,17));
		System.out.println("문자 '공'의 인덱스 : " + str1.indexOf('공'));
		System.out.println("substring \"PL\"의 시작 인덱스 : ");
		System.out.println(str1.indexOf("PL"));
		System.out.println("\n문자열 : " + str2);
		System.out.println("문자열을 대문자로 : " + str2.toUpperCase());
	}
}
