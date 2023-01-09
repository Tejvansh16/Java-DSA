
public class DotandCrossProduct {
	static int n = 3;

    static int dotProduct(int vect_A[], int vect_B[])
    {
 
        int product = 0;
        for (int i = 0; i < n; i++)
            product = product + vect_A[i] * vect_B[i];
        return product;
    }
 
    static void crossProduct(int vect_A[], int vect_B[],
                             int cross_P[])
 
    {
 
        cross_P[0] = vect_A[1] * vect_B[2]
                     - vect_A[2] * vect_B[1];
        cross_P[1] = vect_A[2] * vect_B[0]
                     - vect_A[0] * vect_B[2];
        cross_P[2] = vect_A[0] * vect_B[1]
                     - vect_A[1] * vect_B[0];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vect_A[] = { 3, -5, 4 };
        int vect_B[] = { 2, 6, 5 };
        int cross_P[] = new int[n];
 
        System.out.print("Dot product:");
        System.out.println(dotProduct(vect_A, vect_B));
 
        System.out.print("Cross product:");
        crossProduct(vect_A, vect_B, cross_P);
 
        for (int i = 0; i < n; i++)
 
            System.out.print(cross_P[i] + " ");
	}

}
