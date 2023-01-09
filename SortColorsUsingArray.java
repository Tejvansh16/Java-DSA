
public class SortColorsUsingArray {

	static void sortColors(int[]nums) {
		int red=0,white=0,blue=0,total=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0)
				red++;
			else if(nums[i]==1)
				white++;
			else
				blue++;
		}
		total=red+white+blue;
		int []newarr=new int[total];
		for(int i=0;i<red;i++)
			newarr[i]=0;
		for(int j=red;j<red+white;j++)
			newarr[j]=1;
		for(int k=red+white;k<total;k++)
			newarr[k]=2;
		for(int i=0;i<total;i++)
			nums[i]=newarr[i];
		System.out.println("Sorted color: ");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]colors= {2,0,2,1,1,0};
		System.out.println("Unsorted colors: ");
		for(int i=0;i<colors.length;i++) {
			System.out.print(colors[i]+" ");
		}
		System.out.println("");
		sortColors(colors);	
	}

}
