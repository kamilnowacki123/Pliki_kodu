import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		System.out.println("Podaj liczb� : ");
		// Scanner s�u�y do odczytywania danych
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number>0){
			System.out.println("Liczba wi�ksza od zera");
		}
		else
			System.out.println("Liczba mniejsza od zera");
	}

}
