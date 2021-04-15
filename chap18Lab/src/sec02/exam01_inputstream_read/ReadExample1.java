package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		// 바이트기반의 입력스트림
		InputStream is = new FileInputStream("C:/temp/test.txt");
		int readByte;
		
		while(true) {
			readByte = is.read();
			if(readByte == -1) 
				break;
			System.out.println((char)readByte);
		}
		is.close();
	}

}
