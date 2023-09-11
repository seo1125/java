package ch08;

public class F2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1+"try블럭문 전");
		try {
			System.out.println(0/0 +"try 블럭문 0/0실행");
			System.out.println(2+"try블럭문 ");
		}catch (ArithmeticException ae) {
			System.out.println(3+" catch블럭문 실행 ae");
		}
		System.out.println(4+"try 블럭문끝");
		System.out.println("프로그램 정상 종료다 씨발련아^^");
	}

}
