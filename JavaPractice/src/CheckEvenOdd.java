import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter no. to check : ");
		
		int num = in.nextInt();
		
		if(num%2==0) {
			System.out.println("No. entered is even");
		}else{
			System.out.println("Odd");
			
		}

	}

}