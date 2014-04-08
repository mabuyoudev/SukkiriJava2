// 練習8-1

package chapter08;

import java.io.*;
import java.net.*;

public class Practice8_1 {

	public static void main(String[] args)
	throws IOException {
		URL url = new URL("http://dokojava.jp/favicon.ico");
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream("/Users/yusukemabuchi/Documents/Temporary/dj.ico");
		
		int i = is.read();
		
		while(i != -1) {
			os.write((byte) i);
			is.read();
		}
		
		is.close();
		os.flush();
		os.close();
	}

}
