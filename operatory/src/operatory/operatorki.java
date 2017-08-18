package operatory;

import java.util.Scanner;

public class operatorki {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String password;
		do{
			System.out.println("Podaj has³o");
			password = sc.next();
		}while(!password.equals("Akademia"));
		System.out.println("Przyznano dostêp");
		}
	}
