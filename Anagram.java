package assignment1;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String: ");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		char[] q=new char[a.length()];
		char[] w=new char[b.length()];
		int i,j,count=0;
		int p=a.length();
		for(i=0;i<a.length();i++)
		{
			char r=q[i];
			for(j=0;j<b.length();j++)
			{
				if(r==w[j])
				{
					count+=1;
					w[j]=1;
				}
			}
		}
		if(count==p)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}

	}

}
