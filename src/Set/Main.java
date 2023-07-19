package Set;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		NumberSetService nss = new NumberSetService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(nss.numbers);
			System.out.println("add |  check | remove");
			String choice  = sc.nextLine();
		
			
			if(choice.equals("add")) {
				nss.addToNumbers(Integer.parseInt(sc.nextLine()));
				
			}else if(choice.equals("check")) {
				boolean b = nss.checkNumbers(Integer.parseInt(sc.nextLine()));
			
						if(b) {
							System.out.println("Number exist in the Set ");
								
			}else {
				//String val = sc.nextLine();		
							System.out.println("Number  does not exist in the list");
			}
				
			}else if(choice.equals("remove")) {
						System.out.println("enter the value to remove");
						String key = sc.nextLine();
						int num = Integer.parseInt(key);
						nss.removeNumbers(num);
					
				}
			}
		}
	}


