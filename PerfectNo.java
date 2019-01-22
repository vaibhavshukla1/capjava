
public class PerfectNo {
	public static void main(String[] args)
	{
		int i;
		int j,k;
		int count=0;
		for(i=2;i<=100;i++)
		{
			j=i;
			count=0;
			for(k=1;k<j;k++) 
			{
				if(j%k==0)
				{
					count+=k;
				}
			}
			if(count==j)
			{
				System.out.println(j);
			}
		}
	}

}
