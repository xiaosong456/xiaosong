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
	��仰�޸�ֵ���������ڴ����޸ģ���ԭ�ļ��в��޸�
	���Ҫ��ԭ�ļ����޸�Ҫ��store����
	*/
	FileOutputStream fos=new FileOutputStream("info.txt");
	prop.store(fos,"xixi");
	prop.list(System.out);
	fos.close();
	fis.close();
	}
}