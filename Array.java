import java.util.*;
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {1,2,3,4};
		int B[] = new int[] {1,2,3,5};
		int X[] = new int[] {100,20,300,40};
		Arrays.sort(X);
		System.out.println(Arrays.toString(X));
		boolean result = Arrays.equals(A,B );
		System.out.println("Are arrays A and B equal "+result);

	}

}
