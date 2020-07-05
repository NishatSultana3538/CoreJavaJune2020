package hw5Q2Abstraction03;

public class NYUniversity extends RockefellerUniversity  implements College,Hospital{
	/*Create a regular Class NYUniversity, create 2 methods inside the class - one is abstract and another one is non-abstract name -- anthropology and physics. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not?*/
	// The keyword "extends" is used to inherit regular class

	//A regular class can only inherit one regular class or abstract class, multiple inheritance is not possible
	//A regular class can not inherit more than one regular class
	//A regular class can not  inherit interface 
	
	//public void anthropology();//Its not possible to create an abstract 
	//method or declared method in a regular class 
	
	// from Tofael,a regular class can inherit only one regular class or
			// a regular class can inherit only one abstract class
			// a regular class can't inherit an Interface by extends key word
		
			// Implements keyword is used to inherit Interface in regular class
			// a regular class can inherit more than one Interface
			// a regular class cannot inherit a regular class or abstract class by implements keyword
		
		//when A regular class extends one regular class or abstract class and implements multiple 
		//interface, that regular class (Toyota) is called concrete class
	
	public NYUniversity() {
		System.out.println("This is from default constructor");
	}//this is a default constructor, which have to have the same name as class
	
	public void physics() {
		System.out.println("This is from NYUniversity class");
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void field() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

}
