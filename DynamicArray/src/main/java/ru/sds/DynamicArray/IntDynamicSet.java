package ru.sds.DynamicArray;

public class IntDynamicSet extends IntDynamicArray  {
	
		
	@Override
	public void add(int element) {
		
		if(capacity == size) {
			transformArray();
		}
			if(!isElement(element)) {

			buffer[size]=element;
			size++;
			}else {System.out.println("This element have");}
	}
	
	public boolean isElement(int element) {
		boolean b = false;
		for(int i = 0;i<=size;i++) {
			if(element==buffer[i]) {
				b = true;
				break;
			}
		}
		return b;
	}
	
	public int factorial(int element) {
		int b=1;
		for(int i = 2; i<=element;i++) {
			b=b*i;
		}
		
		return b;
	}
	
	public int factorial2(int element) {
		
		if(element>1) 
			return element*factorial2(element-1);
		
		return 1;
	}
	
	public static void main(String[] args) {
		IntDynamicSet intDynamicSet = new IntDynamicSet();
		
		/*for (int i=5; i>=1;i--) {
			intDynamicArray.add(i);
		}*/
		intDynamicSet.add(2);
		intDynamicSet.add(4);
		intDynamicSet.add(1);
		intDynamicSet.add(2);
		intDynamicSet.add(2);
		intDynamicSet.print();
		/*intDynamicSet.get(2);
		System.out.println(intDynamicSet.get(2));
		intDynamicSet.remove(2);
		intDynamicSet.print();*/
		intDynamicSet.sortArr();
		intDynamicSet.print();
		intDynamicSet.factorial(4);
		System.out.println(intDynamicSet.factorial(4));
		System.out.println(intDynamicSet.factorial2(4));
	}
}
