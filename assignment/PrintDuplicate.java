package program.assignment;

public class PrintDuplicate {
	public static void main(String[] args) {
		//Declare a Array
		int[] number = {11,22,33,44,55,66,22,77,11};
		//using nested for loop to interate the given array with array length
       for (int i = 0; i < number.length; i++) {
		for (int j = i+1; j < number.length; j++) {
			//check the iterated value if it same it will get print
			if(number[i]==number[j]) {
				//print the output
				System.out.println(number[i]);
			}
		}
	}	
	}
}
