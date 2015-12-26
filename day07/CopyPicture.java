/*
¿½±´Í¼Æ¬
*/
import java.io.*;
class CopyPicture 
{
	public static void main(String[] args)throws IOException 
	{
		FileOutputStream fos=null;
		FileInputStream fis=null;
		try
		{
			fos=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\1213.jpg");
			fis=new FileInputStream("F:\\Í¼Æ¬\\SogouWP\\4d086e061d950a7b153372eb0bd162d9f2d3c99e[9378].jpg");
			byte[] str=new byte[10240];
			int ch=0;
			while((ch=fis.read(str))!=-1)
			{
			fos.write(str,0,ch);
			}
		}
		catch (IOException e)
		{
			throw new IOException("¿½±´Í¼Æ¬Ê§°Ü");
		}
		finally
		{
		try
		{
			if(fos!=null)
				fos.close();
		}
		catch (IOException e)
		{
			throw new IOException("¸´ÖÆÍ¼Æ¬Ê§°Ü");
		}
		try
		{
			if(fis!=null)
				fis.close();
		}
		catch (IOException e)
		{
			throw new IOException("¸´ÖÆÍ¼Æ¬Ê§°Ü");
		}
		}
		
	}
}
