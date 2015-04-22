package test.jack;

import static net.mindview.util.Print.print;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

interface Base {
}


class Derived {
}

public class ClassTypeInfo {
	public void test(Object x) {
		print("Testing x of type :" + x.getClass());
		
		print("x instanceof Base :" + (x instanceof Base));
		
		print("x instanceof Derived :" + (x instanceof Derived));
		
		print("Base.isInstance(x) :" + Base.class.isInstance(x));
		
		print("String.isInstance(x) :" + String.class.isInstance(""));

		
		print("Derived.isInstance(x) " + Derived.class.isInstance(x));
		
		print("x.getClass()" + x.getClass().toString());
		
		print("Base.class " + int.class);
		
		print("Derived.class " + Derived.class);
		
		
		print("x.getClass() == Base.class " + (x.getClass() == Base.class));
		print("x.getClass() == Derived.class "
				+ (x.getClass() == Derived.class));
//		print("x.getClass().equals(Basej.class)) "
//				+ (x.getClass().equals(Base.class)));
//		print("x.getClass().equals(Derived.class)) "
//				+ (x.getClass().equals(Derived.class)));
		

	}
	public static void main(String[] args) {
//		Base b = new Base();
		Derived d = new Derived();
		ClassTypeInfo c = new ClassTypeInfo();
		c.test(d);
	}

}
