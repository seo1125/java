package ch04;

public class D13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		
		while(sum <= 10) {
			System.out.printf("%d - %d%n", i , sum);
			//sum += ++i;
			i = i + 1;
			sum = sum + i;
		}
	}

}
