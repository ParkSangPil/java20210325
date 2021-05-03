package p18.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class A07FileCopy {
	public static void main(String[] args) throws Exception{
		String src = "src/p18/lecture/A02InputStream.java";
		String des = "src/p18/lecture/A02InputStream.copy2";
		
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(des);
		
		byte[] datas = new byte[20];
		int len = 0;
		while((len = is.read(datas)) != -1) {
//			os.write(datas);   이건 20bytes씩 뭉텅뭉텅으로 복사함
			os.write(datas,0,len);  // 이건 잘 압축해서 씀
		}
		
		is.close();
		os.close();
		
		System.out.println("복사 완료");
	}
}
