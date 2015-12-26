import java.io.*;
class FileDemo2 
{
	public static void main(String[] args) 
	{
		method();
	}
	public static void listDemo()
	{
	File f=new File("c:\\");
	String[] names=f.list();//调用list方法的file对象必须是封装了一个对象，该目录必须存在
	for(String name:names)
	{
	System.out.println(name);
	}
	}

	public static void method()
	{
	File f=new File("D:\\代码\\Java\\day07");
	String[] arr=dir.list()
	}


	public static void listRootsDemo()
	{
	File[] files=File.listRoots();
	for(File f:files)
	{
	System.out.println(f);
	}
	}
}
