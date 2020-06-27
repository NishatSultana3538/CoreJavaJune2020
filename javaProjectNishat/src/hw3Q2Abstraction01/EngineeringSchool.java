package hw3Q2Abstraction01;

/*
Create a package name "abstraction01" inside your HW project. Inside the package, a) Create an interface "University". Declare some methods inside the interface -- classSize, field, and teacher. b) Create another interface "Hospital". Declare some methods inside the interface - emergencyRoom, surgeryRoom, cafeteria. c) Create another interface "College". Declare some methods inside the interface - commonRoom, laboratory, languageClub. d) Create an Abstract Class MedicalSchool, create 2 methods inside the interface - one is abstract and another one is non abstract name -- anatomyLab and biochemistryLab e) Create another Abstract Class EngineeringSchool, create 2 methods inside the interface - one is abstract and another one is non abstract name -- mechanicalLab and computerLab. You don't need to execute anything as main method is absent. Paste your code below
* */
public abstract class EngineeringSchool {
	public void mechanicalLab() {
		System.out.println("This is Mechanical lab");
	}//non abstraction method,method implemented,can't be declared
	public abstract void computerLab();//abstract method,method declared,abstract method can't be implemented
}
