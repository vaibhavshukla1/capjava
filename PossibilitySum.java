package program1;

import java.util.Scanner;

public class PossibilitySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			count+=i;
		}
		System.out.println(count);

	}

}
