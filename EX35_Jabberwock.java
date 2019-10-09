
public class EX35_Jabberwock {
	// 아래의 4가지 변수는 동물의 특성을 나타낸다.
	String color; //동물의 색깔
	String sex; //동물의 성별
	String animal; //동물의 이름
	boolean hungry; //동물의 식사유무
	void feedJabberwock() { //동물의 식사유무를 결정하는 메소드
	if (hungry == true) {
	System.out.println("Yum -- a Hambuger!");
	hungry = false;
	} else
	System.out.println("No, thanks -- already ate.");
	}
	void showAttributes() { //동물의 상태를 나타내는 메소드
	System.out.println("This is a " + sex + " " + color + " "
	+animal+".");
	if (hungry == true)
	System.out.println("The " +animal+" is hungry.");
	else
	System.out.println("The "+animal+ " is full.");
	}
	public static void main (String arguments[]) {
	EX35_Jabberwock dog = new EX35_Jabberwock(); //객체선언과 활성화
	EX35_Jabberwock cat= new EX35_Jabberwock();
	dog.color = "orange"; //dog이라는 객체의 특성을 정의
	dog.sex = "male";
	dog.animal="dog";
	dog.hungry = true;
	cat.color="white"; //cat이라는 객체의 특성을 정의
	cat.sex="female";
	cat.animal="cat";
	cat.hungry = false;
	System.out.println("Calling showAttributes ...");
	dog.showAttributes(); //dog의 상태를 표시하는 메소드호출
	System.out.println("-----");
	System.out.println("Feeding the dog ...");
	dog.feedJabberwock(); //dog의 식사유무를 결정하는 메소드 호출
	System.out.println("-----");
	System.out.println("Calling showAttributes ...");
	dog.showAttributes(); //dog의 상태를 표시하는 메소드 호출
	System.out.println("-----");
	System.out.println("Feeding the dog ...");
	dog.feedJabberwock(); //dog의 식사유무를 결정하는 메소드 호출
	System.out.println("Calling showAttributes ...");
	cat.showAttributes(); //cat의 상태를 표시하는 메소드 호출
	System.out.println("-----");
	System.out.println("Feeding the cat ...");
	cat.feedJabberwock(); //cat의 식사유무를 표시하는 메소드 호출
	System.out.println("-----");
	System.out.println("Calling showAttributes ...");
	cat.showAttributes(); //cat의 상태를 표시하는 메소드 호출
	System.out.println("-----");
	System.out.println("Feeding the cat ...");
	cat.feedJabberwock(); //cat의 식사유무를 표시하는 메소드 호출
	}
	}
