package program.assignment;

public class Palindrome {
	public static void main(String[] args) {
		//Declare the String with value
	String name="madam";
	//Declare the empty String
	String emp="";
	//covert the String into Array
	char[] charArray = name.toCharArray();
	//Find the aarray length
	int length = charArray.length;
	//Iterate the value
	for (int i = length-1; i >= 0 ; i--) {
		//store the values in empty string
		emp=emp+charArray[i];
	}
	//To check the declared string and reversed string in same or not 
	if (name.equals(emp)) {
		//print output if it is same
		System.out.println("The Given String is palindrome");
	}
	else {
		//print output if it not same 
		System.out.println("The Given String is not a palindrome");
	}
}
}