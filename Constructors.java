package Constuctors;

class Fruits{   //user define class
	Fruits(){  // It is default //This is constructor (Constructor is nothing it is only the class name
		System.out.println("I am Default constructor");
	}
	Fruits(String name){  // It is parameterized 
		System.out.println("I am Param constructor");
		System.out.println("Fruit name:" +name);
	}
}
public class Constructors {  // Main Class

	public static void main(String[] args) {
		
		Fruits f = new Fruits();   //For constructor there no need of call function
		Fruits f1 = new Fruits("Orange");
	}

}
