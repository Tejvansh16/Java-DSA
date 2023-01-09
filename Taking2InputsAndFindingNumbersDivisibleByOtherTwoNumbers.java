import java.util.*;
public class Taking2InputsAndFindingNumbersDivisibleByOtherTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			if((i%3==0)&&(i%6==0)) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
