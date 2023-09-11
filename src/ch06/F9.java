package ch06;
class mymath3{
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	long subtract(long a, long b) {
		return a - b;
	}
	long multiply(long a, long b) {
		return a * b;
	}
	double divide(double a, double b) {
		return a / b;
	}
}
public class F9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mymath3 mm = new mymath3();
		long result1 = mm.add(5L,3L);
		long result2 = mm.subtract(5L,3L);
		long result3 = mm.multiply(5L,3L);
		double result4 = mm.divide(5L,3L);
		
		System.out.println("add(5L,3L)="+result1);
		System.out.println("subtract(5L,3L)="+result2);
		System.out.println("multipy(5L,3L)="+result3);
		System.out.println("divide(5L,3L)="+result4);
		
		for(int j = 1; j < 10 ; j++) {
			int i = (int)(Math.random()*23)+1;
			System.out.println("int i:"+i);
		}
		
	}

}
