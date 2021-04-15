package sec04.exam04_file_reader;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		// FileReader는 문자기반 입력스트림
		FileReader fr = new FileReader("C:\\Users\\p00p1\\git\\javaLab\\chap18Lab\\src\\sec04\\exam04_file_reader\\FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo=fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}
}

