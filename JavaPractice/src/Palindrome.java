import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		String actStr = in.next();
		 
		int len = actStr.length();
		
		String revStr = "";
		
		for(int i = len-1; i>= 0 ; i--) {
			
			char c = actStr.charAt(i);
			
			revStr = revStr + Character.toString(c);
			
		}
		
		System.out.print(revStr);
		
		if (actStr.equals(revStr)) {
			System.out.println("Passed");
		}else
			System.out.println("Fail");
	}
	

}
