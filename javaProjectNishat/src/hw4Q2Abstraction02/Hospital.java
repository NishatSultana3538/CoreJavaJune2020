package hw4Q2Abstraction02;

public interface Hospital extends University,College{
	
	/* Read the question very carefully. i) Can you create a Constructor inside the interface? If yes, create default Constructor on each interface. If no, comment out the created constructor and answer why not? Now, answer how many keywords are used for the inheritance for Interface? Can an interface inherit other Interface, or a regular class or abstract class? How many inheritance is possible? Use all the interfaces -- University, Hospital and College to answer my questions.*/// The keyword "extends" is used to inherit regular class
	// The keyword "extends" is used to inherit interface
	
	//An interface can inherit more than one interface
	////An interface can not inherit regular class or abstract class
	//An interface can inherit more than one interface
	
	//public Hospital() {
	//	System.out.println("This constructor is from default constructor");
	//}Interface cant have constructor
	
	public void emergencyRoom();
	public void surgeryRoom();
	public void cafeteria();
	

}
