package chapter04;

public class List4_01 {

	public static void main(String[] args) {
		Hero h = new Hero("湊",50,10);
		System.out.println(h);
	}

}

class Hero {
	private String	name;
	private int		hp;
	private int		mp;
	public Hero(String name, int hp, int mp) {
		this.name	= name;
		this.hp		= hp;
		this.mp		= mp;
	}
	public String toString() {
		return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
	}
}