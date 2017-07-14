package rsttst;
import java.util.Scanner;
public class Integer {
	public static void main(String[] args) {
System.out.println("ENTER THE SIZE OF THE ELEMENT");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int tp=0;
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(a[i]==a[j])
		{
			tp=a[0];
		
		}
	}
}
System.out.println(tp);
	}
}
	
