package hw6Q2Abstraction04;

public interface College {
	
	
	// The keyword "extends" is used to inherit interface
	
		//An interface can inherit more than one interface
		////An interface can not inherit regular class or abstract class
		//An interface can inherit more than one interface
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	public  default void dorm () {
		System.out.println("This is in dorm method from Interface College");
		 
	 }
	public static void  studyroom () {
		
	}
	 
	

}
