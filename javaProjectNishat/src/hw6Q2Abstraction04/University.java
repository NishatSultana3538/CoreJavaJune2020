package hw6Q2Abstraction04;



/*Copy your previous package "hw5Q2Abstraction03" and rename it to "hw6Q2Abstraction04" inside your HW project and execute the remaining. Read the question very carefully. Create interface VocationalSchool and a method vocationalInfo inside it. Create another interface AeronauticalSchool and a method aeronauticalInfo inside it. See the below inheritance. University extends College, Hospital. ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool. MedicalSchool extends NursingSchool. NursingSchool extends RockefellerUniversity. RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool. EngineeringSchool extends NYUniversity. Follow all the above hierarchy to inherit the methods. Now create a class TestInstitute. Then Instantiate ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool one by one. Call all the possible methods from ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool.*/
public interface University extends College,Hospital {// interface name is always in upper case
	public void classSize();//Does it have to be always public?
	public void field();//method declared in a interface but can't be implemented(no curly brace)
	public void teacher();//is there a shortcut to write declared method like this
	
	public static void library() {//static method
		System.out.println("This is static method library from Interface University");
		
	}
	public default void	gymnesium () {	//default method
		System.out.println("This is from gymnesium method from Interface University");
	}
		

}
