package hefshine_workspace_learn;

public class types_method {
	
	int a=10; //instance var
	//no passing parameter no return value
	void show1() {
		int b=20; // local var
		System.out.println("hey!"+" "+b);
	}
	
	//passing parameter but no return value
	void show(int a) {
		System.out.println(a*a);
	}
	
	//passing parameter but no return value
	int show(int a,int y) {
		return a+y;
	}
	
	//passing parameter & return value
	float show(float x,float y) {
		float z=x+y;
		return z;
	}
	
	//no passing parameter but  return value
	int show() {
		int a=10;
		return a*a*a;
	}
	
	public static void main(String[] args) {
		//method 1
		types_method e11= new types_method();
		e11.show1();
		
		//method 2
		types_method e12= new types_method();
		System.out.println(e12.a);
		e12.show(12);
		
		//method 3
		int r=e12.show(1,2);
		System.out.println(r);
		
		//method 4
		System.out.println(e12.show(2.2f,4.4f));
		
		//method 5
		int cube=e12.show();
		System.out.println(cube);
	}

}

