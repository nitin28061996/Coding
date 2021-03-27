package ArraysAndStrings;

import java.util.Arrays;

public class CheckPermutation {
	 //Input- Two strings ; Output - boolean 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="adc",s2="dcda";
		int k=s1.length();
		for(int i=0;i<s2.length()-k + 1 ;i++){
			 //System.out.println(s2.substring(i,i+k));
			 boolean check=checkValue(s2.substring(i,i+k),s1);
	            if(check == true)System.out.println(true);
		}
        System.out.println(false);
	}
	 public static boolean checkValue(String s2, String s1){
	        s2=sortString(s2);
	        s1=sortString(s1);
	        System.out.println(s1+"."+s2);
	        if(s1.equals(s2))return true;
	        else return false;
	    }
	    public static String sortString(String inputString) 
	    { 
	        // convert input string to char array 
	        char tempArray[] = inputString.toCharArray(); 
	          
	        // sort tempArray 
	        Arrays.sort(tempArray); 
	          
	        // return new sorted string 
	        return new String(tempArray); 
	    } 
	
}


