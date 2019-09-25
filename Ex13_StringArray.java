
public class Ex13_StringArray {
	public static void main(String[] args) {
		String viewString[] = new String[5];
		
		viewString[0] = new String("I");
		viewString[1] = new String("am");
		viewString[2] = new String("a");
		viewString[3] = new String("student");
		viewString[4] = new String(".");
		
		for(int i=0;i<viewString.length;i++)
			System.out.print(viewString[i]+" ");
	}
}
