package hw3Q3Inheritance01;

/*
 * 03) Create a package name "hw3Q3Inheritance01" in HW project. Inside the package, a) Create a class "Animal". Implement a method inside the class -- animalInfo and System.out.println("This method is from Animal Class"). b) Create another class "Mammal". Implement a method inside the class -- mammalInfo and System.out.println("This method is from Mammal Class"). c) Create another class "Reptile". Implement a method inside the class -- reptileInfo and System.out.println("This method is from Reptile Class"). d) Create another class "Birds". Implement a method inside the class -- birdsInfo and System.out.println("This method is from Birds Class"). e) Create another class "Dog". Implement a method inside the class -- dogInfo and System.out.println("This method is from Dog Class"). f) Create another class "Snake". Implement a method inside the class -- snakeInfo and System.out.println("This method is from Snake Class"). g) Create another class "Robin". Implement a method inside the class -- robinInfo and System.out.println("This method is from Robin Class"). Now create a class "TestAnimal". Under the main method create object from each class and call their own method by their own object. Paste your code below*/

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();//object cteated
		animal.animalInfo();//method called
		
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		
		Birds birds = new Birds();
		birds.birdsInfo();
		
		Dog dog = new Dog();
		dog.dogInfo();
		
		Snake snake = new Snake();
		snake.snakeInfo();
		
		Robin robin = new Robin();
		robin.robinInfo();
		
		

	}

}
