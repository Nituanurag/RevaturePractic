package Map;
import java.util.*;

/* Map interface does not extend the collection interface.
 * */
public class DictionaryService {
	Map <String, String> words;
	
	public DictionaryService() {
		words = new HashMap<>();
	}
	
	public String retriveDefinitation(String word) {
		return words.get(word);
		}
	
public void addWordDefinition(String word, String Defination) {
	words.put(word, Defination);
	
}
}
