package OOPConceptPart1;

public class StaticAndNonStaticConcept {

	//global vars: the scope of global vars will be available across all the functions with some conditions.
	
	
	String name = "Tom"; //non static global var
	static int age = 25; //static global var 
	
	
	public static void main(String[] args) {
		
		//how to call static methods and vars
		//1.direct calling:
		sum();
		
		//2. calling by classname:
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
	
		//how to call non static methods and vars
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		obj.sendMail();
		
		//can i access static methods by using object referencce? -yes
		obj.sum(); //warning will be given
	}
	
	//non static method
	public void sendMail() {
		System.out.println("send mail method");
	}
	
	//static method
	public static void sum()
	{
		System.out.println("Sum method");
	}
}
