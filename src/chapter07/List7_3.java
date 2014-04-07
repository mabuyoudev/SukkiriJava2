// StringTokenizerを使った文字列の分割

package chapter07;

import java.util.*;

public class List7_3 {

	public static void main(String[] args) {
		String s = "ミナト,アサカ,スガワラ";
		StringTokenizer st = new StringTokenizer(s, ",");
		while(st.hasMoreTokens()) {
			String t = st.nextToken();
			System.out.println(t);
		}
	}

}
