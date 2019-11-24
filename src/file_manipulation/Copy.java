package file_manipulation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;



public class Copy 
	{
		
	
		static File original;
		static File newFile;
		
		static Copy instance;
		
		void Rest()
		{
			instance = new Copy();
			
			
			
			
			original = new File("C:\\Users\\ruach\\Desktop\\sourceFIles\\original1.txt");
			newFile = new File("C:\\Users\\ruach\\Desktop\\sourceFIles\\newFile.txt");
			
			original.mkdir();
			
			
//			FileReader aReader = null;
//			FileWriter aWriter = null;
			FileReader aReader = null;
			Writer aWriter = null;
			
			//BufferedReader aBReader = new BufferedReader(aReader);
			BufferedWriter aBWriter = new BufferedWriter(aWriter);
			
			
		
		
		
			try { 
				
				aReader = new FileReader(original);
				aWriter = new FileWriter(newFile);
				
				if (aReader != null)
				{
		
					System.out.println("all good with file 1");
				}
		
				if (aWriter != null)
				{
			
					byte characterAsByte;
					char newLine = '\n';
					String temp = "";
				
					while((characterAsByte = (byte) aReader.read()) != -1)
					{
						
						aWriter.write(characterAsByte);
						
						
						
					}aWriter.close();
					 aReader.close();
					 original.delete();
				}
				
				
				
				
				}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println(e);
				}
			
				finally
				{
					
			
			}
		}

		public static void main(String[] args) throws IOException  
		{
			instance = new Copy();
			
			
			
			
			original = new Reader("C:\\Users\\ruach\\Desktop\\sourceFIles\\original1.txt");
			newFile = new File("C:\\Users\\ruach\\Desktop\\sourceFIles\\newFile.txt");
			
			original.mkdir();
			
			
//			FileReader aReader = null;
//			FileWriter aWriter = null;
			//FileReader aReader = null;
			//Writer aWriter = null;
			
			BufferedReader aBReader = new BufferedReader(aReader);
			BufferedWriter aBWriter = new BufferedWriter(aWriter);
			
			
		
		
		
			try { 
				
				aReader = new FileReader(original);
				aWriter = new FileWriter(newFile);
				
				if (aReader != null)
				{
		
					System.out.println("all good with file 1");
				}
		
				if (aWriter != null)
				{
			
					byte characterAsByte;
					char newLine = '\n';
					String temp = "";
				
					while((characterAsByte = (byte) aReader.read()) != -1)
					{
						
						aWriter.write(characterAsByte);
						
						
						
					}aWriter.close();
					 aReader.close();
					 original.delete();
				}
				
				
				
				
				}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println(e);
				}
			
				finally
				{
					
			
			}
				
			}
	}

