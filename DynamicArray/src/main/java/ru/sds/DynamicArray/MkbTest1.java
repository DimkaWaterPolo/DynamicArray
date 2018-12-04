package ru.sds.DynamicArray;

import java.util.HashMap;
import java.util.Map;

public class MkbTest1 {
	
	protected int a[] = {1,2,3,4,5,6,7,8,9};
	protected int b[] = {3,6,7,2,4,8,5,9,0};
	
	public Map<Integer, String> test(){

	Map<Integer, String> map = new HashMap<Integer, String>();
	
	for(int i=0; i<a.length; i++) {
		map.put(a[i], test1(i) );
		
	}
	
	/*int j=0;
	
	for(int i=0; i<a.length; i++) {
			map.put(a[i], b[j]);
			j++;
	}*/
	
	return map;
	}
	
	public String test1(int j) {
		String str = new String();
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==b[j]) {
				str= str+a[i];
				j=i;
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		MkbTest1 mkbTest1 = new MkbTest1();
		System.out.println(mkbTest1.test());
	}
}
