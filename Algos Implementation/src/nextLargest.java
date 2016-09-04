/***
 * 
 * @author Amogh
 * 
 * This code is used to find the next largest element in an array. In an array
 * 
 * [1,2,1,1,2,4,5,6]
 * 
 * The next largest element of 1 is 2
 * The next largest element of 2 is 4
 * The next largest element of 1 is 2
 * The next largest element of 1 is 2
 * The next largest element of 2 is 4
 * The next largest element of 4 is 5
 * The next largest element of 5 is 6
 * The next largest element of 6 is null
 * 
 * 
 * 
 */


public class nextLargest {
	
	public static void main(String[] args){
		int[] arr = new int[]{1,2,1,3,2,4,5,5,6};
		
		getNextLargest(arr);
		
		
	}
	
	public static void getNextLargest(int[] arr){
		
		int stackTop = -1;
		
		int stack[] = new int[arr.length];
		
		for(int i=0 ; i<arr.length; i++){
			if(stackTop==-1){
				stack[++stackTop]=arr[i];
			}
			else{
				int topElement = stack[stackTop];
				if(topElement<arr[i]){
					while(stackTop>=0 && stack[stackTop]<arr[i] ){
						System.out.println("The nex largest element of "+stack[stackTop--]+" is"+arr[i]);
						
					}
					stack[++stackTop]=arr[i];
				}
				else{
					stack[++stackTop]=arr[i];
				}
			}
		}
		
		while(stackTop!=-1){
			System.out.println("The next largest element of "+stack[stackTop--]+" is NULL");
		}
	}

}
