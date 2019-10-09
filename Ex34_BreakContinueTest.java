
public class Ex34_BreakContinueTest {
	public static void main(String[] args){
		for(int	i=0; i<=10; i++){
			if(i==5)
				break;
			System.out.print(i + "\t");
		}
		System.out.println();
		for(int i=0; i<=10; i++){
			if(i%3==0)
					continue;
			System.out.print(i + "\t");
		}
	}
}
