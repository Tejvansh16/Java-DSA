
public class EquilibriumPointOfArray {

	public static int EquilibriumPoint(int []arr) {
		if(arr.length==1)
			return 1;
		int tsum=0,sum=0,res=-1;
		for(int i=0;i<arr.length;i++)
			tsum+=arr[i];
		for(int i=1;i<arr.length;i++) {
			sum+=arr[i-1];
			if(tsum-sum-arr[i]==sum) {
				res=i;
				break;
			}
		}
		return res==-1?-1:res;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-1,2,4,3,2,0,3};
		System.out.print(EquilibriumPoint(arr));
	}

}
