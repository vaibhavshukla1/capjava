import java.util.*;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter marks :");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		if((a>=50)&&(a<61))
		{
			System.out.println("Pass");
		}
		else if((a>=61)&&(a<75))
		{
			System.out.println("First Class");
		}
		else if(a>=75)
		{
			System.out.println("Dictinsion");
		}
		else {
			System.out.println("Fail");
		}

	}

}
