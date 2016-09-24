import java.util.Arrays;

/***
 * 
 * @author Amogh
 *
 * Find the element that occurs only once in a given set of integers while all the other numbers occur thrice.
 * 
 * Example -  
 * Input : 3 3 3 4
 * Output: 4
 *
 * Input : 5 5 4 8 4 5 8 9 4 8
 * Output: 9
 *
 */



public class numberOnlyOnce2 {

	public static Integer occuringOnce(int[] arr,int n){
		if(arr==null){
			return null;
		}
		int number=0;
		
		for(int i=0; i<32; i++){
			int sum=0;
			for(int j=0; j<arr.length; j++){
				int ithbit=1<<i;
				if((arr[j]&ithbit)==ithbit){
					sum=sum+1;
				}
			}
			sum=sum%n;
			if(sum>0){
				number|=(1<<i);
			}
		}
		return number;
	}
	
	public static void main(String[] args){
		
		int arr[] = new int[]{2,2,2,-4,3,3,3};
		int n = 3;
		System.out.println(occuringOnce(arr,n));
		
	}
}
