import java.util.*;

class countprime
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int count=0;
		int flag=0;
		
		for(int i=a;i<=b;i++)
		{
			count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				flag++;
				//System.out.println("prime - " +i);
				
			}
		}System.out.println("count - " +flag);
		
	}
}
