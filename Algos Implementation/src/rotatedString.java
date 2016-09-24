
public class rotatedString {
	
	public static boolean checkRotated(String s, String t){
		
		if((s+s).indexOf(t)>-1){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		
		System.out.println(checkRotated("llohe","hello"));
		System.out.println(checkRotated("llhe","hello"));
	}

}
