package assignments;

import java.util.Scanner;

public class Class_1b {

	Scanner inputScanner = new Scanner(System.in);
	
	
	
	
	
	public Class_1b() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter the first word:");
		String word1 = inputScanner.next();
		
		
		String nameString = "Avi";
		nameString = "avinoam";
		
		System.out.println(nameString);
		
		
		System.out.println("Now enter the second word:");
		String word2 = inputScanner.next();
		
		if (word1.length() == word2.length()) {
			
			for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) == word2.charAt(i)) {
			}
				
			else {
				System.out.println("The words are different from each other");
			
				}
			
			
			
		
		else {
			System.out.println("The words are different from each other");
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
	}
}
