package day1;

import org.junit.Test;

public class TwoSum {

	
	
	@Test
	public void apositive() {
		// TODO Auto-generated method stub
		
		int[] ab= {2,5,8,9,4,3}; //6 - length //5 - index
		
		int target = 7;
		                       
    	twosum(ab,target);
		
	}
	
	//@Test
	public void bnegative() {
		// TODO Auto-generated method stub
		
		int[] ab= {2,9,8,9,4,3,}; //6 - length //5 - index
		
		int target = 87;
		                       
    	twosum(ab,target);
		
	}
	
	//@Test
	public void cedge() {
		// TODO Auto-generated method stub
		
		int[] ab= {2,9,8,9,4,3,90,-3,80,7}; //6 - length //5 - index
		
		int target = 87;
		                       
    	twosum(ab,target);
		
	}

	private void twosum(int[] ab,int target) {
		// TODO Auto-generated method stub
		Boolean b = false;
		
		for(int i=0;i<ab.length;i++) {      
			for(int j=i+1;j<ab.length;j++) { 
				if(ab[i]+ab[j]==target) {
				System.out.println(i+","+j);
				b=true;
							} 				
			}
		}
	 if(!b) {
		// throw new RuntimeException("there is no match");
		 System.out.println("values not matched");
	 }
	}
}
	
		
		  /* 1. Take the input
		   * 2. Traverse every element using for loop
		   * 3. Add with the next element with the outer loop
		   * 4. Compare the sum with the target
		   *      a.If it matches, store them in a list
		   *      b. if it is doesnt match continue
		   * 5. Finally
		   */	 
		
		 

	