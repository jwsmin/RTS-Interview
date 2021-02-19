
public class rts {
	
	//#``1  Print the number of integers in an array that are above the given input and the number that are below
	//e.g. for the array [1, 5, 2, 1, 10] with input 6, print “above: 1, below: 4”.
	public static String aboveBelow(int[] arr, int num) {
		
		
		int above = 0, below = 0;
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] < num) {
				below++;
			}
			if(arr[i] > num) {
				above++;
			}
		}
		return "Above: "+ above + " Below: "+ below;
	}
	
	//#2  Rotate the characters in a string by a given input and have the overflow appear at the beginning, 
	//e.g. “MyString” rotated by 2 is “ngMyStri”.
	public static String rotate(String str, int offset) {
		String result = "";
		int shift = offset % str.length();
		result = str.substring(str.length()-shift) + str.substring(0,str.length()-shift);
		return result;
    }

	
	//#3  If you could change 1 thing about your favorite framework/language/platform (pick one), what would it be?
	/*One thing I would change about Java is to remove null. Null is very ambiguous in Java, as it has several meanings.
	It can represent an error, empty, or a variable is uninitialized. With these different meanings a lot of errors can be made.  
	*/
	 public static void main(String[] args)
	  {
    	 int test[] = {1, 2, 3, 4, 5};
    	 int test2[] = {1, 2, 3, 4, 5};
    	 int test3[] = {1, 5, 2, 1, 10};
		 System.out.println(aboveBelow(test, 3));
		 System.out.println(aboveBelow(test2, 6));
		 System.out.println(aboveBelow(test3, 6));
		 
		 System.out.println(rotate("MyString", 2));

		 
	  }
}

	

