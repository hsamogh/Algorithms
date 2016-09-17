/***
 * 
 *  This program returns true if two strings are permutations of each other
 *  
 *  Inputs : two strings s1 and s2
 *  Output : boolean (true if two strings are permutations are each other . else false
 * 
 */



import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class isPermutation {
	
	public static void main(String[] args){
		
		String s1="abvaa";
		String s2="vbaa";
		System.out.println(isPerm(s1,s2));
	}
	
	public static boolean isPerm(String s1, String s2){
		
		if(s1==null || s2==null){
			return false;
		}
		
		if(s1.length()!=s2.length()){
			return false;
		}
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i =0 ; i<s1.length(); i++){
			char a = s1.charAt(i);
			if(hm.containsKey(a)){
				hm.put(a, hm.get(a)+1);
			}
			else{
				hm.put(a,1);
			}
		}
		for(int i=0 ; i<s2.length(); i++){
			char a = s2.charAt(i);
			if(hm.containsKey(a)){
				hm.put(a,hm.get(a)-1);
			}
			else{
				return false;
			}
		}
		for(char s : hm.keySet()){
			if(hm.get(s)!=0){
				return false;
			}
		}
		
		return true;
	}

}
