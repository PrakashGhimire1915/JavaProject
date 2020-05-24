import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Input First Number : ");
		int fn=Integer.parseInt(sc.nextLine());
		System.out.print("Input Second Number : ");
		int sn=Integer.parseInt(sc.nextLine());
		Sum s=new Sum(fn,sn);
		s.doSum();
	}
}