package ArraysAndStrings;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="rowdy",s2="dyrow";
		System.out.print(isSubstring(s1+s1, s2));
	}
	static boolean isSubstring(String s1,String s2){
		System.out.println(s1);
		return s1.contains(s2);
	}

}
