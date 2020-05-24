import java.util.*;
public class Calculator{
	public static void main(String[] args){
		boolean runner=false;
		do{
		int ch,a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any two number : ");
		a=Integer.parseInt(scan.nextLine());
		b=Integer.parseInt(scan.nextLine());
		System.out.println("Enter your Choice : \n1.Sum \n2.Difference \n3.Multiply");
		ch=Integer.parseInt(scan.nextLine());
		switch(ch)
		{
			case 1:
			System.out.println("Sum is : "+ Sum.add(a,b));
			break;

			case 2:
			System.out.println("Difference is : "+ Difference.diff(a,b));
			break;

			case 3:
			System.out.println("Multiply is : "+ Multiply.mul(a,b));
			break;

			case 4:
			runner=false;
			System.exit(0);
		}
		}while(runner=false);
	}
}