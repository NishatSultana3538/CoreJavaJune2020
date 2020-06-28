package hw4Q4variableAndMethod02;

/*04) Create a package name "hw4Q4variableAndMethod02" in HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Implement a method inside the class -- computerConfiguration and use only one System.out.println(). Use the variables inside sysout. Create another class TestComputer. Create object under main method. Initialize object and method. I want the first outcome in console as --> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$ and Made in USA? : false. I want second outcome in console for your configuration. So, Total 2 outcome is expecting from the test class. Paste your individual github link below
*/

public class TestComputer {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.Brand = "Apple";
		computer.Model = "macbookAir";
		computer.price = 800 ;
		computer.OperatingSystem = "MacOS Mojave";
		computer.madeinUSA = false;
		
		computer.computerConfigeration();
	

	}

}
