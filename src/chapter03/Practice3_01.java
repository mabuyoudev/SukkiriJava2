// 練習問題

package chapter03;

class StrongBox<E> {
	private E strongBox;
	private KeyType keyType;
	private int count;
	public void put(E strongBox) {
		this.strongBox = strongBox;
	}
	public E get() {
		count--;
		if(count == 0){
			return this.strongBox;
		}
		return null;
	}
	public StrongBox(KeyType keyType) {
		this.keyType = keyType;
		switch (keyType) {
		case PADLOCK: this.count = 1024;
		case BUTTON : this.count = 10000;
		case DIAL   : this.count = 30000;
		case FINGER : this.count = 1000000;
		}
	}
}

enum KeyType {
	PADLOCK,
	BUTTON,
	DIAL,
	FINGER
}

public class Practice3_01 {

	public static void main(String[] args) {
		

	}

}
