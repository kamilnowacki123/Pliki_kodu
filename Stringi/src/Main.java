import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj has³o");
		String password = "Akademia";
		String word = scanner.nextLine();
		if(word.equals(password)){
			System.out.println("Access Graunted");
		}
		else
			System.out.println("Access Denied");
	}
	

}
