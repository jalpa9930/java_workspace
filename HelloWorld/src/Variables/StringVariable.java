package Variables;

public class StringVariable {
	
	String name;
	char gender;
	int rollno;
	static String sinstitute = "jalaramkrupa"; //here we given static variable because all student are same institute.

	public static void main(String[] args) {
		
		StringVariable s1 = new StringVariable();
		
		s1.name = "jalpa";
		s1.gender = 'f';
		s1.rollno = 123;
		
		System.out.println("Derails of Student");
		
		System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println(s1.rollno);
		System.out.println(StringVariable.sinstitute); // static variable call direct or with class name.
		
System.out.println("**************************************************");
		
		StringVariable s2 = new StringVariable();
		
		s2.name = "amit";
		s2.gender = 'm';
		s2.rollno = 456;
		
		
		System.out.println("Derails of Student");
		
		System.out.println(s2.name);
		System.out.println(s2.gender);
		System.out.println(s2.rollno);
		System.out.println(StringVariable.sinstitute);// static variable call direct or with class name.
		
	}

}
