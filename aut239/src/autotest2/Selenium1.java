package autotest2;

public class Selenium1 {

	public static void main(String[] args) {
   
		/*int marks=40;
     if(marks>40) {
    	 System.out.println("user is pass");
     }
     else {
    	 System.out.println("user is fail");
     }
     System.out.println("part of reguler test");
     
     */
		//this line no we can change 18,27 to make sure
		//if two things age and us status
		int age = 17;
		//char cs ='A';
		char cs ='u';
		if(age>= 21) {
			System.out.println("user is pass age check");	
			if(cs=='u') {
			System.out.println("user is eligible to vot because they matched the age criteria and cs criteria");
		}
		else {
			System.out.println("user is not eligible to vote because they did not match the cs check ");
		}
		}
		else
		{
			System.out.println("user is not eligible to vote because they did not match the age check");
		}
	}
	



}
