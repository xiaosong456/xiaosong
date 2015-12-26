import java.io.*;
class Copy 
{
	public static void main(String[] args) throws IOException
	{
		long start=System.currentTimeMillis();
		/*FileInputStream fis;
		FileOutputStream fos;
		fis=new FileInputStream("D:\\KuGou\\K - 歌之王国语.mp3");
		fos=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\K - 歌之王国语.mp3");
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);*/
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\KuGou\\K - 歌之王国语.mp3"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\K - 歌之王国语.mp3"));
		byte[] str=new byte[10240];
		int ch=0;
		while((ch=bis.read(str))!=-1)
		{
		bos.write(str,0,ch);
		}
		bis.close();
		bos.close();
		long end=System.currentTimeMillis();
		System.out.println("Time:"+(end-start));
	}
}
