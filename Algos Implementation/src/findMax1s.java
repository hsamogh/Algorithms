/***
 * 
 * Given a matrix of dimensions mxn having all entries as 1 or 0, find out the size of 
 * maximum size square sub-matrix with all 1s.
 * 
 * @author Amogh
 *
 */
public class findMax1s {
	
	public static int findMin(int a , int b , int c){
		return ((a<b)?((a<c)?a:c):((b<c)?b:c));
	}
	
	public static int findMaxSA(int[][] arr){
		int row=arr.length;
		int col=arr[0].length;
		int[][] lookup = new int[row][col];
		int maxSize=0;
		
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				if(i==0 || j==0){
					lookup[i][j]=arr[i][j];
				}
				else if (arr[i][j]==0){
					lookup[i][j]=0;
				}
				else{
					
					lookup[i][j]=1+findMin(lookup[i-1][j],lookup[i][j-1],lookup[i-1][j-1]);
					if(lookup[i][j]>maxSize){
						maxSize=lookup[i][j];
					}
				}
			}
			
		}
		//display(lookup);
		return maxSize;
	}
	
	public static void display(int[][] arr){
		int row = arr.length;
		int col= arr[0].length;
		
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args){
		//Test cases for findMin function . All values must be zero
		/*System.out.println(findMin(1,0,2));
		System.out.println(findMin(2,0,1));
		System.out.println(findMin(0,1,2));
		System.out.println(findMin(2,1,0));
		System.out.println(findMin(1,2,0));
		System.out.println(findMin(0,2,1)); */
		
		int[][] arr= new int[][]{{0,1,1,0,1,1},
			                     {1,1,0,1,1,1},
			                     {0,1,1,1,0,0},
			                     {1,1,1,1,0,0},
			                     {1,1,1,1,1,0},
			                     {0,1,1,1,0,1}};
		
        System.out.println(findMaxSA(arr));
		
	}

}
