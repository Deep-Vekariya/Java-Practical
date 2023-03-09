import java.util.*;

public class CricketM{
	public static void main(String[] args){

		// create array of object, length 5
		// Create arrya of object doesn't mean create actual object of that class
		Match[] match = new Match[5];

		// Create objeject1 and set value by paramitarize constructor
		match[0] = new Match("Deep" , 19 , 100, 20);
		match[1] = new Match();
		match[2] = new Match();
		match[3] = new Match();
		match[4] = new Match();

		match[0].Display();

		// set value by user input
		match[1].SetData();
		match[1].Display();

		// pass value in method
		// match[2].SetData("Deep" , 19 , 100, 20);
		// match[2].Display();

		// match[3].SetData();
		// match[3].Display();

		// match[4].SetData();
		// match[4].Display();

		// match[5].SetData();
		// match[5].Display();
	}
}


abstract class Cricket{
	Scanner scanner = new Scanner(System.in);
	String name;
	double age;

	// set data by user input
	abstract void SetData();

	// // set data by passing value by object
	// abstract void SetData(String name,double age, double no_of_odi, double no_of_test);

	abstract void Display();
}

class Match extends Cricket{
	double no_of_odi;
	double no_of_test;

	// simple constructor
	Match(){}

	//paramitarize constructor to set value 
	Match(String name,double age, double no_of_odi, double no_of_test){
		this.name = name;
		this.age = age;
		this.no_of_odi = no_of_odi;
		this.no_of_test = no_of_test;
	}

	// set data by user input
	 	void SetData(){
		System.out.println();
		System.out.print("Enter Name : ");
		name = scanner.nextLine();
		System.out.print("Enter Age : ");
		age = scanner.nextDouble();
		System.out.print("How Many Odi Play : ");
		no_of_odi = scanner.nextDouble();
		System.out.print("How Many Test Player Play : ");
		no_of_test = scanner.nextDouble();
		System.out.println();
	}

	// // set data by passing value by object
	// void SetData(String name,double age, double no_of_odi, double no_of_test){
	// 	this.name = name;
	// 	this.age=age;
	// 	this.no_of_odi=no_of_odi;
	// 	this.no_of_test=no_of_test;
	// }

	// display data
	void Display(){
		System.out.println();
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("No Of Odi Play : " + no_of_odi);
		System.out.println("No Of Test Play : " + no_of_test);
	}	
}
