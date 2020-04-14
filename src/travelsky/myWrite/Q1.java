package travelsky.myWrite;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Q1 {

	public static void main(String[] args) {
		int [] arr1 = {2,5,4,5};
		int [] arr2 = {1,3,6,7,8};
		
		List<Integer> al = new ArrayList<>();
//		al = merge(arr1, arr2);
		ArrayList<Integer> arrayList = (ArrayList<Integer>) merge(arr1, arr2);
		for(int a:arrayList){
			System.out.println(a);
		}

	}
	
	private static List<Integer>  merge(int[] arr1,int [] arr2) {
		List<Integer> result =new ArrayList<Integer>();
		for(int a1:arr1){
			result.add(a1);
		}
		for(int a2:arr2){
			result.add(a2);
		}
		
		Collections.sort(result);
		
		
		return result;
		

	}
	
	@Test
	public void testcollection() {
//		定义一个集合
//		接口不能实例化，就是不能new对象，要找它的实现类
//		Collections c1 = new Collection();//这样是不对的，接口不能实例化
		Collection<String> c1= new ArrayList<>();//这样可以
		List<String> l1 = new ArrayList<>();//这样也可以
		ArrayList<String> a1 = new ArrayList<>();//这样也可以
//		以上三种有什么区别呢？这是不是涉及多态有什么用？
		c1.add("zhao");
		c1.add("wen");
		Object[] arr = c1.toArray();
		System.out.println(c1);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	@Test
	public void testCollection2() {
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(1);
		c1.add(2);
		System.out.println(c1);
		
	}

}
