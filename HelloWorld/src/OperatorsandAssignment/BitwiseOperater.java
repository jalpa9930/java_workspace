package OperatorsandAssignment;

public class BitwiseOperater { // this  operater only use for boolean value. 

	public static void main(String[] args) {
		
		//&(and)--> both condition should be true for the end result to b true.
		
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false& false);
		System.out.println(false & true);
		
		System.out.println("******************************");
		
		//| OR--> either one should be true for the end result to be true.
		
		System.out.println(true | true);
		System.out.println(true |false);
		System.out.println(false | false);
		System.out.println(false | true);
		
		System.out.println("******************************");
		
		
		//^ EXOR--> two arguments are same, false as a result.
		//          two arguments are different, true as a result.
		
		System.out.println(true ^ true);  //false
		System.out.println(true ^false); //true
		System.out.println(false ^ false); //false
		System.out.println(false ^ true); //true
		

	}

}
