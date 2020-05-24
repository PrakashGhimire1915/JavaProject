package first;
public class Firstsem{
	public int noOfStudent;
	private String[] names = {
		"Gaurav","Subash","Sandip","Sushma","Prakash"
	};
	protected void countTotalStudent(){
		int count=names.length;
		this.noOfStudent=count;
	}
	protected void printNoOfStudent(){
		System.out.println(this.noOfStudent);
	}
}