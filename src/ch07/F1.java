package ch07;
class Tv {
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class SmartTv extends Tv{
	boolean caption;
	void displayCaotion(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println("채널 : "+stv.channel);
		stv.displayCaotion("HELLO, WORID 1");
		stv.caption = true;
		stv.displayCaotion("HELLO, WORID 2");
	}

}
