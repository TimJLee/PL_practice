import java.util.Scanner;

public class Ex28_IfElseSt1 {
	public static void main(String[] args) throws java.io.IOException{ 
		System.out.print("Enter a number = ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(n % 2 == 0)
		System.out.println(n +" is a even number");
		else
		System.out.println(n +" is a odd number");
	}
}
