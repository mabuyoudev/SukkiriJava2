package chapter01;

public class Practice1_1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1;i < 101;i++){
			sb.append(String.valueOf(i)).append(",");
		}
		String s = sb.toString();
		//System.out.println(s);
		String[] a = s.split(",");
		for(String b : a){
			System.out.println(b);
		}
 	}

}
