package chapter07;

import java.io.*;

public class Practice7_2 {

	public static void main(String[] args) throws Exception {
		Employee e	= new Employee();
		e.name		= "田中太郎";
		e.age		= 41;
		
		Department d = new Department();
		d.name		= "総務部";
		d.leader	= e;
		
		String filePath			= "/Users/yusukemabuchi/Documents/Temporary/company.dat";
		FileOutputStream fos	= new FileOutputStream(filePath);
		ObjectOutputStream oos	= new ObjectOutputStream(fos);

		oos.writeObject(d);
		oos.flush();
		oos.close();
	}

}
