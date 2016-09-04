/***
 * 
 * 
 * @author : Amogh Huilgol
 * 
 * This program is used to convert an unfair coin where the probability of heads 
 * occuring is p and probability of tails is 1-p to a fair coin having probability of 
 * 0.5 for heads and tails
 * 
 * 
 * */
public class fairCoinProblem {
	
	public static void main(String[] args){
	 int d1=0 ; //decision 1 (coin is flipped first time)
	 int d2=0 ; //decision 2 (coin is flipped second time)

	 while(d1==d2){
		 
		 d1= (int) Math.round(Math.random());
		 d2 =(int) Math.round(Math.random());
		 
	 }
	 
	 if(d1==0){
		 System.out.println("heads");
	 }
	 else{
		 System.out.println("tails");
	 }

	 
	}

}
