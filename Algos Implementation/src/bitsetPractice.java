import java.util.BitSet;

public class bitsetPractice {
	
	public static void main(String[] args){
	BitSet b1 = new BitSet(8);
	int arr[] = new int[]{-1,3,2,4,6,7};
	int count=0;
	int maxCount=0;
	for(int i=0; i<arr.length; i++){
		b1.set(arr[i]);
	}
	
	for(int i=0 ; i<b1.length(); i++){
		if(b1.get(i)==true){
			count++;
		}
		else{
			if(maxCount<count){
				maxCount=count;
			}
		}
	}
	
System.out.println(b1);
	}

}
