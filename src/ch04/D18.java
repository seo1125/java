package ch04;

import java.util.Scanner;

public class D18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) squaren root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴 (1~3)을 선택하세요.(종료:0)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu ==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못선택했다 (종료0)");
				continue;
			}
			System.out.println("선택하신 메뉴는"+menu+"번입니다.");
		}
	}

}
