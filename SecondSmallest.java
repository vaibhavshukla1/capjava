package program1;
import java.util.Scanner;
import java.util.Arrays;
public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] m= new int[n];
		for(int i=0;i<n;i++)
		{
			m[i]=sc.nextInt();
		}
		int count=0,q=0;
		for(int j=0;j<n;j++)
		{
			count=0;
			int k=m[j];
			for(int h=0;h<n;h++)
			{
				if(k<=m[h]) {
					count+=1;
				}
			}
			if(count==n-1)
			{
				q=k;
				break;
			}
		}
		System.out.println(q);
		
	}

}
