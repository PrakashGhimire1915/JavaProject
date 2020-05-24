import java.util.Scanner;

public class OddNumber{
	public static void main(String[] args){
		//int i;
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		n=scan.nextInt();

		System.out.println("The Odd Numbers are : ");
		for(int i=1; i<=n; i++){                    // loop start point
			if (i%2!=0) {                        // Conditional Statement
				System.out.println(i);
			}									// Conditional Statement End
		}										// Loop End
		
		/*int j=i;

		for (int j=1; j<=n; ) {
			
		}*/
	}
}