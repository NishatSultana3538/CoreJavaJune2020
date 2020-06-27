package inheritance;

public class Grandfather2 {

	public static void main(String[] args) {
		Grandfather grandfather1 =new Grandfather();
		String Name = "Erik";//you have to create a local variable if u already initialize a variable not declared.But it will not print new value.
		//grandfather1.Name ;
	    grandfather1.Age1 = 100;//variable not initialize, so it will print the new value
		grandfather1.grandfatherInfo();
		
		Father father1= new Father();
		father1.age=67;
		father1.Name="Johir";
		father1.fatherInfo();
		
		Father father2= new Father();
		father2.age=85;
		father2.Name="Gias";
		father2.fatherInfo();

	}

}
