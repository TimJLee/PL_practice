
public class Ex19_PrintTenItem {
	public static void main(String[] args) {
		int i,n = 25;
		
		for(i=1;i<=n;++i) {
			System.out.print(i + ((i %10 == 0 || i == n) ? "\n" : " "));
		// »ïÇ×¿¬»êÀÚ´Â ¿ì¼±¼øÀ§°¡ ±²ÀåÈ÷ ³·±â ¶§¹®¿¡, °ýÈ£·Î ¹­¾îÁà¾ßÇÔ. 
		}
	}
}
