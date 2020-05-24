import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
	
		System.out.print("Enter your choice number to select a day : ");
		int number=input.nextInt();

		switch(number)
		{
			case 1 :
			{
				System.out.println("The day is Sunday.");
				break;
			}

			case 2 :
			{
				System.out.println("The day is Monday.");
				break;
			}

			case 3 :
			{
				System.out.println("The day is Tuesday.");
				break;
			}

			case 4 : 
			{
				System.out.println("The day is Wednesday.");
				break;
			}

			case 5 :
			{
				System.out.println("The day is Thursday.");
				break;
			}

			case 6 :
			{
				System.out.println("The day is Friday.");
				break;
			}

			case 7 :
			{
				System.out.println("The day is Saturday.");
				break;
			}

			default :
			System.out.println("Invalid Choice!!!");

		}
	}
}