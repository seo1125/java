package ch04;

import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {
		System.out.println("숫자를 하나 입력하세요");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다");
		}else if(input==9){
			System.out.println("입력하신 숫자는 9입니다");
		}else {
			System.out.println("입력하신 숫자는 0이나 9가 아닙니다");
		}
		
	}

}
