package ch04;

import java.util.Scanner;

public class D20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		outer:
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
				for(;;) {
					System.out.println("계산할 값을 입력하세요.(계산 종료:0, 전체종료:99)>");
					tmp = sc.nextLine();
					num = Integer.parseInt(tmp);
					
					if(num==0)
						break;
					
					if(num==99)
						break outer;
					
					switch(menu) {
					case 1:
						System.out.println("result="+num*num);
						break;
					case 2:
						System.out.println("result="+ Math.sqrt(num));
					case 3:
						System.out.println("result="+ Math.log(num));
						break;
					}
				}
				}
			}
				
	}


