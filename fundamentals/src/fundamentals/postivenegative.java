package fundamentals;

public class postivenegative 	{
	    public static void main(String[] args) 
	    {
	        int n;
	        n=Integer.parseInt(args[0]);
	        if(n > 0)
	        {
	        	
	            System.out.println("The given number "+n+" is Positive");
	        }
	        else if(n < 0)
	        {
	            System.out.println("The given number "+n+" is Negative");
	        }
	        else
	        {
	            System.out.println("The given number "+n+" is  ");
	        }
	    }
	}

