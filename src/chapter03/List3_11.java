// ローカルクラスの利用例

package chapter03;

class Outer {
	int outerMember;
	void outerMethod() {
		int a = 10;
		class Inner {
			public void innerMethod() {
				System.out.println("innerMethodです");
				System.out.println(outerMember);
				// System.out.println(a);
			}
		}
		Inner ic = new Inner();
		ic.innerMethod();
		System.out.println(a);
	}
}

public class List3_11 {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.outerMember = 30;
		o.outerMethod();
	}

}
