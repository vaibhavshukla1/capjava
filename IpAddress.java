package program1;

import java.util.Scanner;

public class IpAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of enter in log file:");
		int n=sc.nextInt();
		float[] f=new float[n];
		for(int i=0;i<n;i++) {
			f[i]=sc.nextFloat();
		}
		float l;
		int[] a= new int[n];
		int count=0;
		for(int j=0;j<n;j++) {
			l=f[j];
			for(int k=0;k<n;k++) {
				if(l==f[k]) {
					count+=1;
				}
			}
			a[j]=count;
			count=0;
		}
		int t=0;
		int flag=0;
		for(int y=0;y<n;y++) {
			t=a[y];
			for(int u=0;u<n;u++) {
				if(t>=a[u]) {
					flag=1;
				}
				else {
					flag=0;
				}
			}
		}
		System.out.println(t);

	}

}
