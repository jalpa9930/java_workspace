package OperatorsandAssignment;

public class UnaryOperater {

	public static void main(String[] args) {
		
		//Increment--> 1.pre-increment 2. post-increment
		//1.pre-increment: increment value by +1 before assigning to the other variable.
		
		int x = 100;
		int y = ++x;
		 System.out.println(x);
		 System.out.println(y);
		
		System.out.println("***********************************");
		
		//2. post-increment : first give the value of variable as it is so, a value 100 means b=100.and then increment it by +1 so, a value increase by 1. 
		
		int a= 100;
		int b = a++;
		System.out.println(b);
		System.out.println(a);
		
		System.out.println("***********************************");
		
		//Decrement--> 1.pre-decrement  2. post decrement
		// pre-Decrement :
		
		int i = 200;
		int j = --i;
		System.out.println(j);
		System.out.println(i);
		
// post-Decrement : first give the value of variable as it is so, c value 10 means d=10.and then decrement it by -1 so, c value decrease by 1 now,c=9.
		
		System.out.println("***********************************");
		
		int c = 10;
		int d = c--;
		
		System.out.println(c);
		System.out.println(d);
		
		
	}

}
