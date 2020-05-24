import java.util.Scanner;

public class JavaVariable {
	public String myVar = "Instance Variable";

	public void method() {
		String myVar = "Local Variable Inside Method...";
		System.out.print(myVar);
	}

	public static void main(String[] args) {
		JavaVariable obj = new JavaVariable();
		
		System.out.print("Calling Method");
		obj.method();
		System.out.println(obj.myVar);
	}
}