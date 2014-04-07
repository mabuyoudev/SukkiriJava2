// プロパティファイルへの書き込み

package chapter07;

import java.io.*;
import java.util.*;

public class List7_5 {

	public static void main(String[] args) throws Exception {
		String filePath = "/Users/yusukemabuchi/Documents/Temporary/rpgdata.properties";
		Writer fw = new FileWriter(filePath);
		Properties p = new Properties();
		p.setProperty("heroName", "アサカ");
		p.setProperty("heroHp", "62");
		p.setProperty("heroMp", "45");
		p.store(fw, "勇者の情報");
		fw.close();
	}

}
