import java.util.*;

public class isPalindrome {
	
	public static void main(String[] args){
		
		String s1= "aabbcc";
		String s2="aabbccc";
		String s3="aabbc";
		String s4="abbc";
		System.out.println(canBePal(s1));
		System.out.println(canBePal(s2));
		System.out.println(canBePal(s3));
		System.out.println(canBePal(s4));
	}
	
	public static boolean canBePal(String s1){
		if(s1.length()==1){
			return true;
		}
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		boolean oddFlag=false;
		
		for(int i=0; i<s1.length(); i++){
		 char a = s1.charAt(i);
		 if(hm.containsKey(a)){
			 hm.put(a,hm.get(a)+1);
		 }
		 else{
			 hm.put(a,1);
		 }
		}
		
		for(char a : hm.keySet()){
			
			if(hm.get(a)%2!=0 && oddFlag){
				return false;
			}
			if(hm.get(a)%2==1){
				oddFlag=true;
			}
			
		}
		return true;
	}

}
