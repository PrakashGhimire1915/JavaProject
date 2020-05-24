public class StringDemo {
	public static void main(String[] args) {
		
		String name = " Rajesh Dai  ";
		String n2 = "Rajesh dai ";
		String n3 = "Nikhil Bhai";
		
		//Calculating the length of a String...
		int l = name.length();
		System.out.println("Length of a String is : "+ l);	
		//charAt()...
		name.charAt(8);
		System.out.println("Character in a String is : "+ name.charAt(8));

		//trim()...
		String n1 = name.trim();
		System.out.println("Length of a String after trim : "+ n1.length());

		//equals() method compares...
		System.out.println(n2.equals(n1));

		//equalsIgnoreCase() method ignores lowercase and uppercase...
		System.out.println(n2.equalsIgnoreCase(n1));

		//String concatenation...
		//concat();
		System.out.println("String after concatenation : "+ n2.concat(n3)); 

		//Conversion to UpperCase...
		String uppercase = n2.toUpperCase();
		String uppercase1 = n3.toUpperCase();

		System.out.println("String to UpperCase : "+ uppercase);
		System.out.println("String to UpperCase : "+ uppercase1);

		//Conversion to LowerCase...
		String lowercase = n2.toLowerCase();
		String lowercase1 = n3.toLowerCase();

		System.out.println("String to LowerCase : "+ lowercase);
		System.out.println("String to LowerCase : "+ lowercase1);
	}
}