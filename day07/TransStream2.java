import java.io.*;
class TransStream2 
{
	public static void main(String[] args) throws IOException
	{
		System.setIn(new FileInputStream("Copy.java"));//�ı��׼��������λ�ã���dos���ڸ�Ϊ�ļ�����
		System.setOut(new PrintStream("MMMMMMMM.txt"));//��dos���ڸ�Ϊ�ļ�
		long start=System.currentTimeMillis();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String line=null;
		while((line=br.readLine())!=null)
		{
		if("over".equals(line))
			break;
		bw.write(line);
		bw.newLine();
		bw.flush();
		}
		br.close();
		bw.close();
		long end=System.currentTimeMillis();
		System.out.println("Time:"+(end-start));
	}
}
