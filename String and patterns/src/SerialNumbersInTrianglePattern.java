import java.util.*;
public class SerialNumbersInTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,num=1;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=i;j<=a;j++) {
				System.out.print(num);
				num++;
			}
			num=1;
			System.out.println();
		}
		sc.close();
	}

}
