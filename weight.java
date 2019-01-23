package program1;
import java.util.Scanner;
public class weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=str.toUpperCase();
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			count+=(int)ch-64;
			//count+=Integer.parseInt(str1[i]);	
		}
		System.out.println(count);
	}

}
