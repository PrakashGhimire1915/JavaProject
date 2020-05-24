package inheritance;

public class Child extends Parent{
	/**
	*Method Overriding
	*/
	public void printMessage(){
		System.out.println("Message from Child!");
	}
	/**
	*Method Overloading
	*para msg
	*/
	public void printMessage(String msg){
		System.out.println(msg);
	}
	public void printMessage(int a){
		System.out.println(a);
	}
	public static void main(String[] args){
		Child c=new Child();
		c.printMessage();
	}
}