package Practice;

import java.util.Scanner;

public class Hacker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b[]=new int[a];
        
        for(int i=0;i<a;i++){
            
            b[i]=sc.nextInt();
            
            System.out.println(b[i]+ " can be fitted in:\n");
            
            if(b[i]<=-128 && b[i]>=127) {
            	System.out.println("* byte");
            }
            else if(b[i])
        }
        
        

	}

}
