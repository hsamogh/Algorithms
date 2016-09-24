
public class matrixZero {
	
	public static int[][] makeZeros(int[][] mat){
		
		boolean rowZero=false;
		boolean columnZero=false;
		int row=mat.length;
		int col=mat[0].length;
		
		for(int i=0; i<row; i++){
			if(mat[i][0]==0){
				rowZero=true;
			}
		}
		
		for(int i=0; i<col; i++){
			if(mat[0][i]==0){
				columnZero=true;
			}
		}
		
		for(int i=1; i<row; i++){
			for(int j=1; j<col; j++){
				if(mat[i][j]==0){
					mat[0][j]=0;
					mat[i][0]=0;
				}
			}
		}
		
		for(int i=0; i<row; i++){
			if(mat[i][0]==0){
				for(int j=0; j<col; j++){
					mat[i][j]=0;
				}
			}
		}
		
		for(int i=0; i<col; i++){
			if(mat[0][i]==0){
				for(int j=0; j<row; j++){
					mat[j][i]=0;
				}
			}
		}
		
		if(rowZero==true){
			for(int i=0; i<row; i++){
				mat[i][0]=0;
			}
		}
		if(columnZero==true){
			for(int i=0; i<col; i++){
				mat[0][i]=0;
			}
		}
		return mat;
	}
	
	public static void display(int[][] mat){
		int row=mat.length;
		int col=mat[0].length;
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args){
		
		int[][] mat =  new int[][]{{1,3,2},{2,4,1},{0,5,6}};
		System.out.println("before adding zeros");
		display(mat);
		System.out.println("after adding zeros");
		mat= makeZeros(mat);
		display(mat);
	}

}
