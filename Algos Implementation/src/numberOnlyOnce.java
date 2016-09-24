
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

public class numberOnlyOnce {

	public static int occuringOnce(int[] arr, int n){
		int number=0;
		int bitArray[] = new int[32];
		
		Arrays.fill(bitArray,0);
		
		for(int i=0 ; i<arr.length; i++){
			int elem = arr[i];
			
			for(int j=0; j<32; j++){
				int kbit = 1<<j;
				if((elem&kbit)==kbit){
					bitArray[j]+=1;
				}
			}
		}
		
	
		for(int i=0; i<32; i++){
			bitArray[i]%=n;
		}
		
		int el=1 , num=0;
		
		for(int i=0; i<32; i++){
			if(bitArray[i]==1){
				number+=el;		
			}
			el*=2;
		}
		
		return number;
	}
	
	public static void main(String[] args){
		int arr[] = new int[]{2,2,2,-6,3,3,3};
		int n = 3;
		System.out.println(occuringOnce(arr,n));
	}
}

