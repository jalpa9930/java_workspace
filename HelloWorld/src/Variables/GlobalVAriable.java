package Variables;

public class GlobalVAriable {
	
	byte b;
	short s;
	int i;
	long l;
	double d;
	float f;
	char  c;
	boolean a;
	
	public static void main(String[] args) {
	
		GlobalVAriable obj = new GlobalVAriable (); // if u not given values compiler count as a default 0
		
		System.out.println(obj.b);
		System.out.println(obj.s);
		System.out.println(obj.i);
		System.out.println(obj.l);
		System.out.println(obj.d);
		System.out.println(obj.f);
		System.out.println(obj.c);
		System.out.println(obj.a);
		
		System.out.println("************************************");
		
		GlobalVAriable obj1 = new GlobalVAriable ();
		
		obj1.b= 125;
		obj1.s= 10000;
		obj1.i= 500000;
		obj1.l= 6000000;
		obj1.d= 12.33;
		obj1.f= 66.66f;
		obj1.c= 'a';
		obj1.a= true;
		
		System.out.println(obj1.b);
		System.out.println(obj1.s);
		System.out.println(obj1.i);
		System.out.println(obj1.l);
		System.out.println(obj1.d);
		System.out.println(obj1.f);
		System.out.println(obj1.c);
		System.out.println(obj1.a);
		
		

	}

}
