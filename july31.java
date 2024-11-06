package hefshine_workspace_learn;
import java.util.*;
public class july31 {
	public static void main(String[] args) {
		
		/*
		
		int i=1;
		while(i<=5)
		{
			System.out.println("hello");
			i++;
		}
		
		int j=1;
				do
				{
					System.out.println("hello");
					j++;
				}
				while(j<=5);
						
		// 1-100 even and odd
		System.out.println("even");
		for(int i=1; i<=100; i++) {
			
		
			if(i%2==0)
			{
				System.out.println(i);
			}
				
		}
		System.out.println("odd");
		for(int i=1; i<=100; i++) {
			
		
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
		// pos neagative using for if 
		System.out.println("positive");
		for(int i=1; i<=100; i++)
		{
			if(i>=0)
			{
				System.out.println(i);
			}
			
			for(int i=-10; i<=-100; i++)
			{
				if(i<=0)
				{
					System.out.println(i);
					
					
				}
			}
			
		
		// factorial number using for 
		int num=4;
		int fact=1;
		for (int i=1; i<=num; i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
		
		
          // to find all number end with 7 in 100-200 range 
		
		int ele=7;
		int start=100;
		int end=200;
		
		for(int i=start; i<end; i++) {
			if(i%10==7)
			{
				System.out.println(i);
			}
		}
			
		*/
		
		// count total digit in given number 
		
		/*
		Scanner sc= new Scanner(System.in);
		System.out.println("num: ");
		int num= sc.nextInt();
		int count=0;
		while(num>0) {
			num=num/10;
			count++;	
		}
		System.out.println("a total digit in given number: " +count);
		*/
		
		/*
		int num=1;
		int diff=2;
		for( int i=0; i<7; i++)
		{
			System.out.println(num);
			num=num+diff;
			diff++;
		}
		
		
		/*
		int sum=0;
		int k=2;
		
		for(int i=1; i<=10; i++)
		{
			sum=sum+i%k;
			
		}
		System.out.println(sum);
	
		Scanner sc= new Scanner(System.in);
		System.out.println("num: ");
		int num= sc.nextInt();
		int sum=0;
		for( int i=1; i<=30; i++)
		{
			if(num%i==0)
			{
				if(i%2==0)
					sum=sum+i;
			}
			}
		System.out.println(sum);
		*/
		int size=5;
		for(int i=1; i<=size; i++){
			System.out.print(i);
			for(int j=1+1,num=4,p=i; j<=i; j++,num--) {
				p=p+num;
				System.out.print(" "+p);
			}
		}
			System.out.println();
	}

}
