import java.util.Arrays;
public class RemovingDuplicateFromSortedArray {
	
	public static void main(String [] args) {
		int arr[]= {1,2,2,3,3,4,5,6,6};//len=9,len-1=8
		int x=arr[arr.length-1];
		int temp[] = new int [arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j++]=x;
		for(int k=0;k<j;k++) {
			System.out.println(temp[k]);
		}
		
	}
}
