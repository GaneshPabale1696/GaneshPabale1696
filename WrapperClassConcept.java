package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
	
		String x ="100";
		
		System.out.println(x+20);
		
		//data conversion:String to int 
		int i =Integer.parseInt(x);
		System.out.println(i+20);
	
		//String to double conversion:
		String y = "12.33";
		
		double d =Double.parseDouble(y);
		System.out.println(d+20);
		
		//String to boolean
		String k= "true";
		boolean s=Boolean.parseBoolean(k);
		System.out.println(s);
	
		//int to String Conversion:
		int j= 200;
		//System.out.println(j+20);
		String s1=String.valueOf(j);
		System.out.println(s1);
		System.out.println(s1+20);
		
		
		String u ="100A";
		int o=Integer.parseInt(u);//NumberFormatException--for Input String :"100A"	
		System.out.println(o);
	
	}
	
	
	
}
