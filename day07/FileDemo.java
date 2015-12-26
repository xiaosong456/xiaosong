/*
File��������
1��������
		boolean createNewFile();��ָ��λ�ô����ļ���������ļ��Ѿ����ڣ��򲻴���������false
		���������һ�������������һ���������ļ��������ļ��Ѿ����ڣ��Ḳ��
		boolean mkdir():�����ļ���
		boolean mkdirs():�����༶�ļ���


2��ɾ����
		boolean delete();ɾ��ʧ�ܷ���false������ļ����ڱ�ʹ�ã���ɾ�����˷���false
		void deleteOnExit();�ڳ����˳�ʱɾ��ָ���ļ�
3���жϣ�
		void exists();�ļ��Ƿ����
		isFile();
		isDirectory();
		isHidden();
		isAbsolute();�Ƿ��Ǿ���·��
4����ȡ��Ϣ��
		getName();
		getPath();
		getParent();
		getAbsolutePath();
		long lastModified();�������һ���ļ����޸ĵ�ʱ��
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

	


	System.out.println(f.createNewFile());//�����µ��ļ���
	
	
	System.out.println("exit:"+f.exists());//�ж��ļ��Ƿ����
	
	 
	 File dir=new File("abc\\gh\\sdhbjf\\hj\\bnvc\\hdj\\uyf\\op\\opoop");

		System.out.println("parent:"+dir.getParent());


	 System.out.println("mkdir:"+dir.mkdirs());//�����༶Ŀ¼
	 System.out.println(f.delete());
	 System.out.println(f.canExecute());
	 //�ж��Ƿ���Ŀ¼���ļ�֮ǰҪ���жϸ��ļ���װ�������Ƿ����exists
	 System.out.println(dir.isDirectory());//�ж��Ƿ���Ŀ¼
	System.out.println(dir.isFile());//�ж��Ƿ����ļ�




	File f1=new File("c:\\ZZZZZZZZZZZZZZ.java");
	File f2=new File("d:\\code.java");

	System.out.println(f2.renameTo(f1));
	}
}