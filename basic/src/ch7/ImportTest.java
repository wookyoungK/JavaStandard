package ch7;

// java.lang.* ������ System, string ����  Ŭ������ ��Ű����
// ����� ���Ǳ� ������ ������� ��밡���ϴ�.
import java.text.SimpleDateFormat;
import java.util.Date;


class ImportTest 
{
	public static void main(String[] args) 
	{
		 Date today = new Date();
		 
		 SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		 SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

		 System.out.println("���� ��¥�� " + date.format(today));
		 System.out.println("���� �ð��� " + time.format(today));
	}
}
