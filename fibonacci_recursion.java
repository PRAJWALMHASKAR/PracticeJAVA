import  java.util.*;

public class fibonacci_recursion {

public static void main (String[] args) {

//0 1 1 2 3 5 8 13 21 34 55

	//wap to print fibonacci sequence of first 10 numbers
	for(int j=0; j<=10; j++)
	{
		System.out.println(fib_rec(j));
	}

}
	
//Using recursion
static int fib_rec(int n) {
	if(n<=1)
	{
		return n;
	}
	return fib_rec(n-1)+fib_rec(n-2);
}
	
}
