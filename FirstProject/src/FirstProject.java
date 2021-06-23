import java.util.Scanner;

public class FirstProject {

	public static void main(String[] args) { //parameter
		System.out.println("Hello World");
		
		java.util.Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		if(s.equals("Peter")) {
			System.out.println("Hey Peter");
	} else if(s.equals("Ramona")) {
		System.out.println("Hey Ramona");
	} else {
		System.out.println("You're not welcome here!");
	}
		int i = 0;
		while(i < 10) {
			System.out.println("i is:" + i);
			i++;
		}
		in.close();
	}

}
