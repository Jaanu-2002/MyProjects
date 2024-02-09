import java.util.*;
class Adamnumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,rev=0,rev1=0,square,square1,temp,rem;
		System.out.println("enter the number");
		n=sc.nextInt();
		square=n*n;
		temp=n;
		while(temp>0)
		     {
                     rem=temp%10;
                     rev=rev*10+rem;
                     temp=temp/10;
              }
			  square1=rev*rev;
			  while(square1>0)
		      {
				  rem=square1%10;
				  rev1=rev1*10+rem;
				  square1=square1/10;
	          }
			  if(square==rev1)
				  System.out.println("ADAM");
			  else
				  System.out.println("NOT");
}
}