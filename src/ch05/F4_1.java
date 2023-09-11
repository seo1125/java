package ch05;

import java.util.Arrays;

public class F4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		int cnt = 0 ; 
		try {
			for(int i = 0 ; i < 100; i++) {
				int n = (int)(Math.random() * 12);
				int tmp = numArr[0];
				numArr[0] = numArr[n];
				numArr[n] = tmp;
				cnt ++;
		}
		}catch (Exception e) {
			System.out.println("cath블럭문 Exception e");
		}
		System.out.println(Arrays.toString(numArr));
		System.out.println("프로그램 정상종료 count:"+cnt);
	}

}
