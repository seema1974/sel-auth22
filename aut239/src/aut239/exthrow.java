package aut239;

public class exthrow {

	public static void main(String[] args) {
		agecheck(20);
		
		

	}
public static void agecheck(int age) {
	if (age<16) {
		throw new ArithmeticException("user is not eligible to take learner permit");
		
	}
	else 
	{
		System.out.println("user can take learner permit");
	}
}
}
