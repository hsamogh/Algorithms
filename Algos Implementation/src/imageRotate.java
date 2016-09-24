
public class imageRotate {
	
	public static int[][] imageRotate(int[][] img){
		
		if(img==null){
			return null;
		}
		if(img.length!=img[0].length){
			return new int[][]{{0}};
		}
		
		int row = img.length;
		int temp;
		for(int i=0; i<row/2; i++){
			for(int j=0; j<row-1-i; j++){
				temp=img[i][j];
				img[i][j]=img[j][row-i-1];
				img[j][row-i-1]=img[row-1-i][row-1-j];
				img[row-1-i][row-1-j]=img[row-1-j][i];
				img[row-1-j][i]=temp;
			}
		}
		
		return img;
	}
	
	public static int[][] imageRotateClockwise(int[][] img){
		if(img==null){
			return null;
		}
		if(img.length!=img[0].length){
			return new int[][]{{0}};
		}
		
		int row = img.length;
		int temp;
		for(int i=0; i<row/2; i++){
			for(int j=0; j<row-1-i; j++){
				temp=img[i][j];
				img[i][j]=img[row-j-1][i];
				img[row-j-1][i]=img[row-1-i][row-1-j];
				img[row-1-i][row-1-j]=img[j][row-1-i];
				img[j][row-1-i]=temp;
			}
		}
		
		return img;
	}
	/*Used for printing square matrix on console*/
	public static void display(int[][] img){
		for(int i=0; i<img.length; i++){
			for(int j=0; j<img.length; j++){
				System.out.print(img[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args){
		int[][] img = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Before rotating");
		display(img);
		img=imageRotateClockwise(img);
		System.out.println("After rotating");
		display(img);
	}

}
