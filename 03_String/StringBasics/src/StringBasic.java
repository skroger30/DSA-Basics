
public class StringBasic {

	public static void main(String[] args) {

		method1();
		method2();
		method3();
	}
	
	private static void method3() {
		String s1 = new String("xyz");  // object
		String s2 = s1.toUpperCase();
		String s3 = s2.toLowerCase();
		String s4 = s1.toLowerCase();
		
		String s5 = "xyz";    // literal
		 
		System.out.println("Method3 -");
		System.out.println(s1==s2); //false
		System.out.println(s1==s3); //false
		System.out.println(s1==s4); //true
		System.out.println(s1==s5); //false
		System.out.println(s3==s5); //false
	}

	private static void method2() {
//		•	== operator Vs equals() method
//		= = : reference comparison (true, if pointing to same reference else false)
//		equals() : content comparison

		System.out.println("Method2 - ");
		String s1=new String("xyz"); 
		String s2=new String("xyz");
		System.out.println(s1==s2);		//false
		System.out.println(s1.equals(s2));  // true
		
		StringBuffer sb1=new StringBuffer ("xyz");
		StringBuffer sb2=new StringBuffer ("xyz");
		System.out.println(sb1==sb2);		//false
		System.out.println(sb1.equals(sb2)); //false


	}

	private static void method1(){
//		•	Mutability Vs Immutability
//		String objects are immutable(non-changeable). 
//		StringBuffer objects are mutable(changeable).
		
		System.out.println("Method1 - ");
		String one= new String("xyz");
		System.out.println(one);
		
		String two = one.concat("abc");
		System.out.println(one);
		
		System.out.println(two);
		
		StringBuffer sb = new StringBuffer("xyz");
		sb.append("abc");
		
		System.out.println(sb);
	}
}
