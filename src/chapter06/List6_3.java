// ファイルに2進数の01000001を追記するプログラム

package chapter06;

import java.io.*;

public class List6_3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("/Users/y_mabuchi/Documents/workspace/SukkiriJava2/bin/chapter06/rpgsave.dat", true);
		fos.write(65);
		fos.flush();
		fos.close();
	}

}
