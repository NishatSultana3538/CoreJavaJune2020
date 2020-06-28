package hw4Q2Abstraction02;

public class ColumbiaUniversity extends NYUniversity{
	/*Create a regular Class ColumbiaUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- chemistry and biology. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not?*/
	// The keyword "extends" is used to inherit regular class
	//A regular class can only inherit one regular class
	//A regular class can not inherit more than one regular class
	//A regular class can not  inherit interface or abstract  class
	//public void Chemistry(); its not possible to create abstract class in regular class
	
	
	public ColumbiaUniversity() {
		System.out.println("This is a default constructor");
	}//this is a default constructor, which have to have the same name as class
	
	public void biology() {
		System.out.println("This is from ColumbiaUniversity class");
		
		
	}// non abstract method created

}
