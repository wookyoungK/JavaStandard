package ch7;

// java.lang.* 때문에 System, string 같은  클래스들 패키지명
// 빈번이 상용되기 때문에 선언없이 사용가능하다.
import java.text.SimpleDateFormat;
import java.util.Date;


class ImportTest 
{
	public static void main(String[] args) 
	{
		 Date today = new Date();
		 
		 SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		 SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

		 System.out.println("오늘 날짜는 " + date.format(today));
		 System.out.println("현재 시간은 " + time.format(today));
	}
}
