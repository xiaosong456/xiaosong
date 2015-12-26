import java.io.*;
class FileWrite 
{
	public static void main(String[] args) throws IOException
	{
		Read_3();
	}


	public static void Read_3()throws IOException
	{
	FileInputStream is=new FileInputStream("fox.txt");
	byte[] str=new byte[is.available()];
	is.read(str);
	System.out.println(new String(str));
	}


	public static void Read_2()throws IOException
	{
	FileInputStream is=new FileInputStream("fox.txt");
	byte[] str=new byte[10240];
	int len=0;
	while((len=is.read(str))!=-1)
	{
	System.out.print(new String(str,0,len));
	}
	}


	public static void Read_1()throws IOException
	{
	FileInputStream is=new FileInputStream("fox.txt");
	int ch=0;
	while((ch=is.read())!=-1)
	{
	System.out.print((char)ch);
	}
	}
	public static void Input()throws IOException
	{
	FileOutputStream ps=new FileOutputStream("fox.txt");
	ps.write("jgidfgiudfjgi".getBytes());
	}
}