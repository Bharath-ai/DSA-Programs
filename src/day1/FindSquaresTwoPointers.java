package day1;

import java.util.Arrays;

import org.junit.Test;

public class FindSquaresTwoPointers {
	
	//Pseudocode
	
	// Given the input array.
	//

	@Test
	public void example1()
	{
		int[] arr = {3,5,7,9};
		int[] result = Squareroot(arr);
		System.out.println(Arrays.toString(result));
	}

	private static int[] Squareroot(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
        int[] res = new int[n];
        int left = 0, right = n - 1;
        int i = n - 1; // pointer for the result array

        
while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                res[i] = leftSquare;
                left++;
            } else {
                res[i] = rightSquare;
                right--;
            }
            i--;
        }
        return res;
    }
		
}
