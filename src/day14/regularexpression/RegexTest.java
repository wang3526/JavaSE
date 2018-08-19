package day14.regularexpression;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	/**
	 * ��ҳ����
	 * 
	 * ��ȡ�����ַ
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		getMailsByWeb();
		
	}
	
	private static void getMailsByWeb() throws IOException {
		//1����ȡԴ�ļ�
		URL url=new URL("https://www.cnblogs.com/strugglion/");
		String str=url.getFile();
		String[] arr=str.split("/");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
		PrintStream ps=new PrintStream(new File("C:\\Users\\Administrator\\Desktop\\�½��ļ���", arr[arr.length-1]),"utf-8");
		String line=null;
				
		while((line=br.readLine())!=null){
			ps.println(line);
		}
	}

	public static List<String> getMails() throws IOException{
		//1����ȡԴ�ļ�
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\git����.txt"));
		//2���Զ�ȡ�����ݽ��й����ƥ�䣬���л�ȡ���Ϲ��������
		String mail_regex="\\w+@\\w+(\\.\\w+)+";
		
		List<String> list=new ArrayList<String>();
		
		Pattern p=Pattern.compile(mail_regex);
		
		String line=null;
		
		while((line=br.readLine())!=null){
			Matcher m=p.matcher(line);
			while(m.find()){
				list.add(m.group());//3�������Ϲ�������ݴ洢��������
			}
		}
		return list;
		
		
	}
}
