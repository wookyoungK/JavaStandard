package ch8;
class ExceptionEx01 {
	public static void main(String[] args) 
   {
		try  {
			try	{	} catch (Exception e)	{ }
		} catch (Exception e)	{
			try	{	} catch (Exception e) { }	// ����. ���� e�� �ߺ� ����Ǿ���.
		} // try-catch�� ��

		try  {

		} catch (Exception e)	{

		} // try-catch�� ��
	}	// main�޼����� ��
}
