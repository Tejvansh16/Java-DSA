
public class SecondLargestinArray {
	public static void seclargest(int arr[]) {
		if(arr.length<2)
			System.out.println("There is no second largest");
		int min=-918274;
		int largest=min,secondlargest=min;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			}
			if(arr[i]!=largest && arr[i]>secondlargest)
				secondlargest=arr[i];
		}
		if(secondlargest==min)
			System.out.println("There is no second largest");
		else
			System.out.println("Second largest element is "+secondlargest);
	}
	public static void main(String[] args) {
		int arr[]= {1,1,1,1,1};
		seclargest(arr);
	}

}
