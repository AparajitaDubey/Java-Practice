import java.util.Scanner;

public class RemoveCharFrmStrng {
	
	public static String remove(String word, char unwanted) {
		
		StringBuilder sb = new StringBuilder();
		char[] letters = word.toCharArray();
		
		for(char c: letters) {
			if(c!=unwanted) {
				sb.append(c);
			}
		}	
		
		System.out.println(sb.toString());
		return sb.toString();
		
	}
	
	
	public static void main(String[] args) {
		
	remove("ankita", 'a');
	
	}

}
