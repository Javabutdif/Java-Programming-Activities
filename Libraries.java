import java.util.LinkedList;

public class Libraries {
	 static LinkedList<String> libraries = new LinkedList<String>();
	
	static LinkedList<String> getLibraries() {
		
		libraries.offer("Maria Clara Version 1");
		libraries.offer("Brandon Life Habits");
		libraries.offer("Kyle Tragic Stories");
		libraries.offer("Jude Ketchup Mayonnaise");
		
		
		return libraries;
	}
}
