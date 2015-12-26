/*
����¼��һ�����ݲ���ӡ��ʵ����readLine����

readLine�������ַ���BufferedReader���еķ���
������¼��read�������ֽ���InputStream�ķ���


1����ȷԴ��Ŀ��
	Դ����������InputStream Reader
	Ŀ�ģ��������OutputStream Writer
2�������������Ƿ��Ǵ��ı�
	�ǣ��ַ�����
	���ǣ��ֽ���
3������ϵ��ȷ������ȷ����ʹ���ĸ�����
	ͨ���豸��������
	Դ�豸���ڴ棬Ӳ�̣�����
	Ŀ���豸���ڴ棬Ӳ�̣�����̨
*/
import java.io.*;
class  TransStream
{
	public static void main(String[] args) throws IOException
	{
		WriteOut();
	}
	public static void ReadIn()throws IOException
	{
		//��ȡ����¼�����
		//InputStream in=System.in;
		//���ֽ�������ת���ַ�������ʹ��ת������InputStreamReader
		//InputStreamReader isr=new InputStreamReader(in);
		//Ϊ�����Ч�ʽ��ַ���д�뻺�������Ч�� ʹ��BufferedReader
		//BufferedReader bufr=new BufferedReader(isr);
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));

		String line=null;
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
		System.out.println(line.toUpperCase());
		}
		bufr.close();
	}
	public static void WriteOut()throws IOException
	{
	//OutputStream out=System.out;
	//OutputStreamWriter osw=new OutputStreamWriter(out);
	//BufferedWriter bufw=new BufferedWriter(osw);

	BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));


	BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(System.out));
	String line=null;
	while((line=bufr.readLine())!=null)
	{
	if("over".equals(line))
		break;
	bufw.write(line.toUpperCase());
	bufw.newLine();
	bufw.flush();
	}
	bufr.close();
	}
}