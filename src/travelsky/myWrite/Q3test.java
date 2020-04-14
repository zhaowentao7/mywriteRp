package travelsky.myWrite;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.soap.Text;

import org.junit.Test;

public class Q3test {
	
	public static void main(String[] args) throws IOException {
//		String read2 = read2("D:/eclipselunaworkspace/workspace18/myWrite/src/travelsky/myWrite/textnew.txt");
		String read2 = read3("D:/eclipselunaworkspace/workspace18/myWrite/src/travelsky/myWrite/textnew.txt");
		String [] strarr = read2.split(" ");
		
		for (int i = 0; i < strarr.length; i++) {
//			Boolean b = strarr[i].matches("[0-9a-zA-Z_]+");
			Boolean b = strarr[i].matches("\\w+");
			if (!b) {
				System.out.print(strarr[i]+" ");
			}
		}
//		这样能把所有英文字母匹配出来
//		for (int i = 0; i < strarr.length; i++) {
//			if (strarr[i].matches("[a-zA-Z]+")) {
//				System.out.print(strarr[i]+" ");
//				
//			}
			
//		}
//		这样能把所有数字匹配 出来
//		for (int i = 0; i < strarr.length; i++) {
//			if (strarr[i].matches("[0-9]+")) {
//				System.out.print(strarr[i]+" ");
//				
//			}
//		}
		
	}
//	@Test
//	public void testIo() throws IOException  {
//		BufferedReader br = new BufferedReader(new FileReader("D:/eclipselunaworkspace/workspace18/myWrite/src/travelsky/myWrite/text.txt"));
//		ArrayList<String> arr = new ArrayList<>();
//		String line = null;
//		while ((line = br.readLine())!=null){
//			arr.add(line);//这个把整行读进去了。
//		}
//		br.close();
//		
//		System.out.println(arr.size());
//		
//		for (int i = 0; i < arr.size(); i++) {
//			
//			System.out.println(i+arr.get(i));
//		
//			if (arr.get(i).matches("[a-zA-Z]+")) {
//				
//				System.out.print(arr.get(i)+" ");
//			}
//			
//		}
//		
//	}
	@Test
//	public  static String read1(String filename) throws IOException {
//		FileInputStream fis = new FileInputStream(filename);
//		int by = 0;
//		while ((by = fis.read()) != -1){
//			System.out.println((char) by);
////			return String.valueOf((char) by);
//		}
////		return "wrong";
//
//	}
	
	public static String read2(String filename) throws IOException {
		BufferedReader br =new BufferedReader(new FileReader(filename));
		
		String line = br.readLine();//因为我知道它就有一行。那就读一次就行。
//		String line = null;
//		while ((line = br.readLine()) != null) {
//			return line;
//			
//		}
		br.close();
		return line;
	}
	
	public static String read3(String filename) throws IOException {
		FileInputStream fis = new FileInputStream("D:/eclipselunaworkspace/workspace18/myWrite/src/travelsky/myWrite/textnew.txt");
		byte[] bys =new byte[1024];
		int len =fis.read(bys);
		return new String(bys,0,len);
		
	}
	

}
