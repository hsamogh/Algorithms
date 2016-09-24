/*** 
 * 
 * Given two integer arrays where second array is duplicate of first array with just 1 element missing. Find the element.
 * Example: 
 *
 * Input:
 * Array1 - 9 7 8 5 4 6 2 3 1
 * Array2 - 2 4 3 9 1 8 5 6
 *
 * Output:
 * 7
 * 
 * */



public class missingNumber {
	
	public static Integer findMissing(int[] arr1 , int[] arr2){
		if(arr1==null || arr2==null){
			return null;
		}
		if(arr1.length==arr2.length){
			return null;
		}
		int number=0;
		
		for(int i=0 ; i<arr1.length; i++){
			//System.out.println(number);
			number^=arr1[i];
		}
		for(int i=0; i<arr2.length; i++){
			//System.out.println(number);
			number^=arr2[i];
		}
		
		return number;
	}
	
	public static void main(String[] args){
		int[] arr1 = new int[]{9,7,8,5,4,6,2,3,1};
		int[] arr2 = new int[]{2,4,3,9,1,8,5,6};
		
		System.out.println(findMissing(arr1,arr2));
	}
	

}
