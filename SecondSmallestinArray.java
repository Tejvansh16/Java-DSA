
public class SecondSmallestinArray {

	public static void secSmallest(int arr[]) {
		int smallest=2652819;
		int secsmallest=2652819;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
			if(arr[i]>smallest && arr[i]<secsmallest) {
				secsmallest=arr[i];
			}
		}
		System.out.print("Second smallest element is "+secsmallest);
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		secSmallest(arr);
	}

}
