/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		System.out.printf("sample = %s\n", sample); //Added by me --SA
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		// Continuing Activity from here --SA
		int notFoundPsn = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
		
		int indexOfFrom2Psn = sample.indexOf("quick", 2);
		System.out.println("sample.indexOf(\"quick\", 2) = " + indexOfFrom2Psn);
		
		int indexOfFrom10Psn = sample.indexOf("quick", 10);
		System.out.println("sample.indexOf(\"quick\", 10) = " + indexOfFrom10Psn);
		
		String upperCase = sample.toUpperCase();
		System.out.println ("sample.toUpperCase() = " + upperCase);
		System.out.println ("After toUpperCase(), sample = " + sample);
		
		String trimed = sample.trim();
		System.out.println ("sample.trim() = " + trimed);
		System.out.println ("After trim(), sample = " + sample);
		
		
	}

}
