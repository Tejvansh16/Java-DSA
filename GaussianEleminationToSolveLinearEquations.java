
public class GaussianEleminationToSolveLinearEquations {
	public static int N = 3; 
	 
	  static void gaussianElimination(double mat[][])
	  {
	    int singular_flag = forwardElim(mat);
	    if (singular_flag != -1)
	    {
	      System.out.println("Singular Matrix.");
	 
	      if (mat[singular_flag][N] != 0)
	        System.out.print("Inconsistent System.");
	      else
	        System.out.print(
	        "May have infinitely many solutions.");
	 
	      return;
	    }
	 
	    backSub(mat);
	  }
	 
	  static void swap_row(double mat[][], int i, int j)
	  {
	 
	    for (int k = 0; k <= N; k++)
	    {
	      double temp = mat[i][k];
	      mat[i][k] = mat[j][k];
	      mat[j][k] = temp;
	    }
	  }
	 
	  static void print(double mat[][])
	  {
	    for (int i = 0; i < N; i++, System.out.println())
	      for (int j = 0; j <= N; j++)
	        System.out.print(mat[i][j]);
	    System.out.println();
	  }
	 
	  static int forwardElim(double mat[][])
	  {
	    for (int k = 0; k < N; k++)
	    {
	 
	      int i_max = k;
	      int v_max = (int)mat[i_max][k];
	 
	      for (int i = k + 1; i < N; i++)
	        if (Math.abs(mat[i][k]) > v_max)
	        {
	          v_max = (int)mat[i][k];
	          i_max = i;
	        }
	 
	      if (mat[k][i_max] == 0)
	        return k; 
	 
	      if (i_max != k)
	        swap_row(mat, k, i_max);
	 
	      for (int i = k + 1; i < N; i++)
	      {
	 
	        double f = mat[i][k] / mat[k][k];
	 
	        for (int j = k + 1; j <= N; j++)
	          mat[i][j] -= mat[k][j] * f;
	
	        mat[i][k] = 0;
	      }
	    }
	 
	    return -1;
	  }
	 
	  static void backSub(double mat[][])
	  {
	    double x[]= new double[N]; 
	    
	    for (int i = N - 1; i >= 0; i--)
	    {
	 
	      x[i] = mat[i][N];
	 
	      for (int j = i + 1; j < N; j++)
	      {
	 
	        x[i] -= mat[i][j] * x[j];
	      }
	      x[i] = x[i] / mat[i][i];
	    }
	 
	    System.out.println();
	    System.out.println("Solution for the system:");
	    for (int i = 0; i < N; i++)
	    {
	      System.out.format("%.6f", x[i]);
	      System.out.println();
	    }
	  }
	public static void main(String[] args) {
		
	    double mat[][] = { { 3.0, 2.0, -4.0, 3.0 },
	                      { 2.0, 3.0, 3.0, 15.0 },
	                      { 5.0, -3, 1.0, 14.0 } };
	    
	    gaussianElimination(mat);
	}

}
