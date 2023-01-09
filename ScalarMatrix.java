
public class ScalarMatrix {
	static int N= 4;
	static boolean isScalarMatrix (int mat[][]) {
		for (int i= 0; i <N; i++) {
			for (int j=0; j<N; j++) {
				if ((i != j) && (mat[i][j] !=0))
					return false;
			}
		}
		for (int i =0; i<N- 1; i++) {
				if (mat[i][i] !=mat[i+1][i+ 1])
					return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{2,0,0,0},
					  {0,2,0,0},
					  {0,0,3,0},
					  {0,0,0,2}};
		if(isScalarMatrix(mat))
			System.out.println("Scalar Matrix");
		else
			System.out.println("Not a Scalar Matrix");
	}

}
