package hw4Q6Inheritance03;

public class TestInheritance {

	public static void main(String[] args) {
		
		GrandMother grandMother = new GrandMother();
		grandMother.GrandMotherInfo();
		
		
		Mother mother = new Mother();
		mother.MotherInfo();
		grandMother.GrandMotherInfo();
		
		Aunt aunt = new Aunt();
		aunt.AuntInfo();
		grandMother.GrandMotherInfo();
		
		
		Uncle uncle = new Uncle();
		uncle.UncleInfo();
		grandMother.GrandMotherInfo();
		
		Me me = new Me();
		me.MyInfo();
		mother.MotherInfo();
		grandMother.GrandMotherInfo();
		
		MyDaughter myDaughter = new MyDaughter();
		myDaughter.MyDaughterInfo();
		me.MyInfo();
		mother.MotherInfo();
		grandMother.GrandMotherInfo();
		
		MySister mySister = new MySister();
		mother.MotherInfo();
		grandMother.GrandMotherInfo();
		
		MyGrandDaughter myGrandDaughter = new MyGrandDaughter();
		myGrandDaughter.GranddaughterInfo();
		myDaughter.MyDaughterInfo();
		me.MyInfo();
		mother.MotherInfo();
		grandMother.GrandMotherInfo();
		
		
		
	}
		
		

}
