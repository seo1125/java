package ch06;

class MyMath9{
	long a,b;
	
	
	long add() {return a+b;}
	long subtract() {return a-b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	static long add(long a, long b) {return a+b;}
	static long subtract(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
	static double divide(long a, long b) {return a/(double)b;}
}

public class F9_test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath1 mm1 =  new MyMath1();
		mm1.a = 300L;
		mm1.b = 100L;
		System.out.println("ExTest인스턴스1:"+mm1.add());
		System.out.println("ExTest클래스(static)2:"+mm1.add(200L,10L));
		System.out.println("ExTest인스턴스2:"+mm1.add());
		
		System.out.println("Ex9클래스(static)1:"+MyMath9.add(200L,100L));
		MyMath2 mm2 = new MyMath2();
		mm2.a = 300L;
		mm2.b = 100L;
		System.out.println("Ex9인스턴스1:"+ mm2.add());
		System.out.println("Ex9클래스(static)2:"+ mm2.add(200L,100L));
		System.out.println("Ex9인스턴스2:"+ mm2.add());
	}

}
