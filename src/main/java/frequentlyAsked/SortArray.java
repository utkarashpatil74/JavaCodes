package frequentlyAsked;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,5,7,3,6,2};
		
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i:a) {
			System.out.println(i);
		}

	}

}
