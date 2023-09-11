package ch06;
class card{
	String kind;
	int number;
	static int width=100;
	static int height=250;
	
}
public class F3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("card.width="+card.width);
		System.out.println("card.height="+card.height);
		
		card c1 = new card();
		c1.kind="heart";
		c1.number=7;
		
		card c2 = new card();
		c2.kind="Spade";
		c2.number=4;

		card c3 = new card();
		c3.kind="clover";
		c3.number=2;
		
		card c4 = new card();
		c4.kind="diamond";
		c4.number=4;
		
		System.out.println("c1은"+ c1.kind+","+c1.number+"이며, 크기는 ("+c1.width+","+c1.height+")");
		System.out.println("c2은"+ c2.kind+","+c2.number+"이며, 크기는 ("+c2.width+","+c2.height+")");
		System.out.println("c3은"+ c3.kind+","+c3.number+"이며, 크기는 ("+c3.width+","+c3.height+")");
		System.out.println("c4은"+ c4.kind+","+c4.number+"이며, 크기는 ("+c4.width+","+c4.height+")");
		System.out.println("c1의 width와 heigth를 각각 50,80으로 변경합니다");
		c1.width=50;
		c1.height=80;
		
		System.out.println("c1은"+ c1.kind+","+c1.number+"이며, 크기는 ("+c1.width+","+c1.height+")");
		System.out.println("c2은"+ c2.kind+","+c2.number+"이며, 크기는 ("+c2.width+","+c2.height+")");
		System.out.println("c3은"+ c3.kind+","+c3.number+"이며, 크기는 ("+c3.width+","+c3.height+")");
		System.out.println("c4은"+ c4.kind+","+c4.number+"이며, 크기는 ("+c4.width+","+c4.height+")");
		
	}

}
