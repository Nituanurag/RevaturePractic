package Set;

import java.util.*;

public class NumberSetService {
	Set<Integer> numbers;
	
	public NumberSetService() {
		numbers = new HashSet<>();
		//numbers = new LinkedHashSet<>();
	}

	public void addToNumbers(int num) {
		this.numbers.add(num);
		
	}
	
	public boolean checkNumbers(int num) {
		return numbers.contains(num);
	}
//	public int getnumbers(int num) {
//		return num;
//	}
	
	public void removeNumbers(int num) {
		numbers.remove(num);
	}
}
