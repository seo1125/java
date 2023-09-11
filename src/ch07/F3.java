package ch07;
class parent2 {int x =10;}

class Chuld2 extends parent2{
	
	
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}
public class F3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chuld2 c = new Chuld2();
		c.method();
	}

}
