package chapter03;

public class List3_02 {

	public static void main(String[] args) {
		Pocket p = new Pocket();
		p.put("1192");
		String s = (String)p.get();
		System.out.println(s);
	}

}

class Pocket {
	private Object data;	// 格納用の変数
	public void put(Object d) {
		this.data = d;
	}
	public Object get() {
		return this.data;
	}
}
