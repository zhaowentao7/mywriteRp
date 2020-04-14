package travelsky.myTest;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.junit.Test;

public class TestEncode {

	public static void main(String[] args) {
		try {
			byte [] b_unicode = "赵".getBytes("unicode");
			byte [] b_unicode1 = "赵文".getBytes("unicode");
			byte [] b_gbk = "赵".getBytes("gbk");
			byte [] b_gbk1 = "赵文".getBytes("gbk");
			byte [] b_utf8 = "赵".getBytes("utf-8");
			
			System.out.println(Arrays.toString(b_unicode));
			System.out.println(Arrays.toString(b_unicode1));
			System.out.println(Arrays.toString(b_gbk));
			System.out.println(Arrays.toString(b_gbk1));
			System.out.println(Arrays.toString(b_utf8));
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void testU() throws Exception {
		String s = "\u6df1";
		byte [] b_unicode = s.getBytes("unicode");
		System.out.println(Arrays.toString(b_unicode));
		
		
	}

}
