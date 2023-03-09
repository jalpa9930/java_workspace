package FlowControlStatemnt;

public class Patterns {

	public static void main(String[] args) {
		
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
				
		}
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");	
	
int pyramid=5;
		for(int a =1;a<=pyramid;a++) {
			for(int b=pyramid;b>=a;b--){
				System.out.print("* ");
			}
			System.out.println();
				
		}
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");	
    
for(int i =1;i<=5;i++) {
	for(int j=1;j<=i;j++){
		System.out.print(i+" "+j);
	}
	System.out.println();
		
}

		
	}

}
