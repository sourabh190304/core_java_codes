package hefshine_workspace_learn;
import java.util.*;
public class from_user_method {
	
	//m1
	void add() 
	{
		System.out.println("enter values of a & b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("addition is : ");
		System.out.println(a+b);
		System.out.println();
	}
	
	//m2
	void mul(int x,int y)
	{
		int z=x*y;
	}
	
	
	//m3
	int sub(int p , int q)
	{
		int n=p-q;
		return n;
	}
	
	//m4
	
	int div() {
		System.out.println("enter values of j & k");
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();
		int k=sc.nextInt();
		System.out.print("division is : ");
		return j/k;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		//m1
		from_user_method f1= new from_user_method();
		f1.add();
		
		//m2
		System.out.println("enter values of x & y");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.print("multiplication is : ");
		System.out.println(x*y);
		System.out.println();
		f1.mul(x, y);
		
		//m3
		System.out.println("enter values of p & q");
		int p=sc.nextInt();
		int q=sc.nextInt();
		System.out.print("subtraction is : ");
		System.out.println(f1.sub(p, q));
		System.out.println();
		
		//m4
		int ans=f1.div();
		System.out.println(ans);
		
		
	
	}
	
	
	
	

}
