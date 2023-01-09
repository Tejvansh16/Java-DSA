 //Also known as Kadane's Algorithm
public class MaxSubArraySum {

	public static int Maxsubarraysum(int arr[]) {
		int maxsum=arr[0],sum=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(sum<0)
				sum=arr[i];
			else
				sum=sum+arr[i];
			maxsum=Math.max(maxsum, sum);
		}
		return maxsum;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,-5,5,-3,-6,6};
		System.out.println("Maximum subarray sum is "+Maxsubarraysum(arr));
	}

}
