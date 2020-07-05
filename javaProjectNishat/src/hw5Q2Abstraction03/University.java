package hw5Q2Abstraction03;



/*02) Copy your previous package "hw4Q2Abstraction02" and rename it to "hw5Q2Abstraction03" inside your HW project and execute the remaining. Read the question very carefully. i) Create one default and one static method gymnasium and library inside interface "University". Create one default and one static method morgue and pharmacy inside interface "Hospital". Create also one default and one static method dorm and studyRoom inside interface "College". How many keywords are used for the inheritance in Java? how many keywords are used for the inheritance in Interface, answer by Java comments? if you can use the keyword 'implements' in Interface, please use it. Use all the interfaces -- University, Hospital, and College to answer my questions. ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool. how many keywords are used for the inheritance in Java for Abstract Class? Can an Abstract Class inherit other Abstract Class or a regular class or interface? How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes and use the keywords to answer my questions. iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity. how many keywords are used for the inheritance in Java for a regular Class? Can an regular Class inherit other Abstract Class or a regular class or interface? How many inheritances is possible by a regular Class? Use the all of above regular Classes and use the keywords to answer my questions. You don't need to execute anything as the main method is absent.
  */
public interface University  {// interface name is always in upper case
	public void classSize();//Does it have to be always public?
	public void field();//method declared in a interface but can't be implemented(no curly brace)
	public void teacher();//is there a shortcut to write declared method like this
	
	public static void library() {//static method
	}
	public default void	gymnesium () {	//default method
	}
		

}
