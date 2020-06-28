package hw4Q5Constructor01;

/*05) Create a package name "hw4Q5Constructor01" in HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Declare default constructor and multiple parameterized constructor. Use only one System.out.println() in each constructor. Create another class TestComputer. Create object as many as you want under main method. Initialize constructors. I want the first outcome in console as --> This is from default Constructor of Computer class. Second outcome -- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? : false. I want the third outcome in console for your configuration. Fourth outcome for 1 variable, 5th outcome for 3 variable, 6th outcome for 5 variable. Paste your constructor github link below*/

public class TestComputer {

	public static void main(String[] args) {

		Computer computer = new Computer();
		computer.Brand = "Apple";
		computer.Model = "macbookAir";
		computer.price = 800;
		computer.OperatingSystem = "MacOS Mojave";
		computer.madeinUSA = false;
		computer.computerConfigeration();
		
		Computer computer1 = new Computer();
		computer1.Brand = "Applemac";
		computer1.Model = "macbookPro";
		computer1.price = 1200;
		computer1.OperatingSystem = "MacOS Mojave";
		computer1.madeinUSA = false;
		computer1.computerConfigeration();

		Computer computer2 = new Computer("AppleMac");
		Computer computer3 = new Computer("AppleMac", "macbookPro", 1300 );
		Computer computer4 = new Computer("Apple", "ipad", 900 , "macOS", true);
		

	}

}
