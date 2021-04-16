package sec05.exam01_inputstreamreader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		// ����Ʈ��� �Է½�Ʈ��
		InputStream is = System.in;
		// ������Ʈ���� ����Ͽ� ���ڱ�� �Է½�Ʈ������ ��ȯ�Ѵ�.
		Reader reader = new InputStreamReader(is);	
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo=reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();
	}
}

