import java.util.Scanner;

public class Ex30_SwitchSt {
	public static void main(String[] args) throws java.io.IOException {
		int month;
		System.out.println("Enter the Month Number 1~12");
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		String Mtos;
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			Mtos = "�ܿ��Դϴ�.";
			break;
		case 3:
		case 4:
		case 5:
			Mtos = "���Դϴ�.";
			break;
		case 6:
		case 7:
		case 8:
			Mtos = "�����Դϴ�.";
			break;
		case 9:
		case 10:
		case 11:
			Mtos = "�����Դϴ�.";
			break;
		default:
			Mtos = "12���� �̳��� ���� �ƴմϴ�.";
		}
		System.out.println(month + "���� " + Mtos);
			
		}
	// break ���� ���� �������ν� �ǵ���� �۵� ����
}

