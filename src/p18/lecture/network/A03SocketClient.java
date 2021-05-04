package p18.lecture.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class A03SocketClient {
	public static void main(String[] args) {
		Socket socket = null;
		InputStream is = null;
		InputStreamReader isr = null;
		
		OutputStream os = null;
		OutputStreamWriter osw = null;

		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("172.30.1.49", 5001));
			System.out.println("[연결 완료]");

			is = socket.getInputStream();
			isr = new InputStreamReader(is);

			char[] cbuf = new char[100];
			int len = isr.read(cbuf);
			String message = new String(cbuf, 0, len);
			System.out.println(message);
			
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			osw.write("돈까스 좋아해요? ㅋㅋㅋㅋ");
			osw.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (socket != null) {
				try {
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
