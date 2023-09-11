package ch04;

public class D16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0 ; 
		int i = 0;
		
		while(true) {
			if(sum > 1)
				break;
			System.out.println("i1="+i);
			++i;
			System.out.println("i2="+i);
			sum += i;
		}
		
		System.out.println("i3="+i);
		System.out.println("sum="+sum);
	}

}
