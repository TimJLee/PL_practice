class AA  { 
	int var = 10; 
	void method()  { 
		System.out.println("1"); 
	} 
} 
class BB extends AA  { 
	int var = 20; 
	void method()  { 
		System.out.println("2"); 
	} 
} 
public class Ex50_CastingObject {
	public static void main(String[] args)  { 
		AA a = new BB(); 
		System.out.println(a.var); 
		a.method(); 
	} 
}
