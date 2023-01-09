import java.io.*;
import java.util.*;
public class PowerOfArray {

	public static int[] sortedpower(int nums[], int K)
	{
		// Loop is used for performing power of K
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)Math.pow(nums[i], K);
		}
		Arrays.sort(nums);

		
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Defining the array v
				int arr[] = { -4, -1, 0, 3, 10 };

				// Function Call
				int K = 4;
				arr = sortedpower(arr, K);
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
	}

}
