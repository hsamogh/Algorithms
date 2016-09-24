import java.util.Arrays;

public class islandProblem {
	
	public static Integer  getIslandCount(int[][] mat){
		int islandCount=0;
		
		int row = mat.length;
		int col = mat[0].length;
		boolean visited[][]= new boolean[row][col];
		for(boolean[] bool : visited){
			Arrays.fill(bool, false);
		}
		for(int i=0 ;i<row; i++){
			for(int j=0; j<col; j++){
				if(mat[i][j]==1 && visited[i][j]==false){
					islandCount++;
					doDfs(mat,i,j,visited);
				}
			}
			
		}
		
		return islandCount;
	}
	
	public static void doDfs(int[][] mat, int i, int j, boolean[][] visited){
		
		int row = mat.length;
		int col=mat[0].length;
		
		if(i>=row || j>=col || i<0 || j<0 || visited[i][j] || mat[i][j]==0 ){
			return;
		}
		else{
			visited[i][j]=true;
			doDfs(mat,i+1,j,visited);
			doDfs(mat,i,j+1,visited);
			doDfs(mat,i+1,j+1,visited);
			doDfs(mat,i,j-1,visited);
			doDfs(mat,i-1,j,visited);
			doDfs(mat,i-1,j-1,visited);
			doDfs(mat,i-1,j+1,visited);
			doDfs(mat,i+1,j-1,visited);
		}
	}
	
	public static void main(String[] args){
		
		int[][] mat = new int[][]{{1,0,1,0,1}, {1,1,0,0,0},{0,1,0,1,1}};
		int x = getIslandCount(mat);
		System.out.println(x);
	}

}
