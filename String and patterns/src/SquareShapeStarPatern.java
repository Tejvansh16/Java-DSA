import java.util.*;
public class SquareShapeStarPatern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
