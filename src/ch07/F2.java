package ch07;
class parent {int x =10;}

class Chuld extends parent{
	int x = 20;
	
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}
public class F2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chuld c = new Chuld();
		c.method();
	}

}
