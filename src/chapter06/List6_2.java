// FileReaderを用いたサンプルコード

package chapter06;

import java.io.*;

public class List6_2 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("/Users/y_mabuchi/Documents/workspace/SukkiriJava2/bin/chapter06/rpgsave.dat");
		System.out.println("すべてのデータを読み込んで表示します");
		int i = fr.read();
		while(i != -1) {
			char c = (char) i;
			System.out.println(c);
			i = fr.read();
		}
		System.out.println("ファイルの末尾に到達しました");
		fr.close();
	}

}
