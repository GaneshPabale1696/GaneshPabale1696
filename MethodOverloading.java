package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);

	}

	// you can not create a method inside a method
	// duplicate methods -- i.e same method name with same number of arguments are
	// not allowed

	//we can overload main method also
	
	public static void main(int p) {

	}

	public static void main(int p,int i) {

	}

	// method overloading-->when the method name is same with different arguments with different data types or
	// input parameters within the same class.

	public void sum() {
		System.out.println("Sum Method--zero parameter");

	}

	public void sum(double d) {
		System.out.println("Sum Method--zero parameter");

	}
	
	
	public void sum(int i) { // 1 input para
		System.out.println("Sum Method");
		System.out.println(i);
	}

	public void sum(int k, int l) { // 2 input para
		System.out.println("Sum Method");
		System.out.println(k + l);
	}

}
