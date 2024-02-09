import java.util.*;
class Arraysecrepeat
{
	public static void main (String[] args)     
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n,i,j,rep=0,num=0;
		System.out.println("enter the size of array a");
		n=sc.nextInt();
		System.out.println("enter the array elements a");
	    for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					num=a[i];
					rep++;
					break;
				}
			}
			if(rep==2)
				break;
		}
		if(rep==2)
			System.out.println("second repeated element found="+num);
		else 
			System.out.println("second repeated element not found");
	}
}