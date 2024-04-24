package frequentlyAsked;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,5,5,5,4,6,9,4};
		
		HashMap<Integer,Integer> hm=new HashMap<>();
		
		for(int i:arr) {
			
			if(hm.containsKey(i)) {
				hm.put(i,hm.get(i)+1);
			}
			else {
				hm.put(i,1);
			}
		}
		
		for(Map.Entry<Integer,Integer> gn : hm.entrySet()){
			
			if(gn.getValue()==1) {
				System.out.println(gn);
			}
		}
		
		
				
	}

}
