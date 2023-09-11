package ch06;

public class F2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의" +t1.channe1+"입니다");
		System.out.println("t2의" +t2.channe1+"입니다");
		
		t1.channe1 = 5;
		System.out.println("t1의 channe1값을 5로 변경하였습니다");
		
		System.out.println("t1의 channe1값은"+t1.channe1+"입니다");
		System.out.println("t2의 channe1값은"+t2.channe1+"입니다");
		
		//t1.channe1();
		//System.out.println("현재 채널은"+t1.channe1+"입니다");
		//t1.channe1Up();
		//System.out.println("현재 채널은"+t1.channe1+"입니다");
		
	}

}
