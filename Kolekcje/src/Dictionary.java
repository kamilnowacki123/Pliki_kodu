import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Podaj s�owo po Polsku");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("kot", "cat");
		dictionary.put("pies", "dog");
		dictionary.put("cze��", "hi");
		dictionary.put("witam", "welcome");
		dictionary.put("��w", "tortoise");
		dictionary.put("samoch�d", "car");
		if (dictionary.containsKey(word)){
			System.out.println("S�owo po Angielsku to: "+dictionary.get(word));
		}
		else{
			System.out.println("Nie znaleziono s�owa w s�owniku");
		}
			
	}

}
