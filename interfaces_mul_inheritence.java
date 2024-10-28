import java.util.*;

interface Bicycle {
	int a = 45;
	void applyBrake(int decrement);
	void speedUp(int increment);
}

interface HornBicycle extends Bicycle {
	int x = 45;
	void blowHornk3g();
	void blowHornmhn();
}

abstract class Bicyclepart {
	abstract void part();
}

class AvonCycle extends Bicyclepart implements Bicycle, HornBicycle{
	public int a= 5; // this initialized variable is copy of var a. It is not replicating interface variable a=45.
	public void blowHorn(){
		System.out.println("pepe popo");
	}
	public void applyBrake(int decrement){
		System.out.println("Applying brake");
	}
	public void speedUp(int increment){
		System.out.println("Applying speedUp");
	}
	public void blowHornk3g(){
		System.out.println("kahi khusho=i kabhi gum");
	}
	public void blowHornmhn(){
		System.out.println("Main hoon naa");
	}
	public void part(){
		System.out.println("Buy a Bicycle Part");
	}
}

public class interfaces_mul_inheritence {
	public static void main(String args[])
	{
		AvonCycle cycleHarry = new AvonCycle();
		cycleHarry.applyBrake(1);
		//cycleHarry.a = 454;
		System.out.println(cycleHarry.a);
	}
}
