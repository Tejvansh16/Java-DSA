import java.util.*;

public class SearchingForElePosInArray {
	static int search(int arr[], int N, int key)
	{
	    for(int i=0;i<N;i++){
	        if(arr[i]==key)
	        return i;
	    }
	    return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,3,4,5};
		System.out.println(search(ar,5,6));
	}
}