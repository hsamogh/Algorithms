import java.util.*;
public class stage1 {
	
	public static void main(String[] args){
		
		Scanner s1= new Scanner(System.in);
		String s=s1.nextLine();
		System.out.println(s);
		while(s.length()!=0){
			
			s= s1.nextLine();
			String[] ls = s.split(" ");
			if(ls[0].equals("job")){
				System.out.println(s);
				
			}
			else if(ls[0].equals("worker")){
				System.out.println(s);
			}
			
		}
		
	}

}
