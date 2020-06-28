package hw4Q2Abstraction02;

public class RockefellerUniversity {
	/*Create a regular Class RockefellerUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- maths and statistics. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not? Now, answer how many keywords are used for the inheritance for a regular Class? Can a regular Class inherit other Abstract Class or regular class or interface? How many inheritances is possible by a regular Class? Use the above regular Classes to answer my questions*/
	// The keyword "extends" is used to inherit regular class
	//A regular class can only inherit one regular class
	//A regular class can not inherit more than one regular class
	//A regular class can not  inherit interface or abstract  class
	
	//public maths();//Its not possible to create an abstract 
	//method or declared method in a regular class 
	
	public RockefellerUniversity() {
		System.out.println("This is from default constructor");
	}//this is a default constructor, which have to have the same name as class
	
	public void statistics() {
		System.out.println("This is from RockefellerUniversity class");
	}

}
