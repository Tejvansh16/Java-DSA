//by normal method
import java.util.*;
public class RotatingArrayByKPositions {
	static void rightRotate(int arr[],int n)
	{
	    int i, temp=arr[n-1];
	    for(i=n-1;i>0;i--){
	        arr[i]=arr[i-1];
	    }
	    arr[0]=temp;
	}
	static void arrayRotate(int arr[], int n, int k)
	{
	    int i;
	    for(i=1;i<=k;i++){
	        rightRotate(arr,n);
	    }
	}
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,5,6,7};
		int x=7;
		System.out.println("Array before rotation: ");
		for(int i =0;i<x;i++) {
			System.out.print(ar[i]+" ");
		}
		arrayRotate(ar,x,2);
		System.out.println("\nArray after rotation: ");
		for(int i =0;i<x;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}
}