
public class TwoDa {
	public static void main(String[] args) {
		int twoD[][] = new int[4][];
		twoD[0] = new int[1];
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];
		//각 행마다 서로 다른 사이즈를 지정해서 이차원 배열 지정 가능.. 조합(콤비네이션)계산할때 사용가능?
		int i,j,k =0;
		
		for(i=0;i<4;i++) {
			for(j=0;j<i+1;j++) {
				twoD[i][j] = k;
				k++;
			}
		}
		for(i=0;i<4;i++) {
			for(j=0;j<i+1;j++) {
				System.out.println(twoD[i][j] + " ");
			}
			System.out.println();
		}
	}
}
