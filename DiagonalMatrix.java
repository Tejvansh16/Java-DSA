//Any given square Matrix where all the elements are zero except for the elements that are present Diagonally is called a Diagonal Matrix.
public class DiagonalMatrix {

	static int N=4;
	static boolean isDiagonal(int mat[][]) {
		for(int i=0;i<N;i++) {
			for(int j=0;i<N;i++) {
				if((i!=j) && (mat[i][j]!=0))
					return false;
		}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{1,0,0,0},
				{0,5,0,0},
				{0,0,2,0},
				{0,0,0,4}};
		if(isDiagonal(mat))
			System.out.println("Matrix is diagonal");
		else
			System.out.println("Matrix is not diagonal");
		}
}
