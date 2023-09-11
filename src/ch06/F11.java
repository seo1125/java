package ch06;
class MyMath1{
	long a,b;
	long add() {
		return a+ b;
	}
	static long add(long a, long b) {
		return a+b;
	}
}
public class F11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("클래스(static)1:"+MyMath1.add(200L,100L));
		
		
	}

}
