package utkarshpatil.code;

public class Findthemissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the missing number in an array
		//Adding the numbers present in an array
		int a[]= {0,1,2,3,4,5};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		//Adding the numbers in proper sequence.
		int sum1=0;
		for(int j=-1;j<=6;j++) {
			
			sum1=sum1+j;
		}
		
		System.out.println(sum1);
		
		System.out.println("The missing number is: "+(sum1-sum));

	}

}
