package hefshine_workspace_learn;
interface a{
	int a=10;
	String area="mumbai";
	void show();
	void config();
	void get();
}
abstract class b implements a{
	public void get() {

	}

	public void show() {
		System.out.println("showing");
	}
	public void config() {
		System.out.println("configuring");
	}
}
class c extends b{
	public void get() {
		System.out.println("getting");
	}
	void display() {
		System.out.println("dsmnbfj");
	}
}
public class practice {
	public static void main(String[] args) {
		c a1=new c();
		a1.show();
		a1.config();
		a1.get();

	}

}
