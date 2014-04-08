// ServerSocketを使ったシンプルなサーバープログラム

package chapter08;

import java.net.*;

public class List8_3 {

	public static void main(String[] args)
	throws Exception {
		System.out.println("起動完了");
		
		ServerSocket svSock	= new ServerSocket(39468);
		Socket sock			= svSock.accept();
		
		System.out.println(sock.getInetAddress()
				+ "から接続");
		
		sock.getOutputStream().write("WELCOME".getBytes());
		sock.getOutputStream().flush();
		sock.getOutputStream().close();
		svSock.close();
	}

}
