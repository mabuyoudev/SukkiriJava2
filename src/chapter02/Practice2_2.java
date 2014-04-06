package chapter02;

import java.util.*;

class PracticeHero {
	private String name;
	public PracticeHero(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}

public class Practice2_2 {

	public static void main(String[] args) {
		PracticeHero h1 = new PracticeHero("斉藤");
		PracticeHero h2 = new PracticeHero("鈴木");
		List<PracticeHero> list = new ArrayList<>();
		list.add(h1);
		list.add(h2);
		for(PracticeHero h : list) {
			System.out.println(h.getName());
		}
		Map<String, Integer> list2 = new HashMap<String, Integer>();
		list2.put(h1.getName(), 3);
		list2.put(h2.getName(), 7);
		for(String key : list2.keySet()) {
			int value = list2.get(key);
			System.out.println(key + "が倒した敵＝" + value);
		}
	}

}
