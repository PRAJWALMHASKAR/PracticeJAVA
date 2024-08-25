//importing math library
import java.util.*;

public class Reverse {

//function to reverse a number. This function returns another function.
static int rev(int n) {

int digits = (int)(Math.log10(n)+1);
return helper(n,digits);

}

//this function uses pow to add numbers  and it is main part of calculation of reverse number
private static int helper(int n, int digits) {

if(n%10 == n) {
return n;
}

int rem = n%10;
//recurrence relation -- important
return rem*(int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);

}

public static void main(String[] args) {
	System.out.println(rev(2346));
}

}
