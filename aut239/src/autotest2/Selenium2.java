package autotest2;

public class Selenium2 {

	public static void main(String[] args) {
		int a =10;
		int b = 11;
		int c= 12;
		if((a>b)&&(a>c))
		{
		System.out.println("A is greatest");	
		}
		else
		{
			if((b>a)&&(b>c))
			{
		System.out.println("B is greatest");
		}
			else
		{
			System.out.println("c is greatest");
		}
		}
	}
}
		/*same program different way below
     if(a>b) {
	 if(a>c) {
		 System.out.println("A is greatest");	
	}
	 else 
	 {
		 System.out.println("c is greatest");
	 }
	 
     }
     else
     {
    	if(b>c) {
    	 
    	 System.out.println("B is greatest");
     }
    	else 
    	{
    		System.out.println("c is greatest");
	}
	}
     
     {
     }	 
     }
    }
*/

