/**
 * A description of the class, what it represents or what its goal is.
 * 
 * Some of this documentation might seem excessive in such a simple class,
 * but this documentation is essential when the code becomes more complex.
 * 
 * @author Stephen Cerbone
 *
 */
public class ProperDocumentation {
	
	/**
	 * Any variables that aren't painfully clear what they are (this variable is quite clear) or why they are needed
	 * should have documentation on them as well.
	 */
	private String myName;
	
	/**
	 * The age of the user.
	 */
	private static int myAge;
	
	
	public static void main (String[] args)
	{
		myFunction();
		
		String myString = helloString();
		int myInt = addOne(42);
	}
	
	
	/**
	 * Function documentation explains what a function does,
	 * what its parameters are and what it will return, if anything.
	 * 
	 * The descriptions should be short and to the point, but informative
	 * enough so that someone doesn't have to read the code to understand
	 * the function.
	 */
	private static void myFunction(){
		//inline comments like this can help explain the code underneath it.
		
		// keep 		lines 			relatively		short. 			they 		can 		be 		hard 		to 			read 		if 		too 			long.							Thanks :)
	}
	
	/**
	 * Say hello to the user
	 * @return a greeting
	 */
	private static String helloString(){
		return "Hello World!";
	}
	
	/**
	 * Increment my integer by one. Used in counting.
	 * @param myInt the integer to increment by one
	 * @return the integer with one added to it
	 */
	private static int addOne(int myInt){
		return myInt+1;
	}
}
