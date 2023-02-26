package program.assignment;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	//Using Scanner class to get input from user
	Scanner scan=new Scanner(System.in);
	//display the message
	System.out.println(" Enter your name : ");
	//Store the string value as reverse
	String reverse=scan.nextLine();
	
	//Convert the String into Array
	char[] a = reverse.toCharArray();
	//store array length as length variable
	int length = a.length;
	//Iterate the length using reverse for loop
	for (int i = length-1; i>=0; i--) {
		//print the out of the reversed value
		System.out.println(a[i]);
	}
}
}
