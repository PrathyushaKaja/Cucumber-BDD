package Practice.Seleniumday1;

public class Calculator {
	static int y =60;//static variable
	final int z =2000;//final variable
	public void FinalVariable() {
		System.out.println("Final variable is " + z);
		//z=80;
	}
	int global=100;//global variable
	public void GlobalVariable() {
System.out.println("Global variable is " +global);
	}
public void Addition() {
	int a=10;//local variable
	int b=20;
	int sum=a+b;
	System.out.println("Addition " +sum);
}
public void Subtraction() {
	int a=50;
	int b=70;
	int sub=a-b;
	System.out.println("Subtraction " +sub);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static variable is" +Calculator.y);
Calculator cal=new Calculator();
cal.GlobalVariable();
cal.Addition();
cal.Subtraction();
cal.FinalVariable();
	}

}
