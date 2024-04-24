package utkarshpatil.code;

import java.util.Arrays;

public class MaxAndMin {
	
	public static void max(int n[]) {
		
		Arrays.sort(n);
		
		System.out.println("Maximum number"+n[n.length-1]);
	}
	
public static void min(int n[]) {
		
		Arrays.sort(n);
		
		System.out.println("Minimum number"+n[0]);
	}

	
	public static int minimum(int c[]) {
		
		int min=c[0];
		
		for(int i=0;i<c.length;i++) {
			if(c[i]<min) {
				min=c[i];
				
			}
		}
		
		return min;
	}


	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {23,45,67,2,56,21,8};
		
		max(arr);
		int minvalue=minimum(arr);
		System.out.println("Minimum number is "+minvalue);
		
		
		
		int max=arr[0];
		int num;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max=arr[i];
				
			}
			
			
		}
		System.out.println("Maximum number is "+max);
		
		

	}

}
