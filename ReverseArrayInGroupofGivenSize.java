
public class ReverseArrayInGroupofGivenSize {

	public static void reversearray(int arr[],int k) {
		int len=arr.length;
		for(int i =0;i<len;i=i+k) {
			int start=i;
			int end=Math.min(i+k-1,len-1);
			
			while(start<=end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,4,3,5,6,7};
		int k=3;
		reversearray(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
