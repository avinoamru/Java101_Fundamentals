package primeListGenerator;

import java.util.ArrayList;


public class PrimeNumber {

	
	
	ArrayList<Integer> List = new ArrayList<Integer>();
	
	ArrayList<Prime> primeList = new ArrayList<Prime>();
	
	boolean isPrime = false;
	
	ArrayList<Integer> create_array(Integer size) {
		
		
		for (int i = 0; i < size; i++) {
			
			List.add(i);
		}System.out.println(List);
		return List;
	}
	
	void check_prime() {
		
		boolean flag = false;
		
		for (int i = 2; i < List.size(); i++) {
			
			if (List.size() % i == 0) {
				flag=true;
			
			}
		}
		
		if (flag == false) {
			List.add(num);
		}
		
		else {
			System.out.println(num + " is not a prime number");
		}System.out.println(primeList);

		
	}
			
		
		
	
	
	
}
