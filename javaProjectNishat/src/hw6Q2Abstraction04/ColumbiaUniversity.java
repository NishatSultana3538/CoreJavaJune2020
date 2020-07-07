package hw6Q2Abstraction04;

public class ColumbiaUniversity extends MedicalSchool implements University,VocationalSchool{
	/*Create a regular Class ColumbiaUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- chemistry and biology. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not?*/
	// The keyword "extends" is used to inherit regular class
	//A regular class can only inherit one regular class
	//A regular class can not inherit more than one regular class
	//A regular class can not  inherit interface or abstract  class
	//public void Chemistry(); its not possible to create abstract class in regular class
	
	
	public ColumbiaUniversity() {
		System.out.println("This is a default constructor in ColumbiaUniversity class");
	}//this is a default constructor, which have to have the same name as class
	
	public void biology() {
		System.out.println("This biology method is from ColumbiaUniversity class");
		
		
	}// non abstract method created

	@Override
	public void commonRoom() {
		System.out.println("This commonRoom method  is from College Interface");
		
	}

	@Override
	public void laboratory() {
		System.out.println("This laboratory method  is from College Interface");
		
	}

	@Override
	public void languageClub() {
		System.out.println("This languageClub method  is from College Interface");
		
	}

	@Override
	public void emergencyRoom() {
		System.out.println("This emergencyRoom method  is from  Interface Hospital");
		
	}

	@Override
	public void surgeryRoom() {
		System.out.println("This surgeryRoom method  is from Interface Hospital");
		
	}

	@Override
	public void cafeteria() {
		System.out.println("This cafeteria method  is from Interface Hospital");
		
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("This aeronauticalInfo method  is from AeronauticalSchool Interface");
		
	}

	@Override
	public void vocationalInfo() {
		System.out.println("This vocationalInfo method  is from VocationalSchool Interface");
		
	}

	@Override
	public void classSize() {
		System.out.println("This classSize method  is from  Interface University");
		
	}

	@Override
	public void field() {
		System.out.println("This field method  is from  Interface University");
		
	}

	@Override
	public void teacher() {
		System.out.println("This teacher method  is from  Interface University");
		
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void computerLab() {
		// TODO Auto-generated method stub
		
	}

}
