
public class Main {

	static String quote; 
	

	
	    public static void main(String[] args) {
	    	
	    	String java_String = "JAVA is hard Q_Q";
	    	int aNumber = 100000;
	    	
	    	
	    	
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
	    	
	    	
	    }
	    	
	    	
	    	
	    
	    
}
	
	
