// 練習7-1

package chapter07;

import java.io.Serializable;

public class Department implements Serializable {
	private static final long serialVersionUID = 1111L;
	String		name;
	Employee	leader;
}
