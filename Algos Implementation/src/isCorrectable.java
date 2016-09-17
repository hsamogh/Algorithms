import java.util.*;

public class isCorrectable {
	
	public static boolean isCorrectable(String s1 , String s2){
		
		HashSet<Character> hs = new HashSet<Character>();
		
		for(int i=0; i<s1.length(); i++){
			hs.add(s1.charAt(i));
		}
		
		for(int i=0; i<s2.length(); i++){
			if(hs.contains(s2.charAt(i))){
				hs.remove(s2.charAt(i));
			}
			else{
				hs.add(s2.charAt(i));
			}
		}
		if(hs.size()>2){
			return false;
		}
		else{
		return true;
		}
	}
	
	public static void main(String[] args){
	
		System.out.println(isCorrectable("pale","ple"));
		System.out.println(isCorrectable("pales","pale"));
		System.out.println(isCorrectable("pale","bale"));
		System.out.println(isCorrectable("pale","bake"));
		
		System.out.println(isCorrectable("ple","pale"));
		System.out.println(isCorrectable("pale","pales"));
		System.out.println(isCorrectable("bale","pale"));
		System.out.println(isCorrectable("bake","pale"));
	}

}
