package program1;

import java.util.Scanner;

public class Numerology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char str1;
		int count=0,count1=0;
		for(int i=0;i<str.length();i++) {
			str1=str.charAt(i);
			if((str1=='A')||(str1=='I')||(str1=='J')||(str1=='Q')||(str1=='Y')) {
				count+=1;
			}
			else if((str1=='B')||(str1=='K')||(str1=='R')) {
				count+=2;
			}
			else if((str1=='C')||(str1=='G')||(str1=='L')||(str1=='S')) {
				count+=3;
			}
			else if((str1=='M')||(str1=='D')||(str1=='T')) {
				count+=4;
			}
			else if((str1=='E')||(str1=='H')||(str1=='N')||(str1=='X')) {
				count+=5;
			}
			else if((str1=='U')||(str1=='V')||(str1=='W')) {
				count+=6;
			}
			else if((str1=='O')||(str1=='Z')) {
				count+=7;
			}
			else if((str1=='F')||(str1=='P')) {
				count+=2;
			}
		}
		int m=0;
		while(count>=10) {
			count1=count%10;
			count=count/10;
			m+=count1;
		}
		System.out.println(m);

	}

}
