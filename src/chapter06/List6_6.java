// バイト配列に値を書き込む

package chapter06;

import java.io.*;

public class List6_6 {

	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(65);
		baos.write(66);
		byte[] data = baos.toByteArray();
		for (byte d : data) {
			System.out.println(d);
		}
	}

}
