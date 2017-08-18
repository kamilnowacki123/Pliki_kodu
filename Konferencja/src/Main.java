import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Podaj wiek");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age>=18){
			System.out.println("jestes pe³noletni");
		}
			else{
				System.out.println("jesteœ dzieckiem");
			}
		}
	}


