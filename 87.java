/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
              Scanner sc=new Scanner(System.in);
              int a=sc.nextInt();
              int b=sc.nextInt();
              int i,gcd=0;
              for(i=1; i<=a && i<=b; i++)
              {
              	if(a % i== 0 && b % i == 0)
              	gcd=i;
              }
              System.out.println(gcd);
	}
}
