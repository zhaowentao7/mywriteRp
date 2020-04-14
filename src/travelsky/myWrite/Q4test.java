package travelsky.myWrite;

import java.util.HashMap;
import java.util.Map;

public class Q4test {

	public static void main(String[] args) {
		count("abc");

	}
	public static void count(String str) {
		if (str != null && !"".equals(str)) {
			Map<Character, Integer> resultMap = new HashMap<>();//Map是接口，
			
			for (char c : str.toCharArray()) {
				if(resultMap.containsKey(c)){
					resultMap.put(c,resultMap.get(c)+1);//put方法建存在值覆盖。
				}else {
					resultMap.put(c,1);
				}
			}
		System.out.println(resultMap);
		}
			
	}
}
