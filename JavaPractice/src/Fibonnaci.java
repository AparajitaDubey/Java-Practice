
public class Fibonnaci {

	public static void main(String[] args) {
		 int t1 = 0, t2 = 1, sum = 0;
		 
		 System.out.print(t1);
		 System.out.print(t2);
		 
		 for (int i = 1; i<= 8 ; i++) {
			  
			 sum = t1 + t2;
			 
			 System.out.print(sum);			 
			 
			 t1 = t2;
			 t2 = sum;
			 
		 }	 
		 

	}

}
