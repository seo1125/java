package ch06;
class Date2{
	int x ;
}
public class F7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date2 d = new Date2();
		d.x = 10;
		System.out.println("main():x="+d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("F7 main(): x ="+d.x);
	}
	static void change(Date2 d) {
		d.x = 2000;
		System.out.println("change():x="+d.x);
	}

}
