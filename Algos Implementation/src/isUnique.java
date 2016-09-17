import java.util.BitSet;
public class isUnique {
	
	public static void main(String[] args){
		String s1= "Amogh";
		String s2="Huilgol";
		System.out.println("AMogh is unique??"+ isUnique(s1));
		System.out.println("Huilgol i unique??"+ isUnique(s2));
	}
	
	public static boolean isUnique(String word){
		if(word==null){
			return false;
		}
		if(word==""||word==" "){
			return true;
		}
		BitSet b1 = new BitSet(26);
		for(int i=0; i<word.length(); i++){
			char a = word.toLowerCase().charAt(i);
			if(b1.get(a-97)==true){
				return false;
			}
			else{
				b1.set(a-97);
			}
		}
		
		return true;
	}

}
