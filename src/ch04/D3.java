package ch04;

import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = ' ', opt = '0';
		String s_test ="0";
		score = opt;
		
		System.out.println("char:"+ opt+"int : "+ score);
		
		System.out.println("점수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();//화면을 통해 입력받은 점수를 스코어에 저장
		
		if(score >= 90) {//스코어가 90점 보다 같거나 크면 A학점
			grade = 'A';
			if(score >= 98) {//90점 이상 중에서도 98점 이상은 A+
				opt = '+';
			}else if(score < 94) {//90점 이상 94점 미만은 A-
				opt = '-';
			}
		}else if(score >= 80) {//스코어가 80점 보다 같거나 크면 B학점
			grade = 'B';
			if(score >= 88) {
				opt='+';
			}else if(score < 84) {
				opt='-';
			}
		}else {//나머지는 C학점
			grade = 'c';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}

}
