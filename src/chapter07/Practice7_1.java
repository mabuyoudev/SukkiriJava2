// 練習7-1

package chapter07;

import java.io.*;
import java.util.*;

public class Practice7_1 {

	public static void main(String[] args) throws Exception {
		String filePath = "/Users/yusukemabuchi/Documents/Temporary/pref.properties";

		Reader fr		= new FileReader(filePath);
		Properties p	= new Properties();
		
		p.load(fr);
		System.out.println(p.getProperty("aichi.capital") + ":" + p.getProperty("aichi.food"));
		fr.close();
	}

}
