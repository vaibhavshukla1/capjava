import java.util.Scanner;

public class StrongNo {
	public static void main(String[] args)
	{
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int l,i,count=0;
		int m=1;
		int y=a;
		for(int w=1;w<=String.valueOf(a).length();w++) {
		l=y%10;
		m=1;
		for(i=1;i<=l;i++)
		{
			m*=i;
		}
		count+=m;
		y=y/10;
		}
		if(count==a)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
