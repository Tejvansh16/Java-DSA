
public class isSortedArray {

	public static boolean isArraySorted(int []array) {
			for (int i = 0; i < array.length - 1; i++) {
		        if (array[i] < array[i + 1])
		            return false;
		    }
		    return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,4,1,5};
		boolean isSorted = isArraySorted(arr);
		System.out.println(isSorted);
	}

}
