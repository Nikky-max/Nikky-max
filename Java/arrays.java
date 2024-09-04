import java.util.Scanner;
class arrays
{
public static void main(String[] args)
{
	int size,sum=0;
	float average;
	Scanner saii=new Scanner(System.in);
	size = saii.nextInt();
	int marks=new int[size];												
	for(i=0; i<size; i++)
{
	marks[i]=saii.nextInt();
	sum = sum+marks[i];
	}

System.out.println(sum);
average=sum/size;
System.out.println(average);
}
}

