package program.assignment;

public class FindCharacterOccurance {
	public static void main(String[] args) {
		// declare a string using word as a variable name 
				String word="Testleaf";
				// declare temporary variable
				int count=0;
				// convert string into to character array
				char[] charArray=word.toCharArray();

				// iterate the value
				for(int i=0; i<charArray.length;i++)
				{
					// use if condition if it match increase index
					if(charArray[i]=='e') {
						count++;
					}					
				}
				// print the output 
				System.out.println(count);
			}
	}

