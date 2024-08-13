import java.util.*;

public class LeapYearNew {
public static void main (String[] args)
{
System.out.print("Enter the year: ");
Scanner sc = new Scanner(System.in);
int year = sc.nextInt();

if(year%4 == 0)
{
	if(year%100 == 0)
	{
		if(year%400 == 0)
		{
			System.out.println("Entered year is a Leap year");
		}
		else System.out.println("Entered year is not a Leap year");
	}
	else System.out.println("Entered year is a Leap year");
}
else System.out.println("Entered year is not a Leap year");
}
}