// 匿名クラスの利用例

package chapter03;

public class List3_12 {

	public static void main(String[] args) {
		Pocket2<Object> pocket = new Pocket2<>();
		System.out.println("使い捨てのインスタンスを作りpocketに入れます");
		pocket.put(new Object() {
			String innerField = "innerFieldです";
			void innerMethod() {
				
			}
		});
	}

}
