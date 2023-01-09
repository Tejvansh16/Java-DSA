import java.util.*;
public class FindingPairOfElementsWithGivenPairSum {

	static boolean checkpair(int A[],int size,int x) {
		for(int i=0;i<(size-1);i++) {
			for(int j=i+1;j<size;j++) {
				if(A[i]+A[j]==x) {
					System.out.println("Pair with a given sum "+x+" is("+A[i]+","+A[j]+")");
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A= {0,4,5,3,-1};
		int x=7;
		int size=A.length;
		if(checkpair(A,size,x)) {
			System.out.println("Valid pair exists");
		}
		else {
			System.out.println("No valid pair exists for "+x);
		}
	}

}
