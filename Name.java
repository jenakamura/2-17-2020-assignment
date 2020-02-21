import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
	
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name: ");
		str = in.nextLine();
		in.close();
		System.out.println("Hi "+str);
		
	}

}
