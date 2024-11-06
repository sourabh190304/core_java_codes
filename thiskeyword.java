package hefshine_workspace_learn;

public class thiskeyword {
int a;

//m1
void  show()
{
	this.show2(2);
	System.out.println("show method");
}

//m2
void show2(int a) {
	this.a=a;
	System.out.println("show2 method" +a);
}
//c1
	thiskeyword(){
		this(2.0f);
		System.out.println("default constructer");
	}
	
//c2
	thiskeyword(int a){
		this();
		System.out.println("para const"+a);
	}
	
//c3
	thiskeyword(float a)
	{
		System.out.println("f para const"+a);
	}
public static void main(String[] args) {
	//c1&2&3
	thiskeyword t1=new thiskeyword(7);
	
	//m1&m2
	//t1.show();    //formal arguement
	//t1.show2(2);  //actual arguement
}
}
