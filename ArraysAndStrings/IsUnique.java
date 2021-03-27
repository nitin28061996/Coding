package ArraysAndStrings;

public class IsUnique {

	public static void main(String[] args) {
//Naive Approach - TC O(NlogN) ; SC O(1)
//	        Arrays.sort(chArray);
//	 
//	        for (int i = 0; i < chArray.length - 1; i++) {
//	            // if the adjacent elements are not
//	            // equal, move to next element
//	            if (chArray[i] != chArray[i + 1])
//	                continue;
//	 
//	            // if at any time, 2 adjacent elements
//	            // become equal, return false
//	            else
//	                return false;
//	        }
//	        return true;
		
		
		//Approach 2 - TC O(N) ; SC O(N)
		//Using HashSet
		
		
		//Efficient Approach - TC O(N) ; SC O(1)
		String str="abc";
		 // Assuming string can have characters a-z
        // this has 32 bits set to 0
        int checker = 0;
 
        for (int i = 0; i < str.length(); i++) {
            int bitAtIndex = str.charAt(i) - 'a';
            // if that bit is already set in checker,
            // return false
           
           
            System.out.println((1 << bitAtIndex));
            if ((checker & (1 << bitAtIndex)) > 0)
                System.out.println(false);
 
            // otherwise update and continue by
            // setting that bit in the checker
            checker = checker | (1 << bitAtIndex);
            
        }
 
        // no duplicates encountered, return true
        System.out.println(1<<7);
	}
	

}
