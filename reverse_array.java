package hefshine_workspace_learn;

public class reverse_array {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		int[] b= {1,2,3,4,5,6,7};
		int i=0;
		for(; i<a.length; i++)
		{
		if(a[i]!=b[i]) {
		System.out.println(i);
		System.out.println(a[i]);
		}
	}
		if(i==a.length-1) {
			System.out.println(a[i]);
			System.out.println(i);
		}
	}
}
