
public class MaxDiffbetw2Elements {

	/*public static int bruteForce(int[]arr) { //time complexity is O(n^2)
		int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					max=Math.max(max, arr[i]-arr[j]);
				}
			}
		}
		return max;
	}*/
	
	public static int findMaxDiff(int arr[]) {
		int maxDiff=arr[1]-arr[0];
		int minEle=arr[0];
		for(int i=1;i<arr.length;i++) {
			if((arr[i]-minEle)>maxDiff)
				maxDiff=arr[i]-minEle;
			if(arr[i]<minEle)
				minEle=arr[i];
		}
		return maxDiff;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {2,5,10};
		//System.out.print(bruteForce(arr));
		System.out.print(findMaxDiff(arr));
		

}
}
