package program1;

import java.util.Scanner;

public class Occuranc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch;
		int count=0;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			for(int j=0;j<str.length();j++) {
				if(ch==str.charAt(j)) {
					count+=1;
				}
			}
			System.out.println("Number of "+ch+" are "+count);
		}

	}

}
