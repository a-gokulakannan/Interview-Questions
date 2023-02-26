package program.assignment;

import java.util.Arrays;

public class MissingElement {
public static void main(String[] args) {
	//Declare a array
	int[] num= {2,5,6,8,9,1,3,4};
	//sort the array
	Arrays.sort(num);
	//store the Array length as 'n'
	int n=num.length+1;
	//find the missing element using math formula
	int sum=n*(n+1)/2;
	//Using for loop to iterate the Array
	for (int i = 0; i < num.length; i++) {
		//subtract the values and find the missing element
		sum=sum-num[i];
	}
	//print the missing element
	System.out.println(sum);
}

}