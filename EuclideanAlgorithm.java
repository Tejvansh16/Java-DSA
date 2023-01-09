//Time Complexity: O(Log min(a, b))
import java.util.*;
import java.lang.*;
public class EuclideanAlgorithm {

	public static int gcd(int a, int b)
	{
		if (a == 0)
			return b;

		return gcd(b % a, a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double now = System.currentTimeMillis();
		int a = 30, b = 25, g;
		g = gcd(a, b);
		System.out.println("GCD(" + a + ", " + b + ") = " + g);

		a = 35;
		b = 10;
		g = gcd(a, b);
		System.out.println("GCD(" + a + ", " + b + ") = " + g);

		a = 31;
		b = 2;
		g = gcd(a, b);
		System.out.println("GCD(" + a + ", " + b + ") = " + g);
		System.out.println("Time Taken: " + (System.currentTimeMillis() - now));
	}

}
