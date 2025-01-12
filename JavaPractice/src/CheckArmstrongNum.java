
public class CheckArmstrongNum {

	public static void main(String[] args) {
		
		int num = 371;
		int result = 0;
		int originalNum = num;
		
		while(num!=0) {
			int remainder = num % 10;
			 result += Math.pow(remainder, 3);
			 num/=10;
		}
		
		System.out.println(result);
		System.out.println(originalNum);
		
		if(result==originalNum) {
			System.out.println("Armstrong number");
		}else{
			System.out.println("Not an Armstrong number");
		}

	}
	
}
