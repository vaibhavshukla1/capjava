package program1;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch;
		int count=0;
		int m=0;
		for(int i=0;i<str.length();i++)
		{
			count=0;
			ch=str.charAt(i);
			for(int j=i;j<str.length();j++)
			{
				if(str.charAt(j)==ch) {
					count+=1;
				}
				
				else {
					break;
				}
			}
			if(m<count) {
				m=count;
			}
			
		}
		System.out.println(m);

	}

}
