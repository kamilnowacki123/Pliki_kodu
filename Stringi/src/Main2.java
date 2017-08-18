import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj miasto");
		String city = scanner.next();
		char firstletter = city.charAt(0);
		if (firstletter == 'W' || firstletter == 'w'){
			System.out.println("Miasto zaczyna siê na W");
		}
		else
			System.out.println("Miasto nie zaczyna siê na W");
	}

}
