/***
 * 
 * This program converts string into url by replacing blanks with %20% . However the
 * leading and trailing spaces are left untouched
 * 
 * @author Amogh
 *
 */

public class urlify {
	
	public static void main(String[] args){
		String s1= "Mr John Smith    ";
		
		System.out.println(convertToUrl(s1,13));
	}
	
	public static String convertToUrl(String text, int trueLength){
		char[] strArray = text.toCharArray();
		
		for(int i=trueLength-1; i>0; i--){
			if(strArray[i]==' '){
				text=text.substring(0,i)+"%20"+text.substring(i+1);
			}
		}
		return text;
	}

}
