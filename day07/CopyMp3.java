import java.io.*;
class CopyMp3 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{
			fis=new FileInputStream("D:\\KuGou\\³Â»ÛÁÕ - Love Paradise.mp3");
			fos=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\³Â»ÛÁÕ - Love Paradise.mp3");
			byte[] str=new byte[10240];
			int len=0;
			while((len=fis.read(str))!=-1)
			{
			fos.write(str,0,len);
			}
		}
		catch (IOException e)
		{
			throw new IOException("¿½±´Ê§°Ü");
		}
		finally
		{
			try
			{
			if(fis!=null)
				fis.close();
			}
			catch (IOException e)
			{
				throw new IOException("¿½±´Ê§°Ü");
			}
			try
			{
			if(fos!=null)
				fos.close();
			}
			catch (IOException e)
			{
				throw new IOException("¿½±´Ê§°Ü");
			}
		}
	}
}
