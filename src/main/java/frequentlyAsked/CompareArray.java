package frequentlyAsked;

import java.util.ArrayList;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,5,7};
		int b[]= {6,1,3,7};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				
				if(a[i]==b[j]) {
					
					al.add(a[i]);
				}
			}
		}
		
		Object arr[]=al.toArray();
		
		
		for(Object i:arr) {
			System.out.println(i);
		}
		

	}

}
