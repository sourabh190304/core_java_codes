package hefshine_workspace_learn;

import java.util.Scanner;

public class array_3d {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of 3D array: ");
		//giving size to array
		int r,c,d;
		r=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();

		//decalring new array
		int a[][][]= new int[r][c][d];

		//adding elements in an array
		System.out.println("enter the elements: ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				for(int k=0; k<d; k++) {
					a[i][j][k]=sc.nextInt();
				}
			}
		}

		//displaying an array
		System.out.println("display array: ");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				for(int k=0; k<d; k++) {
					System.out.print(" "+a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
System.out.println();
System.out.println();
		
		System.out.println("enter the size of 3D array: ");
		//giving size to array
		int r1,c1,d1;
		r1=sc.nextInt();
		c1=sc.nextInt();
		d1=sc.nextInt();
		
		//decalring new array
		int a1[][][]= new int[r1][c1][d1];
		 
		//adding elements in an array
		System.out.println("enter the elements: ");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				for(int k=0; k<d1; k++) {
					a1[i][j][k]=sc.nextInt();
				}
			}
		}
		 
		//displaying an array
		System.out.println("display array: ");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				for(int k=0; k<d1; k++) {
				System.out.print(" "+a1[i][j][k]);
			}
				System.out.println();
		}
			System.out.println();
		}
		
		int a2[]=new int[a.length];
	}
}
