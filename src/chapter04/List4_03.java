// equals()のオーバーライドをサボったHeroをコレクションに入れる

package chapter04;

import java.util.*;

public class List4_03 {

	public static void main(String[] args) {
		List<Hero1> list = new ArrayList<>();
		Hero1 h1 = new Hero1();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数=" + list.size());
		h1 = new Hero1();
		h1.name = "ミナト";
		list.remove(h1);
		System.out.println("要素数=" + list.size());
	}

}

class Hero1 {
	public String name;
}
