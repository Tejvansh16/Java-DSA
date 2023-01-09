
public class FindingTripletWithGivenSumInArray {

	public static void findTriplet(int []arr,int sum) {
		if(arr.length<3)
			System.out.print(false);
		int len=arr.length;
		for (int i=0;i<len-2;i++) {
			for(int j=i+1;j<len-1;j++) {
				for(int k=j+1;k<len;k++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
	
	}
	
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8,0};
		int sum=8;
		findTriplet(arr,sum);
	}

}
