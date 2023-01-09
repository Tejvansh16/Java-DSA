import java.util.Scanner;
public class PrimeFactorsOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double now = System.currentTimeMillis();
	      int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      number = sc.nextInt();

	      for(int i = 2; i< number; i++) {
	        Boolean print = false;
	         while(number%i == 0) {
	            if(!print){
	               System.out.println(i+" ");
	               print = true;
	            }

	            number = number/i;
	         }
	         
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	      System.out.println("Time Taken: " + (System.currentTimeMillis() - now));
	   
	}

}
