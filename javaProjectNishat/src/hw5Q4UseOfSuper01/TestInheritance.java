package hw5Q4UseOfSuper01;
/*
04) Create a package name "hw5Q4UseOfSuper01" in the HW project. Inside the package, a) Create a class, Father. declare some variable Name, age, sex, usCitizen. Declare default and parameterized constructor. Create a regular method father() which is implemented, declare a sysout. Create a parameterized method fatherInfo which also contain it's 4 variables, declare a sysout b) Create a class Son, declare variable stId, grade. Declare default and parameterized constructor, and implement a regular method son and declare a sysout. Create a parameterized method sonInfo() which contains 2 of its variables. Use super keyword and show all the use of the super keyword in child class and initialize in a TestFamily Class.*/

public class TestInheritance {

	public static void main(String[] args) {
		System.out.println("\n---------------------------------------------------------------");
		Son son = new Son();
		//Son son2 = new Son("Gias1", 55 , 'M');
		son.father();
		son.fatherInfo("ABC", 50, 'M');
		System.out.println("\n---------------------------------------------------------------");
		son.son();
		System.out.println("\n---------------------------------------------------------------");
		Son son3 = new Son(253663,'B');
		son.SonInfo(2463738, 'A');
		System.out.println("\n---------------------------------------------------------------");
		Father father = new Father();
		father.father();
		father.fatherInfo("Gias10", 30, 'M');
		System.out.println("\n---------------------------------------------------------------");
		Son son2 = new Son(76237, 'B');//ITS NOT PRINTING
		


	}

}
