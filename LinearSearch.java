// worst case time complexity is O(n) and best case time complexity is O(1)
public class LinearSearch 
{
	public static int LinearSearch(int array[],int size,int key) 
	{
		for(int i =0;i<size;i++) 
		{
			if(array[i]==key)
				return 1;
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		int SIZE=5;
		int key=34;
		int arr[]= {10,20,30,34,40};
		if(LinearSearch(arr,SIZE,key)==1)
			System.out.println("Number found");
		else
			System.out.println("Number not found");

	}
}
