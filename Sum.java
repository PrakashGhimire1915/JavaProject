import java.util.*;
public class Sum {
	public static void main(String[] args){
		int firstNumber;
		int secondNumber;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input First Number : ");
		firstNumber = Integer.parseInt(sc.nextLine());
		System.out.print("Input Second Number : ");
		secondNumber = Integer.parseInt(sc.nextLine());
		int sum = firstNumber+secondNumber;
		System.out.println("The Sum of " +firstNumber+ " and " +secondNumber+" is : " +sum);
	}
}