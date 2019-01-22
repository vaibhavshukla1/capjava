package assignment1;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String to be check:");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String[] str1= str.split("");
		int count=0,count1=0;
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]!=null)
			{
				for(int j=i+1;j<str1.length;j++)
				{
					if(str1[i].equals(str1[j]))
					{
						str1[j]=null;
						count+=1;
					}
				}
			}
			if(str1[i]==" ")
			{
				count1+=1;
			}
		}
		
		int co=str1.length-count-count1;
		if(co==27)
		{
			System.out.println("Pangram");
		}
		else
		{
			System.out.println("not pangram");
		}
	}

}
