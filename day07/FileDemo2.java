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
	String[] names=f.list();//����list������file��������Ƿ�װ��һ�����󣬸�Ŀ¼�������
	for(String name:names)
	{
	System.out.println(name);
	}
	}

	public static void method()
	{
	File f=new File("D:\\����\\Java\\day07");
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
