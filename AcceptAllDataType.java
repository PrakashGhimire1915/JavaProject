import java.util.Scanner;

public class AcceptAllDataType {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
	
		System.out.print("Enter any Character : ");
		char a=input.next().charAt(0);
		System.out.print("Character : "+ a);
		System.out.print("\n");

		System.out.print("Enter any Number : ");
		int b=input.nextInt();
		System.out.print("IntergerValue : "+ b);
		System.out.print("\n");

		System.out.print("Enter Decimal Number : ");
		float c=input.nextFloat();
		System.out.print("Floating Number : "+ c);
		System.out.print("\n");
		
		System.out.print("Do you love coding in java? : ");
		boolean d=input.nextBoolean();
		System.out.print("Boolean Value : "+ d);
		System.out.print("\n");

		input.close();
	}
}