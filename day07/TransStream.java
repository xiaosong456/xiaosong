/*
键盘录入一行数据并打印其实就是readLine方法

readLine方法是字符流BufferedReader类中的方法
而键盘录入read方法是字节流InputStream的方法


1、明确源和目的
	源：输入流。InputStream Reader
	目的：输出流。OutputStream Writer
2、操作的数据是否是纯文本
	是：字符流；
	不是：字节流
3、当体系明确后再明确具体使用哪个对象
	通过设备进行区分
	源设备：内存，硬盘，键盘
	目的设备：内存，硬盘，控制台
*/
import java.io.*;
class  TransStream
{
	public static void main(String[] args) throws IOException
	{
		WriteOut();
	}
	public static void ReadIn()throws IOException
	{
		//获取键盘录入对象
		//InputStream in=System.in;
		//将字节流对象转成字符流对象，使用转换流，InputStreamReader
		//InputStreamReader isr=new InputStreamReader(in);
		//为了提高效率将字符串写入缓冲区提高效率 使用BufferedReader
		//BufferedReader bufr=new BufferedReader(isr);
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));

		String line=null;
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
		System.out.println(line.toUpperCase());
		}
		bufr.close();
	}
	public static void WriteOut()throws IOException
	{
	//OutputStream out=System.out;
	//OutputStreamWriter osw=new OutputStreamWriter(out);
	//BufferedWriter bufw=new BufferedWriter(osw);

	BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));


	BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(System.out));
	String line=null;
	while((line=bufr.readLine())!=null)
	{
	if("over".equals(line))
		break;
	bufw.write(line.toUpperCase());
	bufw.newLine();
	bufw.flush();
	}
	bufr.close();
	}
}