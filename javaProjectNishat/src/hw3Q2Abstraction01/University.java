package hw3Q2Abstraction01;
/*
  Create a package name "abstraction01" inside your HW project. Inside the package, a) Create an interface "University". Declare some methods inside the interface -- classSize, field, and teacher. b) Create another interface "Hospital". Declare some methods inside the interface - emergencyRoom, surgeryRoom, cafeteria. c) Create another interface "College". Declare some methods inside the interface - commonRoom, laboratory, languageClub. d) Create an Abstract Class MedicalSchool, create 2 methods inside the interface - one is abstract and another one is non abstract name -- anatomyLab and biochemistryLab e) Create another Abstract Class EngineeringSchool, create 2 methods inside the interface - one is abstract and another one is non abstract name -- mechanicalLab and computerLab. You don't need to execute anything as main method is absent. Paste your code below
 * */
public interface University {// interface name is always in upper case
	public void classSize();//Does it have to be always public?
	public void field();//method declared in a interface but can't be implemented(no curly brace)
	public void teacher();//is there a shortcut to write declared method like this
		

}
