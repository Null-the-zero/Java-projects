import java.util.Scanner;

public class LearningJava1 {

	public static void main(String[] args) {
		System.out.println("What is your name");
		
		Scanner scanner = new Scanner(System.in);
		//meaning = type customname = new type ()
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name);

	}

}

//Hungarian help:
//Class: Osztály
//Member: Tag
//Statement: Utasítás
//Method: Eljárás
//Properties: Tulajdonságok
//Access modifiers: Hozzáféerés módosítók
//Instance: Példány

//public class LearningJava1 {}
// Public = Access modifier
// class LearningJava1 - Name of class


//Class - Contains everything - has members
//Statements: Telling the computer to do something.
//Arguments: What you pass to a method. (part of the calling)
//Parameter: Variables to store arguments. (part of the definition)
//2 types of members:
//1. Methods - do something
//2. Properties - store something

//You can give members:
//Access modifiers (public) - Who can use it.
//Object: Instance (Magyar: példány) of a class.
//static - No instance (Magyar: példány) of class needed.


