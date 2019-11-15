package assignments;

public class Class_1a {

	static String quote; 
	

	
	    public static void main(String[] args) {
	    	
	    	String java_String = "JAVA is hard Q_Q";
	    	int aNumber = 100000;
	    	
	    	final int finalNumber = 12345;
	    	byte small_number = 127;
	    	short bigger_than_byte = 32_767;
	    	int bigger_than_short = 2_147_483_647;
	    	long THE_BIGGEST_NUMBER = 9_223_372_036_854_775_807L;
	    	float small_float = 2_147_483_647.123454321234f;
	    	double big_float = 9_223_372_036_854_775_807.1234321234321;
	    	boolean true_or_false = true;
	    	char a_character = 'A';
	    	
	    	if (args.length > 0) {
	    		
				System.out.println("The arguments length is: " + args.length + "\nThe arguments are: ");
				
	    		for (int i = 0; i < args.length; i++) {
					System.out.println( args[i]);
				}
				
				
			}
	    	else {
				System.out.println("Hello World!");
			}
	    	
	    	System.out.println("\n\nThis is the int variable -> " + aNumber + "\nThis is the String variable -> " + java_String);
	    	quote = "\n\"A clever person solves a problem. A wise person avoids it.\" -Albert Einstein";
	    	System.out.println(quote);
	    	
	    	java_String = "\nRemember I said java is hard?\nWell.. it's really hard!";
	    	System.out.println(java_String);
	    	java_String = java_String + ("" + aNumber);
	    	System.out.println("\n\nThis time I'm printing the final variable (in this case it's a number) and assigning a variable to another one in the same time:\nFirst the final number: " + finalNumber + "\nand this is the String variable I had which I added a number to it: " + java_String + ".");
	    	System.out.println("\n\n This is a list of variables I need to display:"
	    			+  "\nbyte - " + small_number + "\nshort - " + bigger_than_byte + "\nint - " + bigger_than_short + "\nlong - " + THE_BIGGEST_NUMBER + "\nfloat - " + small_float + "\ndouble - " + big_float + "\nboolean - " + true_or_false + "\nchar - " + a_character);
	    	
	    }
	    	
	    	
	    	
	    
	    
}
	
	
