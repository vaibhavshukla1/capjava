import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter length of series :");
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int a=0,b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int i;
		for(i=1;i<=len-2;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
