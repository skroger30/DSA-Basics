
//All immutable classes are declared as final. 
//final – So that child class cannot be created and method will not be override.
public final class CustomImmutableClass {

	private int i; //private – So that variable can’t be accessed outside the class.
	CustomImmutableClass(int i){
		this.i=i;
	}
	public CustomImmutableClass modify(int i) {
		if(this.i==i)
			return this;
		else
			return new CustomImmutableClass(i);
	}

	
	public static void main(String[] args) {
		CustomImmutableClass t1=new CustomImmutableClass(10);
		CustomImmutableClass t2=t1.modify(100);
		CustomImmutableClass t3=t1.modify(10);
		
		System.out.println(t1==t2);	//false
		System.out.println(t1==t3);	//true


	}

}
