import java.util.*;
public class TripletsWithZeroSum {
	public static List<List<Integer>> threeSum(int[] arr){
		List<List<Integer>> result=new ArrayList<>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int start=i+1;
			int end=arr.length-1;
			if(i>0 && arr[i]==arr[i-1])
				continue;
			while(start<end) {
				if(end<arr.length-1 && arr[end]==arr[end+1]) {
					end--;
					continue;
				}
				if(arr[i]+arr[start]+arr[end]==0) {
					List<Integer> val =Arrays.asList(arr[i],arr[start],arr[end]);
					result.add(val);
					start++;end--;
				}
				else if(arr[i]+arr[start]+arr[end]<0) {
					start++;
				}
				else {
					end--;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-1,0,1,2,-1,-4};
		List<List<Integer>> result = threeSum(arr);
		result.forEach(values->{
			System.out.println(values);
		});
	}

}
