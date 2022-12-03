//Wrapper classes are the wrappers around the primitive data types
// obj >> primitive == unboxing
// primitive >> object == boxing
public class Demo1 {

	public static void main(String[] args) {
		int i=10;
		//Integer i = new Integer(10);
		Integer a = Integer.valueOf(10);
		Integer b = 10;
		
		System.out.println(a);
		System.out.println(b);
		
		byte c = 15;
		Byte oj = 15;
		Byte d = Byte.valueOf("15");
		
		Short f = Short.valueOf("123");
		
		Float g = 12.3f;
		Float h = Float.valueOf(g);
		
		Double j = Double.valueOf("123.45");
		
		Character k = Character.valueOf('A');
		
		Boolean l = Boolean.valueOf("true");
		
		Float m = Float.valueOf("123.5f");
		//the process of converting the object to primitive data type is called unboxing
		float x =  m.floatValue();
		//autounboxing : below line will call the floatValue() method implicitly hence called auto unboxing
		float y = m;
		
		
		int n = 10;
		
		//autoboxing : the process converting primitive to object without calling the valueOf method
		Integer o = n;
		//boxing : the process of converting primitive to object by calling valueOf method
		Integer p = Integer.valueOf(n);
		
		//unboxing : an object is assigned to the primitive variable with the help of intValue method
		
		int q = o.intValue();
		//autounboxing : an object is assigned to the primitive variable but without calling intValue explicitly
		int r = o;
		
		
		

	}

}
