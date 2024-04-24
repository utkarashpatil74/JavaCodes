package utkarshpatil.code;

import java.util.Arrays;

public class SmallestandLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= {-1,23,-88,56,2322};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		
		System.out.println("Present numbers: "+Arrays.toString(numbers));
		System.out.println("The largest is: "+largest);
		System.out.println("The smallest is: "+smallest);

	}

}
