import java.util.Scanner;

public class AcceptDataType {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Integer value : ");
		System.out.println("Interger = "+ sc.nextInt());
		//System.out.print("\n");

		System.out.print("Floating value : ");
		System.out.println("Float = "+ sc.nextFloat());
		//System.out.print("\n");

		System.out.print("Character : ");
		System.out.println("Character = "+ sc.next().charAt(0));
		//System.out.print("\n");
		
		System.out.print("Boolean value : ");
		System.out.println("Boolean = "+ sc.nextBoolean());
		//System.out.print("\n");

		System.out.print("Double value : ");
		System.out.println("Double = "+ sc.nextDouble());
		//System.out.print("\n");

		System.out.print("Long value : ");
		System.out.println("Long = "+ sc.nextLong());
		//System.out.print("\n");

		sc.close();
	}
}