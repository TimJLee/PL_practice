import java.util.Scanner;

public class Ex29_NestedIf {
	public static void main(String[] args) throws java.io.IOException{
		int month;
		System.out.println("Enter the Month Number 1~12");
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		String Mtos;
		if(month == 12 || month == 1 || month ==2)
		Mtos = "�ܿ�";
		else if(month == 3 || month == 4 || month == 5)
		Mtos = "��";
		else if(month == 6 || month == 7 || month == 8)
		Mtos = "����";
		else if(month == 9 || month == 10 || month == 11)
		Mtos = "����";
		else
		Mtos = "������� ���Ե��� �ʴ� ����";
		System.out.println(month + " ���� " + Mtos + "�Դϴ�.");
		
		
	}
}
