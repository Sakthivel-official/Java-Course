
public class WrapperClass {
	
	//wrapper class is a class that encapsulates the primitive datatypes as objects

	public static void main(String[] args) {

		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0F;
		double d = 60.056;
		char c = 'a';
		boolean b2 = true;
		
		
		//autoboxing: converting primitives into objects
		
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean boolobj= b2;
		
		Integer intdata = 30;
		System.out.println(intdata);
		
		
		//Printing objects
		
		System.out.println("-----------Printing objects values------------");
		System.out.println("Byte objects: "+byteobj);
		System.out.println("Short object: "+shortobj);
		System.out.println("Integer object: "+intobj);
		System.out.println("Long object: "+longobj);
		System.out.println("Float object: "+floatobj);
		System.out.println("Double object: "+doubleobj);
		System.out.println("Character object: "+charobj);
		System.out.println("Boolean object: "+boolobj);
		
		//unboxing:  Converting objects to Primitives
		
		byte bt = byteobj;
		short st = shortobj;
		int it = intobj;
		long lt = longobj;
		float ft = floatobj;
		double dt = doubleobj;
		char ct = charobj;
		boolean bt2 = boolobj;
		
		
		System.out.println("--------------Printing Primitive values----------");
		System.out.println("byte datatype: "+bt);
		System.out.println("short datatype: "+st);
		System.out.println("int datatype: "+it);
		System.out.println("long datatype: "+lt);
		System.out.println("float datatype: "+ft);
		System.out.println("double datatype: "+dt);
		System.out.println("char datatype: "+ct);
		System.out.println("boolean datatype: "+bt2);

	}

}
