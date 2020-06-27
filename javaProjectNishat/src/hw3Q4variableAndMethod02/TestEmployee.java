package hw3Q4variableAndMethod02;

/*
 * 04) Create a package name "hw3Q4variableAndMethod02" in HW project. Inside the package, a) Create a class "Employee". Declare non static variable -- Name, age, sex and usaCitizen as String, int, char and boolean type. Implement a non static method inside the class -- empInfo and use only one System.out.println(). Use the variables inside sysout. Create another class TestEmployee. Create object under main method. Initialize object and method. I want the first outcome in console as --> My name: Tofael, Age: 44, Sex: M and USA Citizen status: false. I want second outcome in console for your info. So, Total 2 outcome is expecting from the test class. Paste your code below*/

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee();//object created,
	
		employee1.Name = "Tofael";//object created//variable initialized
		employee1.age = 44;
		employee1.sex = 'M';
		employee1.usaCitizen = false;
		employee1.empInfo();//Method initialized
		
		Employee employee2 = new Employee();//object created,
		
		employee2.Name = "Nishat";
		employee2.age = 40;
		employee2.sex = 'F';
		employee2.usaCitizen = true;
		employee2.empInfo();//Method initialized
		
		
		

	}

}
