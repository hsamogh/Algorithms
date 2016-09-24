
public class stringCompress {
	
	public static String stringCompress(String s){
		String compressedString ="";
		if(s==null){
			return null;
		}
		else if(s==""||s==" "){
			return s;
		}
		else{
			int count=1;
			for(int i=0; i<s.length()-1;i++){
				if(s.charAt(i)==s.charAt(i+1)){
					count++;
				}
				else{
					
					compressedString+=s.charAt(i)+Integer.toString(count);
					count=1;
				}
			}
			compressedString+=s.charAt(s.length()-1)+Integer.toString(count);
		}
		
		return compressedString;
	}
	
	public static void main(String[] args){
		System.out.println(stringCompress("aanjgaaaaabcc"));
		System.out.println(stringCompress("a"));
		System.out.println(stringCompress("abc"));
	}

}
