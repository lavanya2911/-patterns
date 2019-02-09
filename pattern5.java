import java.util.*;
class pattern5
{
	public static void main(String [] args)
	{	
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		for(int i=a;i>0;i--)
		{
			for(int j=0;j<a;j++)
		{
			if(j>=(a-i))
			System.out.print("*");
			else
			System.out.print(" ");
		}
		System.out.println();
		}
	}
}
