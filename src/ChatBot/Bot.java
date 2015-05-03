package ChatBot;

import java.util.*;

/**
 * @author Malachi
 *
 */
public class Bot {
	
	
	private static Random rand;
	@SuppressWarnings("unused")
	private Scanner scan;

	public Bot(){
		rand = new Random();
		scan = new Scanner(System.in);
		
	}
	
	/**
	 * @return greeting
	 */
	public static String greeting(){
	String greet1 = "Sup Doge, im Shiba";
	String greet2 = "Doot doot";
	String greet3 = "Hiya, im Shiba!";
	int randInt = rand.nextInt(3) + 1;
	String greeting = null;
	switch (randInt){
		case 1: greeting = greet1;
		case 2: greeting = greet2;		
		case 3: greeting = greet3;	
		}
	return greeting;
	
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
