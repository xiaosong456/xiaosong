/*
列出指定目录下文件或文件夹，包含子目录中的内容
也就是列出指定目录下的所有内容

递归的方法
*/
import java.io.*;
class  FileDemo3
{
	public static void main(String[] args) 
	{
		File dir=new File("d:\\代码\\Java");
		showDir(dir,0);
	}
	public static void showDir(File dir,int level)
	{
		System.out.println(method(level)+dir);
		level++;
		File[] files=dir.listFiles();
		for(int x=0;x<files.length;x++)
		{
			if(files[x].isDirectory())
				showDir(files[x],level);
			else
			System.out.println(method(level)+files[x]);
		}
	}
	public static String method(int level)
	{
	StringBuilder sb=new StringBuilder();
	for(int x=0;x<level;x++)
	{
	sb.append("  ");
	}
	return sb.toString();
	}
}