 import java.io.*;

class BufferedOutputStreamEx1 {
	public static void main(String args[]) {
		try {
		     FileOutputStream fos = new FileOutputStream("123.txt");
		     // BufferedOutputStream�� ���� ũ�⸦ 5�� �Ѵ�.
		     BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		     // ���� 123.txt��  1 ���� 9���� ����Ѵ�.
		     for(int i='1'; i <= '9'; i++) {
			     bos.write(i);
		     }

		     fos.close(); // ��ݽ�Ʈ���� close()�� ����ص� ���ۿ� �����ִ� ��� ������ ��µ��� �ʴ´�
			// ������Ʈ���� close()�� ȣ���ؾ��Ѵ�.
			//bos.close()ȣ���ؾ���
		} catch (IOException e) {
		     e.printStackTrace();		
		}
	}
}
