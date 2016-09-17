import java.util.*;
public class isPalindromeBS {
	
	public static void main(String[] args){
		String s1= "abcac";
		String s2="aca";
		String s3="aa";
		
		System.out.println(canBePal(s1));
		System.out.println(canBePal(s2));
		System.out.println(canBePal(s3));	
	}
	
	public static boolean canBePal(String s){
		
		String s1 = s.toLowerCase();
		BitSet b1 = new BitSet(26);
		boolean trueFlag=false;
		
		for(int i=0 ; i<s1.length(); i++){
			b1.flip(s1.charAt(i)-97);
		}
		
		for(int i=0; i<26; i++){
			if(b1.get(i)==true && trueFlag==false ){
				trueFlag=true;
			}
			else if(b1.get(i)==true){
				return false;
			}
		}
		return true;
	}

}
