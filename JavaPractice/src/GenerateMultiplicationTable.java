
public class GenerateMultiplicationTable {

	public static void main(String[] args) {
		 int num =5, result =1;
		 for(int i = 1; i <= 10; ++i)
	        {
			 
			 result = num * i;
			 
			 System.out.println( num + "*" + i + " = " + result);
			 
	           // System.out.printf("%d * %d = %d \n", num, i, num * i);
	        }
	}

}
