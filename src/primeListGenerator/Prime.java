package primeListGenerator;


public class Prime {

	
	public Prime primeGen(int num) {

		boolean flag = false;
		Prime prime;
		
		for (int i = 2; i < num; i++) {
			
			if (num % i == 0) {
				flag=true;
				
			}
		}
		
		if (flag == false) {
			prime  = num;
			System.out.println("The number " + num + " is a prime");
		}
		
		else {
			System.out.println("The number " + num + " is not a prime");	
		}
		return null;

	}
}
