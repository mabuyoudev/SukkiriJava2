// 文字列型の変数から1文字ずつ読み込む

package chapter06;

import java.io.*;

public class List6_5 {

	public static void main(String[] args) throws IOException {
		String msg = "第一土曜";
		Reader sr = new StringReader(msg);
		char c1 = (char) sr.read();
		char c2 = (char) sr.read();
		char c3 = (char) sr.read();
		char c4 = (char) sr.read();
		char[] characters = new char[] {
				c1,c2,c3,c4
		};
		for(char c : characters) {
			System.out.println(c);
		}
	}

}
