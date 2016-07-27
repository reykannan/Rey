import java.util.Scanner;
public class HelloWorld1
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
char c = sc.next().charAt(0);
if(Character.isLetter(c))
{
System.out.println("Alphabet");
}else
{
System.out.println("Not an alphabet");
}
}
}
