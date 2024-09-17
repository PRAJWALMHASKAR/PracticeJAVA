class A{
	int func(){
		System.out.println("This is class A function");
		return 20;
	}
}

class B extends A{
	@Override
	int func() {
		System.out.println("This is class B function");
		return 30;
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		A obj = new B(); //It is dynamic allocation of object. Here, the object created is of class A but the refrence passed to the object is of class B, which  is a subclass. Therefore, it is allowed in Java.
		System.out.println(obj.func());
	}
}