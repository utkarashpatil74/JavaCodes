package frequentlyAsked;

import java.util.ArrayList;

public class UniqueElements {

	public static void main(String[] args) {
		
		int arr[]= {4,5,5,5,4,6,9,4};
		
		ArrayList<Integer> ar=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			
			int k=0;
			if(!ar.contains(arr[i])) {
				
				ar.add(arr[i]);
				k++;
				
				for(int j=i+1;j<arr.length;j++) {
					
					if(arr[i]==arr[j]) {
						k++;
					}
					
					
				}
				if(k==1)
				{
					System.out.println(arr[i]+" is the unique number");
				}
			}
			
		}
		
		
	}

}
