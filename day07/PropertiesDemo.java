import java.io.*;
import java.util.*;
class PropertiesDemo
{
	public static void main(String[] args)throws IOException
	{
		//method();
		method_3();
	}


	public static void method()throws IOException
	{
		BufferedReader fr=new BufferedReader(new FileReader("info.txt"));
		String line=null;
		Properties prop=new Properties();
		while((line=fr.readLine())!=null)
		{
		String[] arr=line.split("=");
		prop.setProperty(arr[0],arr[1]);
		}
		fr.close();
		System.out.println(prop);
	}


	public static void method_2()throws IOException
	{
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("info.txt");
	prop.load(fis);
	System.out.println(prop);
	}


	public static void method_3()throws IOException
	{
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("info.txt");
	prop.load(fis);
	prop.setProperty("wangwu","31");
	/*
	这句话修改值，但仅在内存中修改，在原文件中不修改
	如果要在原文件中修改要用store方法
	*/
	FileOutputStream fos=new FileOutputStream("info.txt");
	prop.store(fos,"xixi");
	prop.list(System.out);
	fos.close();
	fis.close();
	}
}