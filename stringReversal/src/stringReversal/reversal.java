package stringReversal;
import java.util.*;

public class reversal {
public static void main(String []args)
{
	   String original, reverse = "";
	    Scanner in = new Scanner(System.in);

	    System.out.println("Enter a string to reverse");
	    original = in.nextLine();

	    int length = original.length();
	    
        for(int j=0;j<length-1;j+=4)
        {
        	if(j<length-2)
        	{
        		  for (int i =j+3 ; i >= j ; i--)
        		    { 	
        		  	      reverse = reverse + original.charAt(i);
        		    }
        	}
        }

	    System.out.println("Reverse of the string: " + reverse);
}
}
