package ch05;

public class F8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				{100, 100, 100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
		};
		int sum = 0;
		System.out.println("번호   국어   영어  수학   총점   평균");
		System.out.println("====================");
		for(int i = 0 ;  i < score.length; i++) {
			int i_sum = 0;
			for(int j = 0 ; j < score[i].length; j++) {
				System.out.printf("%d ", score[i][j]);
				i_sum += score[i][j];
				sum += score[i][j];
			}
			System.out.print(i_sum +" ");
			System.out.print(i_sum/3);
			System.out.println();
		}
		System.out.println("====================");
		System.out.println("총점=240   240   240");
	}

}
