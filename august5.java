package hefshine_workspace_learn;

public class august5 {
	public static void main(String[] args) {

/*
  // menu driven of arithmetic opreation
		
		Scanner sc=new Scanner (System.in);
		System.out.print("enter value of a : ");
		int a=sc.nextInt();
		System.out.print("enter value of b : ");
		int b=sc.nextInt();
		System.out.println("enter 1 to add");
		System.out.println("enter 2 to mul");
		System.out.println("enter 3 to sub ");
		System.out.print("enter your choice : ");
		int c=0;

		int choice= sc.nextInt();

		switch(choice) {
		case 1: 
			// add
			c=a+b;
			System.out.println(c);
			break;
		case 2:
			//mul
			c=a*b;
			System.out.println(c);
			break;
		case 3:
			//sub
			c=a-b;
			System.out.println(c);
			break;

			default :
				System.out.println("invalid input");
		}
		 

		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		int sum=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i);
				count++;
				sum=sum+i;
			}
		}
		System.out.println("the total factorials is"+count);
		System.out.println("the sum of total factorials is"+sum);
		
		
		*/
		int num1=4;
		int num2=5;
		int fact1=1;
		int fact2=1;
		for(int i=1; i<=num1; i++) {
			fact1=fact1*i;
		}
		for(int i=1; i<=num2; i++){
			fact2=fact2*i;
		}
		int mean=fact1;
		if(mean<fact2) {
			mean=fact2;
		}
		for(int i=mean; i>=1; i--) {
			if(fact1%i==0 && fact2%i==0) {
		     System.out.println(i);
		     break;
			}
		}


		int n=5; 
		int k=10;
		System.out.println(++n/2*k);
		
		












	}

}
