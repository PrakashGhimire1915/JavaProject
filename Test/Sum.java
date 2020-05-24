public class Sum{
	int a;
	int b;
	int sum;
	public Sum(int aNumber, int bNumber){
		this.a=aNumber;
		this.b=bNumber;
	}
	public void doSum(){
		sum=a+b;
		System.out.println("Sum is : "+ sum);
	}
}