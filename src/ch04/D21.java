package ch04;

import java.util.Scanner;

public class D21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, num=0;
		System.out.println("숫자를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			sum += num%10;
			System.out.printf("sum=%3d num%d%n", sum,num);
			
			num /=10;
		}
		System.out.println("각 자리수의 합:"+sum);
	}

}
