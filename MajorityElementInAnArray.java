public class MajorityElementInAnArray {

	static int majorityElement(int []nums) {
		int count=0,majority=0;
		for(int i=0;i<nums.length;i++) {
			if(count==0)
				majority=nums[i];
			if(majority==nums[i])
				count++;
			else
				count--;
		}
		return majority;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {2,2,2,1,1,1,1,1};
		System.out.print("Majority element is "+majorityElement(nums));
	}

}
