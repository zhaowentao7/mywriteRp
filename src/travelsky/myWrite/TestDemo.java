package travelsky.myWrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class TestDemo {

	public static void main(String[] args) throws IOException {
		String [] strarr = {"abc","not","found"};
		System.out.println(strarr[0]);
		System.out.println(Arrays.toString(strarr));
		Boolean b = strarr[0].matches("\\w+");
//		System.out.println(strarr[0].matches("[a-zA-Z0-9_]+"));
		System.out.println(b);//true
		System.out.println("-----------------");
		
		
		BufferedReader br =new BufferedReader(new FileReader("D:/eclipselunaworkspace/workspace18/myWrite/src/travelsky/myWrite/text.txt"));
		String line = br.readLine();//因为我知道它就有一行。那就读一次就行。
		
//		System.out.println(line);
		String [] strarr1 = line.split(" ");
		System.out.println(Arrays.toString(strarr1));
		System.out.println(strarr1[0]);
//		System.out.println(strarr1[0].matches("\\w+"));//false
		
		System.out.println(strarr1[0].matches("[a-zA-Z0-9_]+"));
		System.out.println(strarr1[1]);
		System.out.println(strarr1[1].matches("[a-zA-Z0-9_]+"));
//		System.out.println("not".matches("\\w+"));
		

	}
	
	@Test
	public void iotest() throws IOException {
		FileOutputStream fo = new FileOutputStream("fo.txt");
		fo.write("hello".getBytes());
		fo.write("中文".getBytes());
		fo.close();
		
	}

}
