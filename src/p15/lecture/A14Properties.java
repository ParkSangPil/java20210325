package p15.lecture;

import java.io.FileReader;
import java.util.Properties;

public class A14Properties {
	public static void main(String[] args) throws Exception{
		Properties props = new Properties();
		String path = "bin/p15/lecture/config1.properties";
		
		props.load(new FileReader(path)); // path에 있는 파일로부터 key value 값을 읽어 내겠다 라는 뜻
		
		System.out.println(props.get("id"));
		System.out.println(props.get("password"));
		
		String idValue = (String) props.get("id");
		String Value = props.getProperty("id");
		
		
	}
}
