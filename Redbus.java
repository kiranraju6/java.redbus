
import java.util.Scanner;

public class Redbus {
	public static void main(String[] args) throws InterruptedException
	{
System.out.println("WELCOME TO KIRAN  BUS");
Thread.sleep(1000);
System.out.println("enter your name");
Scanner scan=new Scanner(System.in);
String name=scan.next();
	System.out.println("enter your age");
int age=scan.nextInt();
if(20<age&&60>age)
{
	System.out.println("your eligible to travel");

}
else
{
	System.out.println("your not eligible");
	System.out.println("sorry");

	System.exit(0);
}
System.out.println("enter your gender");
String str=scan.next();
String s1="male";
String s2="female";
if(str.equals(s1)||str.equals(s2))
{
System.out.println("amount is 500");
}
else
{
	System.out.println("not found");
	System.out.println("sorry");
	System.exit(0);
}
System.out.println("are you interest to pay money 500");
String n=scan.next();
String s3="yes";
if(n.equals(s3))
{
	System.out.println("enter youe seat number");
}
else
{
	System.out.println("go back");
	System.exit(0);
}

int seat=scan.nextInt();
if(seat<=40)
{
	System.out.println("your seat number booked");
}
	else
		
	{
		System.out.println(" kindly enter below 40");
		System.exit(0);
	}
System.out.println("enter your card details");
int card=scan.nextInt();
if(card>=0&&card<=999999999)
{
System.out.println("pay amount");
}
else
{
	System.out.println("incorrect");
}
int amount=scan.nextInt();
if(amount==500)
{
	System.out.println("amount paid");
}
else
{
	System.out.println("incorrect amount");
System.exit(0);
	}

System.out.println("ticket details");
System.out.println(name+" "+age+" "+str+"  "+amount);
System.out.println("thanks for booking in red bus");
System.out.println("booking compleated");
System.out.println("happy journey");
	}
	
}


