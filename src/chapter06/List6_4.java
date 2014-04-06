// 正しく例外処理を行うプログラム

package chapter06;

import java.io.*;

public class List6_4 {

	public static void main(String[] args) {
		/*FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/y_mabuchi/Documents/workspace/SukkiriJava2/bin/chapter06/rpgsave.dat", true);
			fw.write('A');
			fw.flush();
		} catch(IOException e) {
			System.out.println("ファイル書き込みエラーです");
		} finally {
			if(fw != null) {
				try {
					if(fw != null) fw.close();
				} catch(IOException e2) {
					
				}
			}
		}*/
		String filePath = "/Users/y_mabuchi/Documents/workspace/SukkiriJava2/bin/chapter06/rpgsave.dat";
		try(
			FileWriter fw = new FileWriter(filePath, true);
		) {
			fw.write('B');
			fw.flush();
		} catch(IOException e) {
			System.out.println("ファイル書き込みエラーです");
		}
	}

}
