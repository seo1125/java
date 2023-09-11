package ch06;

class Tv{
	
	String color;
	boolean power;
	int channe1;
	
	
	void power() { power = !power; }
	void channe1Up() { ++channe1;}
	void channe1Down() {--channe1;}
}
public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;
		t = new Tv();
		t.channe1=5;
		t.channe1Down();
		System.out.println("a현재 채널은 "+t.channe1+"입니다");
		
		t.channe1Up();
		System.out.println("b현재 채널은"+ t.channe1+"입니다");
	}

}
