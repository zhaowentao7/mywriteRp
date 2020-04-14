package travelsky.myWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ZhengZheTest {

	public static void main(String[] args) throws IOException {
		String s1 ="abc 苹果 手机";
		String[] s1_arr= s1.split(" ");
		System.out.println(Arrays.toString(s1_arr));//[abc, 苹果, 手机]
		System.out.println(s1_arr[0]);//abc
		System.out.println(s1_arr[0].matches("[0-9a-zA-Z_]+"));//true
		
		System.out.println("-----------------------------------");
		//现在"abc 苹果 手机"这个字符串不是直接定义的，是从一txt中读入。
		FileInputStream fis = new FileInputStream("D:/eclipselunaworkspace/workspace18/myWrite/src/travelsky/myWrite/textnew.txt");
		byte[] bys =new byte[1024];
		int len =fis.read(bys);
		String s2 =new String(bys,0,len);
		System.out.println(s2);//﻿abc 苹果 手机
		
		String[] s2_arr= s2.split(" ");
		System.out.println(Arrays.toString(s2_arr));//[﻿abc, 苹果, 手机]
		
		System.out.println(s2_arr[0]);//abc
		System.out.println(s2_arr[0].matches("[0-9a-zA-Z_]+"));//是true还是false？

	}

}
