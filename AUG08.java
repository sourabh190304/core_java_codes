package hefshine_workspace_learn;

public class AUG08 {
	public static void main(String[] args) {
		
		/*
		int n=4;
		int sum=0;
		for(int r=1; r<=n; r++) 
		{
			int ans= (fact(n)/(fact(r))*fact(n-r));
			sum=sum+ans;
		}
		System.out.println(sum);
	}
		public static int fact(int n)
				{
			int fact=1;
			for (int i=2; i<=n; i++)
				fact=fact*i;
			return fact;
		*/
		
		// double factorial 
		
		int num=6;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			if(i%2==num%2) {
				fact=fact*i;
			}
		}
		System.out.println(fact);
		
		
	}

}
