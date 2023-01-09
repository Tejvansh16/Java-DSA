
public class RankOfMatrix {
	static final int R = 3;
    static final int C = 3;
    static void swap(int mat[][],
          int row1, int row2, int col)
    {
        for (int i = 0; i < col; i++)
        {
            int temp = mat[row1][i];
            mat[row1][i] = mat[row2][i];
            mat[row2][i] = temp;
        }
    }
     
    static void display(int mat[][],
                     int row, int col)
    {
        for (int i = 0; i < row; i++)
        {
             
            for (int j = 0; j < col; j++)
             
                System.out.print(" "
                          + mat[i][j]);
                           
            System.out.print("\n");
        }
    }
     
    static int rankOfMatrix(int mat[][])
    {
         
        int rank = C;
     
        for (int row = 0; row < rank; row++)
        {
            if (mat[row][row] != 0)
            {
                for (int col = 0; col < R; col++)
                {
                    if (col != row)
                    {
                        // This makes all entries
                        // of current column
                        // as 0 except entry
                        // 'mat[row][row]'
                        double mult =
                           (double)mat[col][row] /
                                    mat[row][row];
                                     
                        for (int i = 0; i < rank; i++)
                         
                            mat[col][i] -= mult
                                       * mat[row][i];
                    }
                }
            }
            else
            {
                boolean reduce = true;
                for (int i = row + 1; i < R; i++)
                {
                    // Swap the row with non-zero
                    // element with this row.
                    if (mat[i][row] != 0)
                    {
                        swap(mat, row, i, rank);
                        reduce = false;
                        break ;
                    }
                }
                if (reduce)
                {
                    rank--;     
                    for (int i = 0; i < R; i ++)
                        mat[i][row] = mat[i][rank];
                }     
                row--;
            }
        }
         
        return rank;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{10, 20, 10},
                {-20, -30, 10},
                {30, 50, 0}};
                 
		System.out.print("Rank of the matrix is : "+ rankOfMatrix(mat));
	}

}
