class Parent2{
public Parent2() {
System.out.println("Constructor in Parent2");
}
public void sayHello(){
System.out.println("Hello");
}
abstract public void greet();
}

class Child2 extends Parent2 {
@Override
public void greet(){
System.out.println("Good Morning");
}
}

class Child3 extends Parent2{
public void th(){
System.out.println("I am good, I am feelin alright!");
}
}

public class abstractclass {
public static void main(String[] args)
{
Child2 c2 = new Child2();
Parent2 p2 = new Child2(); //it is allowed as it is just reference of abstract class.
}
}