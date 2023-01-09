
public class LenghtOfLongestIncreasingSubArray {

	public static int findlength(int[] arr) {
		if(arr.length ==0)
			return 0;
		int len=1,maxlen=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]<arr[i]) {
				len++;
			}
			else {
				len=1;
			}
			maxlen=Math.max(len,maxlen);
		}
		return maxlen;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,23,1,3,4,5,7,2,9,11};
		System.out.print(findlength(arr));
	}

}
