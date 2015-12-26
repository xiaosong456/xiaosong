/*
File常见方法
1、创建：
		boolean createNewFile();在指定位置创建文件，如果该文件已经存在，则不创建，返回false
		和输出流不一样，输出流对象一建立创建文件。而且文件已经存在，会覆盖
		boolean mkdir():创建文件夹
		boolean mkdirs():创建多级文件夹


2、删除：
		boolean delete();删除失败返回false。如果文件正在被使用，则删除不了返回false
		void deleteOnExit();在程序退出时删除指定文件
3、判断：
		void exists();文件是否存在
		isFile();
		isDirectory();
		isHidden();
		isAbsolute();是否是绝对路径
4、获取信息：
		getName();
		getPath();
		getParent();
		getAbsolutePath();
		long lastModified();返回最后一次文件被修改的时间
		length();


*/
import java.io.*;
class  FileDemo
{
	public static void main(String[] args)throws IOException 
	{
		method();
	}
	public static void method()throws IOException
	{
	File f=new File("zdfhbdfhg.java");
	System.out.println("path:"+f.getPath());
	
	
	System.out.println("abspath:"+f.getAbsolutePath());

	


	System.out.println(f.createNewFile());//创建新的文件，
	
	
	System.out.println("exit:"+f.exists());//判断文件是否存在
	
	 
	 File dir=new File("abc\\gh\\sdhbjf\\hj\\bnvc\\hdj\\uyf\\op\\opoop");

		System.out.println("parent:"+dir.getParent());


	 System.out.println("mkdir:"+dir.mkdirs());//创建多级目录
	 System.out.println(f.delete());
	 System.out.println(f.canExecute());
	 //判断是否是目录或文件之前要先判断该文件封装的内容是否存在exists
	 System.out.println(dir.isDirectory());//判断是否是目录
	System.out.println(dir.isFile());//判断是否是文件




	File f1=new File("c:\\ZZZZZZZZZZZZZZ.java");
	File f2=new File("d:\\code.java");

	System.out.println(f2.renameTo(f1));
	}
}