package ch04;

import java.util.Scanner;

public class D4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("절 입력!!!!!!!!!!1");
		
		Scanner sc =new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
		System.out.println("봄");
		break;
		case 6: case 7: case 8:
		System.out.println("여름");
		break;
		case 9: case 10: case 11:
		System.out.println("가을");
		break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		default:
		
			
			if(month > 12) {
				System.out.println("그런건 없단다");
			}
		}
	}

}
