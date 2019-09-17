
public class CharString {
	public static void main(String[] args) {
		int i = '1' + 10; // '1' <=> 49 (ASCII)
		int j = '1' + 'A'; // 'A' <=> 65 
		int k = 66;
		
		System.out.println("\'1\' + 10 = " + i); // \' => ' 로 출력하기 위함
		System.out.println("\'1\' + \'A\' = " + j);
		
		// 정수 66을 문자로 형변환
		System.out.println("66은 유니코드 문자로" + (char)k + "입니다"); // ASCII 만들 때, '숫자' 대신 (char)변수 로 형변환하는 방법도 있음을 보여주는 듯 
		System.out.println("\"I am a String.\""); // 마찬가지로 \" 는 "로 출력
	}
}
