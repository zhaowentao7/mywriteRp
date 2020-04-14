package travelsky.myWrite;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Q2test {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("请输入第一个数字：");
			int num = scanner.nextInt();
			System.out.print("请输入第二个数字：");
			int num2 = scanner.nextInt();
			scanner.close();
			if (num > num2){
				System.out.print("您输入较大的数字是："+num);
			}
			else {
				System.out.print("您输入较大的数字是："+num2);
			}
			
		} catch (Exception e) {
			System.out.print("您输入的非数字，请输入数字");
			main(null);
			
		}
		

	}
	
	@Test
	public void testMain() {
		main(null);
		
	}

}
