import java.util.Scanner;
public class Leap
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
int c = sc.nextInt();
if(c%4==0)
{
System.out.println("Leap Year");
}else
{
System.out.println("Not a Leap Year");
}
}
}
