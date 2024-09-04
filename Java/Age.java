import java.util.Scanner;
class Age
{
public static void main(String[] args)
{
		Scanner nikky=new Scanner (System.in);
		System.out.print("enter a=");
		int a=nikky.nextInt();
		System.out.print("enter b=");
		int b =nikky.nextInt();
		System.out.print("enter c=");
                int c =nikky.nextInt();
	if(a>b && a>c)
     { 
		System.out.print(a+ " a is greater");
     }
	else if (b>c && b>a)
    {
		System.out.print(b+ " b is greater");
    }
	else
     {
		System.out.print(c+ "c is greater");
    } 
  }
}