import  java.util.*;

public class fibonacci_recursion {

public static void main (String[] args) {

//0 1 1 2 3 5 8 13 21 34 55

//wap to print fibonacci sequence of first 10 numbers
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number to print thhe fibonacci sequence");
int i = sc.nextInt();

System.out.println();

fibonacci(i);

}

static int fibonacci (int seq) {
	
	int i=0;
	int j=1;
	int fib;
	
System.out.print("Fibonacci sequence is: "+i+" "+j+" ");
	
	for(seq=seq-2; seq>0; seq--) {
		fib = i+j;
		System.out.print(fib+" ");
		i=j;
		j=fib;
	}
	return 0;
}

}