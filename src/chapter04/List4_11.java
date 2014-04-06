// システムプロパティの取得

package chapter04;

import java.util.*;

public class List4_11 {

	public static void main(String[] args) {
		System.out.println("ご利用のJavaのバージョン:");
		System.out.println(System.getProperty("java.version"));
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("[システムプロパティ一覧]");
		while(i.hasNext()){
			String key = i.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}
		final String BR = System.getProperty("line.separator");
		System.out.println("本日は" + BR + "晴天なり");
	}

}
