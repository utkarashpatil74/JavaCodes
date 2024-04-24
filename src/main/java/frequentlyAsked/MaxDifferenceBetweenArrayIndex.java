package frequentlyAsked;

import java.util.ArrayList;

public class MaxDifferenceBetweenArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,4,8,15,17};
		
		
		
		int diff=0;
		
		for(int i=0;i<arr.length-1;i++) {
		    
			
				
				int v=arr[i+1]-arr[i];
				if(v>diff) {
					diff=v;
					
				}
				
				
				
				
			
			
			
		}
		System.out.println(diff);
		
	
		
		
		
		

	}

}
