
public class RotatingAnImageByArray {

	static void showImage(int matrix[][]) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
	}
	static void imageRotation(int matrix[][]) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=i;j<matrix[0].length;j++) {
				int temp=0;
				temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length/2;j++) {
				int temp=0;
				temp=matrix[i][j];
				matrix[i][j]=matrix[i][matrix.length-1];
				matrix[i][matrix.length-j-1]=temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matrix= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("image before rotating:");
		showImage(matrix);
		imageRotation(matrix);
		System.out.println("image after rotating:");
		showImage(matrix);

	}

}
