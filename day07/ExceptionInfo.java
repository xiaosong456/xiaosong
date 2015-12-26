import java.io.*;
import java.util.*;
import java.text.*;
class ExceptionInfo
{
	public static void main(String[] args)throws IOException 
	{
		try
		{
			int[] arr=new int[2];
			System.out.println(arr[3]);
		}
		catch (Exception e)
		{
			Date d=new Date();
			try
			{
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String s=sdf.format(d);

				PrintStream ps= new PrintStream("Exception.log");
				ps.println(s);
				e.printStackTrace(ps);
				System.setOut(ps);
			}
			catch (Exception ex)
			{
				throw new RuntimeException("³öÏÖ´íÎó");
			}
		}
	}
}
