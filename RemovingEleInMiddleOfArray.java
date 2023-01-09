import java.util.*;
import java.util.Arrays;
public class RemovingEleInMiddleOfArray {
	static void remove_mid(int arr[], int N)
	{
	    if(N%2!=0){
	        for(int i=N/2;i<N-1;i++){
	        arr[i]=arr[i+1];
	    }
	    }
	    if(N%2==0){
	        for(int i=((N/2)-1);i<N-1;i++){
	        arr[i]=arr[i+1];
	    }
	    }
	    N--;
	}
	public static void main(String[] args) {
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		n=sc.nextInt();
		int ar[]= new int [n];
		for(i=0;i<n;i++) {
			ar[i]=i+1;
		}
		for(i=0;i<n;i++) {
			System.out.println(ar[i]);
		}
		remove_mid(ar,n);
		System.out.println("Array after the removal of the middle element ");
		for(i=0;i<n-1;i++) {
			System.out.println(ar[i]);
		}
	}

}
