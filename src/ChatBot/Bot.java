package ChatBot;

import java.util.*;

/**
 * @author Malachi
 *This is the class which gathers the initial information about the
 *user and will hand off to the algorithm for handling other questions
 */
public class Bot {
	
	
	private static Random rand;
	private static Scanner scan;
	private static Bot bot;
	private static String greeting;
	
	//The following two sets are for generic yes/no questions and checking as such
	private static Set<String> yes = new HashSet<String>(Arrays.asList(
	        "y", "yes", "yep", "yeah"));
	
	private static Set<String> no = new HashSet<String>(Arrays.asList(
	        "no", "n", "nope", "nah", "wrong"));
	
	private static String gender;
	private static String response;
	


	public Bot(){
		rand = new Random();
		scan = new Scanner(System.in);
		
	}
	
	/**
	 * This function will handle the first thing bot says
	 * @return greeting
	 */
	public String greeting(){
	String greet1 = "Sup Doge, im Shiba";
	String greet2 = "Doot doot";
	String greet3 = "Hiya, im Shiba!";
	int randInt = rand.nextInt(3)+1;
	String greeting = null;
	switch (randInt){
		case 1: greeting = greet1;
				break;
		case 2: greeting = greet2;
				break;
		case 3: greeting = greet3;	
				break;
		}
	return greeting;
	
	}
	
	/**
	 * This function will collect info on the gender of the user
	 * Additionally, it will try to guess the user's gender based off 
	 * of a simple idea that many female names end in vowels of
	 * 'a' or 'y', such as Irina or Sally.
	 * @param name
	 * @return String response
	 */
	public static String gender(String name)
	{
		String ans1 = null;
		char vowel = name.charAt(name.length() - 1);
		if (vowel == 'a' || vowel == 'y'){
			System.out.println("So are you a girl?");
			ans1 = scan.nextLine().trim().toLowerCase();
			if(yes.contains(ans1)){
				gender = "girl";
				response = "That would explain why you are so pretty!";
				}
			else{
			System.out.println("You a guy then!");
			gender = "boy";
			response ="cool dude";
			}
		}
		else{
			System.out.println("So you are a guy right?");
			ans1 = scan.nextLine().trim().toLowerCase();
			if(yes.contains(ans1)){
				gender = "boy";
				response = "I knew it bro";
				}
			else{
			System.out.println("You are a girl then...");
			gender = "girl";
			response ="sorry that I guessed wrong";
			}
			
		}
		return response;
	}
	
	/**
	 * This is the main method which will serve the interactions between user and bot
	 * @param args
	 */
	public static void main(String[] args) {
		bot = new Bot();
		System.out.println(bot.greeting());
		System.out.println("Anyways, what is you name?");
		String name = scan.nextLine();
		String response = name;
		System.out.println(Bot.gender(response));
		User use = new User(name,gender);
		//TODO we need to add in something that can now handle most input
		//this right now is made as a starting point, we should talk more Derek

	}

}
