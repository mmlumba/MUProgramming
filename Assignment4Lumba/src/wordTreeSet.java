import java.util.Iterator;
import java.util.TreeSet;
import java.util.regex.*;

/**
 * This program takes a string of text from one of Charles Dickens' works, and
 * 	prints all unique words along with the count of the unique words. First, the
 *  string is placed in Matcher wordMatcher to differentiate what is a word 
 *  using a regex. Next, a while loop iterates through wordMatcher and adds all
 *  unique words to a group. Finally, an iterator goes through the group created
 *  from the listword.add() method and prints each of these words in a new line.
 *  The program finishes off by printing the count of unique words using the
 *  listWord.size() method.
 *  
 * @author Marian Lumba
 * @version 1.0
 */

public class wordTreeSet {
	
	public static TreeSet<String> listWord;
	
	private static String dickens;
	
	public static void main(String[] args) {
		listWord = new TreeSet<String>();
		
		dickens = "Whether I shall turn out to be the hero of my own life, or whether that station will be held by anybody else, these pages must show. To begin my life with the beginning of my life, I record that I was born (as I have been informed and believe) on a Friday, at twelve o'clock at night. It was remarked that the clock began to strike, and I began to cry, simultaneously.";
		
		Matcher wordMatcher = Pattern.compile("([\\w']+)").matcher(dickens);
		
		while(wordMatcher.find()){
			listWord.add(wordMatcher.group());
		}
		Iterator listTreeWords = listWord.iterator();
		while(listTreeWords.hasNext()){
			System.out.println(listTreeWords.next());
		}
		
		System.out.println("The size of the Tree Set is " + listWord.size() + ".");
	}
}
