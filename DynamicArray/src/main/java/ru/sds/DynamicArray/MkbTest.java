package ru.sds.DynamicArray;

import java.util.HashMap;
import java.util.Map;

public class MkbTest {

	protected int a[] = {1,2,3,4,5,6,7,8,9};
	protected int b[] = {3,6,7,2,4,8,5,9,0};
	
	public Map<Integer, String> buildMap(){
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], getValue(i, a[i]));
		}
		return map;
	}
	
	public String getValue(int index, int stopA) {
		
		String str = new String();
		boolean isProccess = true;
		//str = String.valueOf(b[index]);
		while(isProccess) {
			isProccess = false;
			for(int i = 0; i<a.length;i++) {
				if((a[i]==b[index]) && (a[i] != stopA)) {
					str = str + String.valueOf(a[i]);
					index = i;
					isProccess = true;
				}
			}
		}
		
		return str;
		
	}
	
	public static void main(String[] args) {
		MkbTest mkbTest = new MkbTest();
		Map<Integer,String> map = mkbTest.buildMap();
		System.out.println(map);
	}
}
