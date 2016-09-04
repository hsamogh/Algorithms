/*
 * 
 *  Program to find peak element in an array. An element in an array is said to be a 
 *  peak element if it is greater than the element to its left and element to its right
 *  
 *  @author : Amogh Huilgol
 * 
 * */
public class peakElement {
	
	public static void main(String[] args){
		
		int a[] = new int[]{1,2,1,3,2,4,5,5,6};
		int peakElement=0;
		boolean peakElementFoundFlag=false;
		int low=0;
		int mid=0;
		int high=a.length-1;
		while(low<high){
		
			mid=(low+high)/2;
			System.out.println("low is "+low+" mid is "+mid+" high is "+high);
			if((a[mid]>=a[mid+1]|| mid==0) && (a[mid]>=a[mid-1]|| mid==a.length-1) ){
				peakElementFoundFlag=true;
				peakElement=a[mid];
				break;
			}
			else if(a[mid+1]>=a[mid]){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		
		if(peakElementFoundFlag){
			System.out.println("Peak element is"+peakElement);
		}
		else{
			System.out.println("Peak Element not found");
		}
	}

}
