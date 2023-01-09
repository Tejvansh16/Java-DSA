//by reversal method
public class RotatingArrayByKPositions1 {
	static void reverse(int arr[],int start, int end)
	{
	        while(start < end){
	            int temp = arr[start];
	            arr [start++] = arr[end];
	            arr [end--] = temp;
	        }
	}
	static void arrayRotate(int arr[], int n, int k)
	{
	    reverse(arr,0,n-k-1);
	    reverse(arr,n-k,n-1);
	    reverse(arr,0,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Array before rotation: ");
		for(int i =0;i<9;i++) {
			System.out.print(ar[i]+" ");
		}
		arrayRotate(ar,9,3);
		System.out.println("\nArray after rotation: ");
		for(int i =0;i<9;i++) {
			System.out.print(ar[i]+" ");
		}

	}
}
