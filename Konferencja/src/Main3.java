import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		System.out.println("Podaj imiê : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		if(name.endsWith("a")){
			System.out.println("Imiê jest ¿eñskie");
		}
		else
			System.out.println("Imiê jest mêskie");

	}

}
