
public class MinAndMaxIn1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,0,6,9};
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("min = "+min);
		System.out.println("max = "+max);
	}

}
