// FileWriterを用いたサンプルコード

package chapter06;

import java.io.*;

public class List6_1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("/Users/y_mabuchi/Documents/workspace/SukkiriJava2/bin/chapter06/rpgsave.dat", true);
		fw.write('A');
		fw.flush();
		fw.close();
	}

}
