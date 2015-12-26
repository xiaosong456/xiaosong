/*
windows删除原理：从里往外删  递归
*/
import java.io.*;
class RemoveDir 
{
	public static void main(String[] args) 
	{
		File dir=new File("e:\\231");
		Removedir(dir);
	}
	public static void Removedir(File dir)
	{
	File[] files=dir.listFiles();
	for(int i=0;i<files.length;i++)
	{
	if(files[i].isDirectory())
		Removedir(files[i]);
	else
		files[i].delete();
	}
	dir.delete();
	}
}