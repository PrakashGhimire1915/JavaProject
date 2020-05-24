import java.util.Scanner;

public class ArithmeticOperation{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a,b,ch,sum,diff,mul,div;
		System.out.println("Enter any two number : ");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("Enter your choice : \n1.SUM \n2.DIFFERENCE \n3.Multiply \n4.Division");
		ch=scan.nextInt();
		switch(ch)
		{
		case 1 :
			sum=a+b;
			System.out.println("Sum is : " +sum);
			break;
		case 2 :
			diff=a-b;
			System.out.println("Difference is : " +diff);
			break;
		case 3 :
			mul=a*b;
			System.out.println("Product is : " +mul);
			break;
		case 4 :
			div=a/b;
			System.out.println("Division is : " +div);
			break;
		default:
			System.out.println("Invalid Choice");	
		
		}
	}
}