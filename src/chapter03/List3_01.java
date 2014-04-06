package chapter03;

public class List3_01 {

	public static void prints(Object a, Object b) {
		for(int i = 0; i < (Integer)b; i++) {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		Object s = "こんにちは";
		s = new Hero();
		Object n = 1;
		prints(n, s);
	}

}

class Hero {
	public String name;
}
