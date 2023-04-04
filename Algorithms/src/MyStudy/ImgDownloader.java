package MyStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class ImgDownloader {

	public ImgDownloader() {
		// TODO Auto-generated constructor stub
	}
	public String getStreamByIS(String Read) {
		String result="";
		try {
			URL url = new URL(Read);
			System.out.println("url="+url);
			System.out.println("Protocol="+url.getProtocol());
			System.out.println("host="+url.getHost());
			System.out.println("content="+url.getContent());
			System.out.println("Path="+url.getPath());
			System.out.println("Query="+url.getQuery());
			InputStream is= url.openStream();
			int ch;
			while((ch=is.read()) != -1) {
				result +=(char)ch;
				
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public String getHTMLbyBF(String read) {
		String result="";
		try {
			URL url = new URL(read);
			HttpURLConnection connect=(HttpURLConnection)url.openConnection();
			connect.setRequestMethod("GET");
			BufferedReader br = new BufferedReader(new InputStreamReader(connect.getInputStream()));
			String line;
			while((line=br.readLine())!=null) {
				result += line +'\n';
			}
			br.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	public void HtmlWriter(String str) {
		int result = 0;
		
		try {
			File file = new File("str.html"); //저장할 파일 객체
			BufferedWriter write = new BufferedWriter(new FileWriter(file));
			write.write(str);
			write.close();
			System.out.println(file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ImgDownloader c= new ImgDownloader();
		String str=c.getHTMLbyBF("URLPATH");
		c.HtmlWriter(str);
	}
}
