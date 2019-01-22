import java.util.Scanner;

public class Power5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		double j=a;
		int k;
		int flag=0;
		for(k=1;k<=a;k++)
		{
			double q = Math.pow(5,k);
			if((int)q==a)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}

}
}
