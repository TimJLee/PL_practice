
public class Ex12_ArrayOfArray {
	public static void main(String[] args) {
		int[][] matrix = new int[3][];
		int i,j;
		
		for(i=0;i<matrix.length; i++) {
			matrix[i] = new int[i+3];
		}
		for(i=0;i<matrix.length;i++) {
			for(j=0;j<matrix[i].length;j++) {
				matrix[i][j] = i * matrix[i].length + j;
			}
		}
		for(i=0;i<matrix.length;i++) {
			for(j=0;j<matrix[i].length;j++) {
				System.out.println(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}
}
