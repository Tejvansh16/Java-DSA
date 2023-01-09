import java.io.*;
public class MovingNegativeNumbersToOneSideOfAnArray {

	static void move(int[]arr,int n) {
		int j=0,temp;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				if(i!=j) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
	}
	static void printarray(int arr[],int n) {
		System.out.println("Output is: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,2,-3,4,5,6,-7,8,9};
		int n=arr.length;
		move(arr,n);
		printarray(arr,n);
	}

}
