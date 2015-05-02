/**
 * 
 */
package ChatBot;

/**
 * @author Malachi
 * This class wil store information relevent to the user. Such examples are the name of the user and the gender.
 * Method
 *
 */
public class User {

	private String name;
	private String gender;
	/**
	 * This is the constuctor of the User class. As of now it will
	 * constuct the a user object using only a name and gender
	 * @param name
	 * @param gender
	 */
	public User(String name, String gender){
		this.setName(name);
		this.setGender(gender);
	}
	
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
}
