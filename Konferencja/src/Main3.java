import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		System.out.println("Podaj imi� : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		if(name.endsWith("a")){
			System.out.println("Imi� jest �e�skie");
		}
		else
			System.out.println("Imi� jest m�skie");

	}

}
