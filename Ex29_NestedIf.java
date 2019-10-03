import java.util.Scanner;

public class Ex29_NestedIf {
	public static void main(String[] args) throws java.io.IOException{
		int month;
		System.out.println("Enter the Month Number 1~12");
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		String Mtos;
		if(month == 12 || month == 1 || month ==2)
		Mtos = "겨울";
		else if(month == 3 || month == 4 || month == 5)
		Mtos = "봄";
		else if(month == 6 || month == 7 || month == 8)
		Mtos = "여름";
		else if(month == 9 || month == 10 || month == 11)
		Mtos = "가을";
		else
		Mtos = "사계절에 포함되지 않는 계절";
		System.out.println(month + " 월은 " + Mtos + "입니다.");
		
		
	}
}
