package assignment1;

import java.util.Scanner;

public class Duplicacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]!=null){
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i].equals(str1[j]))
				{
					str1[j]=null;
				}
			}}
		}
		for(int k=0;k<str1.length;k++)
		{
			if(str1[k]!=null){
			System.out.print(str1[k]+" ");
		}}

	}

}
