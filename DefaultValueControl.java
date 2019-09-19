
public class DefaultValueControl {
	public static void main(String[] args) {
		DefaultValue dv = new DefaultValue();
		
		System.out.println(" byte="+dv.byteVar);
		System.out.println(" short=" + dv.shortVar);
		System.out.println(" int=" + dv.intVar);
		System.out.println(" long=" + dv.longVar);
		System.out.println(" float=" + dv.floatVar);
		System.out.println(" double=" + dv.doubleVar);
		System.out.println(" char=" + dv.charVar+"(='\u0000')");
		System.out.println(" boolean=" + dv.booleanVar);
		System.out.println(" String=" + dv.stringVar);
		
	}
}

class DefaultValue{
	byte byteVar; // primitive value 1-1. Integral types(byte=8bit)
	short shortVar; // primitive value 1-2. Integral types(short=16bit)
	int intVar; // primitive value 1-3. Integral types(int=32bit)
	long longVar; // primitive value 1-4. Integral types(long=64bit)

	float floatVar; // primitive value 2-1. Floating point types(float=32bit)
	double doubleVar; // primitive value 2-2. Floating point types(double=64bit)
	char charVar; // primitive value 3. Textual type(char=16bit)
	boolean booleanVar; // primitive value 4. Logical type(boolean=1bit)
	String stringVar; // referance value
}