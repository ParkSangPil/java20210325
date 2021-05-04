package p18.lecture.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class A02Socket {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		
//		InputStream is = null;
//		InputStreamReader isr = null;

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("172.30.1.49", 5001));

			System.out.println("[연결 기다림]");
			socket = serverSocket.accept();
			System.out.println("[연결 완료]");
			InetSocketAddress address = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println(address.getAddress());

			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			osw.write("hello client");
			osw.flush();
			
//			is = socket.getInputStream();
//			isr = new InputStreamReader(is);
//
//			char[] cbuf = new char[100];
//			int len = isr.read(cbuf);
//			String message = new String(cbuf, 0, len);
//			System.out.println(message);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (osw != null) {
				try {
					osw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			try {
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (serverSocket != null) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
