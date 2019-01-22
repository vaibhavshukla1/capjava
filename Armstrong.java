
public class Armstrong {
	public static void main(String[] args)
	{
		int i,j,count=0,l,k,m,n;
		for(i=1;i<=1000;i++)
		{
			count=0;
			j=i;
			l=String.valueOf(j).length();
			m=j;
			for(k=1;k<=l;k++)
			{
				double o=0;
				n=m%10;
				o=Math.pow(n,l);
				count+=(int)o;
				m=m/10;
			}
			if(count==j)
			{
				System.out.println(count);
			}
		}
	}
}
