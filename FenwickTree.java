import java.util.*;  
public class FenwickTree {
	final static int MAX_SIZE = 100;  
	private int fenArr[] = new int[MAX_SIZE];  
	int getArrSum(int idx)  
	{  
	int total = 0;  
	  
	idx = idx + 1;  
	while(idx > 0)  
	{  
	total = total + fenArr[idx];  
	idx -= idx & (-idx);  
	}  
	return total;  
	}  
	public void updateFenwick(int s, int idx, int v)  
	{    
	idx = idx + 1;  
	while(idx <= s)  
	{  
	fenArr[idx] = fenArr[idx]  + v;  
	idx = idx + (idx & (-idx));  
	}  
	}  
	void constructFenTree(int arr[], int s)  
	{  
	for(int i = 1; i <= s; i++)  
	{  
	fenArr[i] = 0;  
	}  
	for(int j = 0; j < s; j++)  
	{  
	updateFenwick(s, j, arr[j]);  
	}  
	}  
	public static void main(String[] args) {
		// input array  
		int a[] = {2, 21, 12, 31, 22, 33, 40, 15, 60, 17, 18, 19};  
		int s = a.length;  
		FenwickTree treeObj = new FenwickTree();  
		treeObj.constructFenTree(a, s);  
		int total = treeObj.getArrSum(6);  
		System.out.println("Sum of the elements in array a[0 ... 6]"+ " is: " + total);  
		treeObj.updateFenwick(s, 3, 7);  
		total = treeObj.getArrSum(6);  
		System.out.println("Sum of the elements in array a[0 ... 6] after update is: " + total);  
	}

}
