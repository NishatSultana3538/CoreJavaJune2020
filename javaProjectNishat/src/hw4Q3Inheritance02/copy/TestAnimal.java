package hw4Q3Inheritance02.copy;

/*
 * 03) Copy your previous package "hw3Q3Inheritance01" and rename it to "hw4Q3Inheritance02" inside your HW project and execute the remaining. Read the question very carefully. a) Create a class "Animal". Implement a method inside the class -- animalInfo and System.out.println("This method is from Animal Class"). b) Create another class "Mammal". Implement a method inside the class -- mammalInfo and System.out.println("This method is from Mammal Class"). c) Create another class "Reptile". Implement a method inside the class -- reptileInfo and System.out.println("This method is from Reptile Class"). d) Create another class "Birds". Implement a method inside the class -- birdsInfo and System.out.println("This method is from Birds Class"). e) Create another class "Dog". Implement a method inside the class -- dogInfo and System.out.println("This method is from Dog Class"). f) Create another class "Snake". Implement a method inside the class -- snakeInfo and System.out.println("This method is from Snake Class"). g) Create another class "Robin". Implement a method inside the class -- robinInfo and System.out.println("This method is from Robin Class"). h) Create another class "BullDog". Implement a method inside the class -- bullDogInfo and System.out.println("This method is from BullDog Class"). i) Create another class "Cobra". Implement a method inside the class -- cobraInfo and System.out.println("This method is from Cobra Class"). Now create a class "TestAnimal". Under the main method create an object from each class and call their own method by their own object. Now extends BullDog, Cobra, and Robin class and shows the hierarchy till Animal Class. An object Can call other methods if the class is extended, if yes, show all the possible calls. Use Java comments to show single inheritance, multiple inheritance, Hierarchical inheritance by example form above. Also, show by java comments who is Parent class and who is child class. Paste your inheritance github link below*/

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();//object ceated
		animal.animalInfo();//method called
		//mammal,reptile and birds all can extend one single class ,animal class.this is called 
		//hierarchical inheritance
		//animal class is parent class here and mammal,reptile and bird class are child class which can inherit 
		//property of animal class
		
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		animal.animalInfo();
		
		//mamal class extends animal class this is called single inheritance
		//so all the that extends to another  here is single inheritance
		
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		animal.animalInfo();
		
		Birds birds = new Birds();
		birds.birdsInfo();
		animal.animalInfo();
		
		Dog dog = new Dog();
		dog.dogInfo();
		mammal.mammalInfo();
		animal.animalInfo();
		// dog extends to mammal and mammal extends to animal this is called 
		//multilevel inheritance
		
		Snake snake = new Snake();
		snake.snakeInfo();
		animal.animalInfo();
		//snake extends to reptile, reptile  extends to  animal this is called 
		//multilevel inheritance
		

		
		Robin robin = new Robin();
		robin.robinInfo();
		animal.animalInfo();
		
		Bulldog bulldog = new Bulldog();
		bulldog.bulldogInfo();
		dog.dogInfo();
		mammal.mammalInfo();
		animal.animalInfo();
		//bulldog extends to dog, dog extends to mammal and mammal extends to animal this is called 
				//multilevel inheritance
				
		
		Cobra cobra = new Cobra();
		snake.snakeInfo();
		animal.animalInfo();
		cobra.cobraInfo();
		//cobra extends to snake, snake extends to reptiles and reptile extends to animal this is called 
		//multilevel inheritance
		
		

	}

}
