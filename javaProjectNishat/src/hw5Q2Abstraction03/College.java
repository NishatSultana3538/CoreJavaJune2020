package hw5Q2Abstraction03;

public interface College {
	
	
	// The keyword "extends" is used to inherit interface
	
		//An interface can inherit more than one interface
		////An interface can not inherit regular class or abstract class
		//An interface can inherit more than one interface
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	public  default void dorm () {
		 
	 }
	public static void  studyroom () {
		
	}
	 
	

}
