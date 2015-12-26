import java.io.*;
class CopyMusic 
{
	public static void main(String[] args) throws IOException
	{
		long start=System.currentTimeMillis();
		Copy_1();
		long end=System.currentTimeMillis();
		System.out.println("time="+(end-start));
	}
	public static void Copy_1()throws IOException
	{
	BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\KuGou\\Ёб╩шау - Love Paradise.mp3"));
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Ёб╩шау - Love Paradise.mp3"));
	byte[] str=new byte[10240];
	int len=0;
	while((len=bis.read(str))!=-1)
	{
	bos.write(str,0,len);
	}
	bis.close();
	bos.close();
	}
}