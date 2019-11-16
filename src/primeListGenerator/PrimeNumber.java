package primeListGenerator;

import java.util.ArrayList;


public class PrimeNumber {

	
	ArrayList<Integer> List = new ArrayList<Integer>();
	
	ArrayList<Integer> primeList = new ArrayList<Integer>();
	
	boolean isPrime = false;
	
	ArrayList<Integer> create_array(int size) {
	
		for (int i = 0; i < size; i++) {
			List.add(i);
		}System.out.println(List);
		return List;
	}
	
	void check_prime() {
		
		for (int i = 0; i < List.size(); i++) {
			for (int j = 2; j < List.indexOf(i); j++) {
			
			if (List.indexOf(i) % j == 0) {
				isPrime =false;
				
			}else {
				isPrime = true;
		}
			
			if (isPrime == true) {
				primeList.add(j);
			}
			
		}
			
		}System.out.println(primeList);
		
	}
	
	
}
