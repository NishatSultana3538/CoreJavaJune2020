package hw3Q4variableAndMethod02;

public class Employee {
	public String Name;//non static variable declared
	public int age;
	public char sex ;
	public boolean usaCitizen;
	
	public void empInfo() {
		System.out.println("Myname:"+ Name+"\n"+"Age:"+age+"\n"+"Sex;"+
	sex+"\n"+ "USA Citizen status:"+usaCitizen);
	}//non static method
}
