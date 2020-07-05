package hw5Q4UseOfSuper01;

/*04) Create a package name "hw5Q4UseOfSuper01" in the HW project. Inside the package, a) Create a class, Father. declare some variable Name, age, sex, usCitizen. Declare default and parameterized constructor. Create a regular method father() which is implemented, declare a sysout. Create a parameterized method fatherInfo which also contain it's 4 variables, declare a sysout b) Create a class Son, declare variable stId, grade. Declare default and parameterized constructor, and implement a regular method son and declare a sysout. Create a parameterized method sonInfo() which contains 2 of its variables. Use super keyword and show all the use of the super keyword in child class and initialize in a TestFamily Class.*/

public class Father {
	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	
	public Father() {
		System.out.println("This is default constructor from father");
	}

	public Father(String name, int age, char sex) {
		super();
		Name = name;
		this.age = age;
		this.sex = sex;
		System.out.println(Name + age + sex);
		
	}
	
	
	public void father() {
		System.out.println("This method  is from father");
	}
	
	public void fatherInfo(String name, int age, char sex) {
		
		Name = name;
		this.age = age;
		this.sex = sex;
		
		System.out.println("Name" +name +"\nAge"+age+"\nSex"+sex);
		
	}
	
	
}
	
	
	
