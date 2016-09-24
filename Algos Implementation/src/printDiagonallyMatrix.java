/***
 * 
 * Given a matrix of mxn dimensions, print the elements of the matrix in diagonal order.
 * Source : http://www.ideserve.co.in/learn/print-matrix-diagonally
 * 
 * @author Amogh
 *
 */

public class printDiagonallyMatrix {
	
	public static void printDiagonally(int[][] mat){
		
		if(mat==null){
			System.out.println("Matrix passed is null . cannot print diagonally");
			return;
		}
		
		
		int row=mat.length;
		int column=mat[0].length;
		
		for(int i=0; i<row; i++){
			for(int k=i,j=0; k>=0 &&j<column; j++,k--){
				System.out.print(mat[k][j]+" ");
			}
			System.out.println("");
		}
		
		for(int i=1; i<column; i++){
			for(int j=i,k=row-1; k>=0 && j<column ; k--,j++){
				System.out.print(mat[k][j]+" ");
			}
			System.out.println("");
		}
		
		
	}
	
	public static void main(String[] args){
		
		int[][] mat = new int[][]{{1,2,3,4,5},
			                      {6,7,8,9,10},
			                      {11,12,13,14,15},
			                      {16,17,18,19,20}
			                      };
	    printDiagonally(mat);
		
	}

}
