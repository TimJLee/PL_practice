
public class Ex33_ForTest {
	public static void main(String[] args){
		for(int i=2; i<=9; i=i+3){
			for(int j=1; j<=9; j++){
			for(int k=i; k<=i+2 && k<=9; k++){
			System.out.print(k + " * " + j + " = " +
			k*j + "\t");
			}
			System.out.println();
			}
			System.out.println();
			}
		}
}
