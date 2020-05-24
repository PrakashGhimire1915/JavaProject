import java.util.*;
public class Prac{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i=a; i<=b; i++ ) {
			if (i%2 == 0){
			System.out.println("the number is even" + i);

		} 
		else{
			System.out.println("the number is odd" + i);
		}
		}
	}
}