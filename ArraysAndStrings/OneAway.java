package ArraysAndStrings;

public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="xa",s2="xab  ";
		if(s1.equals(s2))System.out.println(true);
		else if(s1.length()-s2.length()>1)System.out.println(false);
		if(s1.length()==s2.length()){
			int count=0;
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)!=s2.charAt(i)){
					if(count==1){System.out.println(false);break;}
					else count++;
				
			}
		}
			System.out.println(true);
			
			
	}else{
		String str1=s1.length()>s2.length()?s2:s1;
		String str2=s1.length()>s2.length()?s1:s2;
		int i=0,j=0,count=0;
		while(i<str1.length() && j<str2.length()){
			if(str1.charAt(i)==str2.charAt(j)){
				count++;
				i++;
				j++;
			}else{
				j++;
			}
		}
		System.out.println(count==str1.length());
	}

}
	}