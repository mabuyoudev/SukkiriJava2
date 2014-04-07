// 練習6-1

package chapter06;

import java.io.*;
import java.util.zip.GZIPOutputStream;;

public class Practice6_1 {

	public static void main(String[] args) throws IOException {
		String inFile	= args[0];
		String outFile	= args[1];
		
		FileInputStream fis		= null;
		GZIPOutputStream gzos	= null;
		
		try {
			fis = new FileInputStream(inFile);
			FileOutputStream fos		= new FileOutputStream(outFile);
			BufferedOutputStream bos	= new BufferedOutputStream(fos);
			gzos = new GZIPOutputStream(bos);
			
			int i = fis.read();
			while(i != -1) {
				gzos.write(i);
				i = fis.read();
			}
			
			gzos.flush();
			gzos.close();
			fis.close();
		} catch(IOException e1) {
			System.out.println("ファイル操作に失敗しました");
			try {
				if(fis != null) fis.close();
				if(gzos != null) gzos.close();
			} catch(IOException e2) {
				
			}
		}
	}

}
