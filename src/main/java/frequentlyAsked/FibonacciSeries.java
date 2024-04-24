package frequentlyAsked;

import java.util.ArrayList;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fabonaciiSeries(7);

	}

	private static void fabonaciiSeries(int number) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int sum=0;
		int i=1;
		
		while(number<9) { //0 1 2 3
			
			
			sum=a+b; //1
			System.out.println(sum); //1
			a=b;
			b=sum;
			number++;
			
		}
		
		
		
		
	}

}
