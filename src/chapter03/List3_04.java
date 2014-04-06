package chapter03;

public class List3_04 {

	public static void main(String[] args) {
		Pocket2<String> p = new Pocket2<>();
		p.put("1192");
		String s = p.get();
		System.out.println(s);
	}

}

class Pocket2<E> {
	private E data;
	public void put(E d) {
		this.data = d;
	}
	public E get() {
		return this.data;
	}
}
