package ch08;

public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1+"try블럭문 전");
		try {
			System.out.println(2+"try블럭문 ");
			System.out.println(3+"try블럭문 ");
		}catch (Exception e) {
			System.out.println(4+"cath블럭문 Exception e");
		}
		System.out.println(5+" try블럭문 끝");
	}

}
