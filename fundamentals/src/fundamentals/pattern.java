package fundamentals;

public class pattern {

	public static void printStars(int n)  {
		// TODO Auto-generated method stub

        int i, j; 
  
       
        for(i=0; i<n; i++) 
        { 
     
            for(j=0; j<=i; j++) 
            { 
               
                System.out.print("* "); 
            } 
  
          
            System.out.println(); 
        } 
   } 
  
    public static void main(String args[]) 
    { 
        int n = 3; 
        printStars(n); 
    } 

}