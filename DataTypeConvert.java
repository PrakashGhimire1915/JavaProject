public class DataTypeConvert {
	public static void main(String[] args) {
		
		//String name = "Apple";
		//return Integer.parseInt(name);
		 int a = 42; 
		// double b = a;
		// System.out.println(b);
		 String str= Integer.toString(a);
		 System.out.println("Integer to String : "+ str);

		 double d=42.02;
		 String str1 =Double.toString(d); 
		 System.out.println("Double to String : "+ str1);

		 float f = (float)d;
		 System.out.println("Double to float : "+ f);

		 long l=123456789;
		 System.out.println("Long to String : "+ Long.toString(l));
		 System.out.println("Float to String : "+ Float.toString(f));

		 String s="25";
		 int i = Integer.parseInt(s);
		 System.out.println("String to Integer : "+ i);

		 System.out.println("String to Double : "+ Double.valueOf(s).doubleValue());
		 System.out.println("String to Long : "+ Long.parseLong(s));
		 System.out.println("String to float : "+ Float.valueOf(s).floatValue());


	}
}