package ch04;

import java.util.Scanner;

public class D14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, sum = 0;
		System.out.println("숫자입력");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			sum += num%10;
			System.out.printf("sum=%3d num=%n%d",sum , num);
			
			num /= 10;
		}
		System.out.println("각 자리수의 합:"+sum);
	}

}
