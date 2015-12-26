/*
将一个指定目录下的文件存储到一个文本文件中

*/
import java.io.*;
import java.util.*;
class  JavaFileList
{
	public static void main(String[] args)throws IOException 
	{
		File dir=new File("d:\\代码\\Java");

		List<File> list=new ArrayList<File>();

		FiletoList(dir,list);
		File file=new File(dir,"javalist.txt");
		WritetoFile(list,file.toString());
	}
	public static void FiletoList(File dir,List<File> list)
	{
		File[] files=dir.listFiles();
		for(File file:files)
		{
			if(file.isDirectory())
				FiletoList(file,list);
			else
			{
			if(file.getName().endsWith(".java"))
				list.add(file);
			}
		}
	}
	public static void WritetoFile(List<File> list,String javaList)throws IOException
	{
		BufferedWriter bw=null;
		try
		{
			bw=new BufferedWriter(new FileWriter(javaList));
			for(File f:list)
			{
			String path=f.getAbsolutePath();
			bw.write(path);
			bw.newLine();
			bw.flush();
			}
		} 
		catch (IOException e)
		{
			throw e;
		}
		finally
		{
			try
			{
				if(bw!=null)
			bw.close();
			}
			catch (IOException e)
			{
			throw e;
			}
		
		}
	}
}
