
public class ArrayType {
	public static void main(String[] args) {
		int[] ia = new int[3];
		int ib[] = {1,2,3};
		int i;
		
		for(i=0;i<ia.length;i++)
			ia[i] = ib[i];
		for(i=0;i<ia.length;i++)
			System.out.print(ia[i] + " ");
		System.out.println();
	}
}
