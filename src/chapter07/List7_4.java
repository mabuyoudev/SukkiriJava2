// プロパティフィールドを読み込むコード

package chapter07;

import java.io.*;
import java.util.*;

public class List7_4 {

	public static void main(String[] args) throws IOException {
		String filePath = "/Users/yusukemabuchi/Documents/Temporary/rpgdata.properties";
		Reader fr = new FileReader(filePath);
		Properties p = new Properties();
		p.load(fr);
		String name = p.getProperty("heroName");
		String strHp = p.getProperty("heroHp");
		int hp = Integer.parseInt(strHp);
		System.out.println("勇者の名前:" + name);
		System.out.println("勇者のHP:" + hp);
		fr.close();
	}

}
