package ArraysAndStrings;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abbbbbbbbbbbcd";
		String res="";
		if(s.length()<2) System.out.println(s);
		int count=1;
		char curr_char=s.charAt(0);
		for(int i=1;i<s.length();i++){
			char next_char=s.charAt(i);
			
			if(next_char==curr_char){
				
				count++;
			}else{
				System.out.println(curr_char +","+count);
				res=res + curr_char + count;
				count =1;
				curr_char=next_char;
			}
		}
		res=res + curr_char + count;
		System.out.println(res.length() > s.length() ? s : res);
	}

}
