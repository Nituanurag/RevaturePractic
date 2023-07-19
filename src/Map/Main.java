package Map;

import java.util.Scanner;

import Set.NumberSetService;

public class Main {

	public static void main(String[] args) {
		DictionaryService ds = new DictionaryService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(ds.words);
			System.out.println("put | get ");
			String choice  = sc.nextLine();
			
			if(choice.equals("put")) {
				System.out.println("enter a key");
				String key = sc.nextLine();
				System.out.println("enter a value");
				String value = sc.nextLine();
				ds.addWordDefinition(key, value);
			}else if(choice.equals("get")){
				System.out.println("enter a key");
				String key = sc.nextLine();
				}
			}
			
			

	}

}
