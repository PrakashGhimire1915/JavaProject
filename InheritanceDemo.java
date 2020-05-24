public class InheritanceDemo {
	public static void main(String[] args) {
		Bike b=new Bike();
		b.start();
		b.makeSound();
		System.out.print("\n");
		Car c=new Car();
		c.start();
		c.makeSound();

	}
}