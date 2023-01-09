import java.util.Arrays;
public class RemovingDuplicateFromUnsortedArray 
{
	public static void  removeunsortedduplicate(int arr[]) {
		Arrays.sort(arr);
		int len=arr.length;
		int j=0;
		int temp[]=new int[arr.length];
		for(int i=0;i<len-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j++]=arr[len-1];
		for(int k=0;k<j;k++) {
			System.out.print(temp[k]);
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,3,2,4,1,6,5,6,5};
		removeunsortedduplicate(arr);
	}
}
