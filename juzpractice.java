class A {
	A() {
		System.out.println("This is class A constructor");
	}
}

class B extends A {
	int a;
	
	B() {
		//this();
		super();
		System.out.println("This is class B constructor");
	}
	void function(int a) {
		this.a = a;
		//return a;
	}
}

public class juzpractice {
	public static void main(String[] args) {
		B obj = new B();
		obj.function(25);
		System.out.println(obj.a);
	}
}