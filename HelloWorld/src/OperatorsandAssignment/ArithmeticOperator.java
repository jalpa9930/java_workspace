package OperatorsandAssignment;

public class ArithmeticOperator {

	public static void main(String[] args) {
	
		//Arithmetic operators can not work with boolean.
		
		int a= 70;
		int b= 30;
		
		System.out.println("Sum of given numbers : "+(a+b)); 
		System.out.println("Differnce of given numbers: " +(a-b));
		System.out.println("Multiply of given numbers: "+(a*b));
		System.out.println("Divison of given numbers: " +(a/b));
		
		//+ is the overloaded operator in java. check below example
		
		int c = 10;
		int d = 20;
		System.out.println(c+d);
		
		
		String s1 = ("hello");
		String s2 = ("world");
		System.out.println(s1+s2);
		
		// Modulus operators is reminder of given number
		
		int i = 4;
		int j = 2;
		System.out.println("Modulus of given numbers : "+ (i%j)); 
		
		int x = 5;
		int y = 3;
		System.out.println("Modulus of given numbers : "+ (x%y));
		
		

	}

}
