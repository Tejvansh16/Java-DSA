import java.util.Arrays;
import java.util.Scanner;
public class InsertingElementInArray {
	static void insert(int arr[], int N, int pos, int element)
	{
	    for(int i=N;i>pos;i--){
	        arr[i]=arr[i-1];
	        
	    }
	    arr[pos]=element;
	}
	public static void main(String [] args) {
		int ar[]= {1,2,4,5,6,7};
		Scanner sc = new Scanner(System.in);
		int n=5;
		System.out.println("Enetr value of pos ");
		int pos = sc.nextInt();
		System.out.println("Enetr value of ele ");
		int ele = sc.nextInt();
		insert(ar,n,pos,ele);
		for(int i =0;i<=n;i++) {
			System.out.println(ar[i]);
		}
		
	}
}
