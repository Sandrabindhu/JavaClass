package MethodOverloading;

class Addition{
	public void add() {   // normal method
		int a=10;
		int b=20;
		System.out.println("Sum o a$b is : " +(a+b));
	}
	public int add(int a, int b) {  //which datatype take in parameter that we have to take instid of void
		return a+b;  //insted void if we take datatype(line int) then we have to write return
	}
	public int add(int a, int b, int c) {  
		return a+b+c;  
	}
	public String Fname(String fname) {  
		return fname;  
	}
	public String Lname(String lname) {  
		return lname;  
	}
}

public class MethondOverLoading {

	public static void main(String[] args) {
		Addition a = new Addition();
		a.add();
		System.out.println("Sum of a&b" +a.add(200,300));
		System.out.println("Sum of a&b&c" +a.add(200,300,400));
		System.out.println("*** Method Overloading ***");
		System.out.println("My first name: " +a.Fname("Sandra"));
		System.out.println("My last name: " +a.Lname("B"));

	}

}
