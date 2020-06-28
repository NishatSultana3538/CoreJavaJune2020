package hw4Q2Abstraction02;

public class NYUniversity extends RockefellerUniversity {
	/*Create a regular Class NYUniversity, create 2 methods inside the class - one is abstract and another one is non-abstract name -- anthropology and physics. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not?*/
	// The keyword "extends" is used to inherit regular class

	//A regular class can only inherit one regular class, multiple inheritance is not possible
	//A regular class can not inherit more than one regular class
	//A regular class can not  inherit interface or abstract  class
	
	//public void anthropology();//Its not possible to create an abstract 
	//method or declared method in a regular class 
	
	public NYUniversity() {
		System.out.println("This is from default constructor");
	}//this is a default constructor, which have to have the same name as class
	
	public void physics() {
		System.out.println("This is from NYUniversity class");
	}

}
