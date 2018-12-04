package ru.sds.DynamicArray;

public class IntDynamicArray implements IDynamicArray{
	
	protected int capacity = 10;
	protected int size = 0;
	protected int[] buffer;
	

	
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int[] getBuffer() {
		return buffer;
	}

	public void setBuffer(int[] buffer) {
		this.buffer = buffer;
	}

	public IntDynamicArray() {
		buffer = new int[capacity];
	}
	
	public IntDynamicArray(int capacity) {
		this.capacity = capacity;
		buffer = new int[capacity];
	}

	public void add(int element) {
		
		if(capacity == size) {
			transformArray();
		}
			
		buffer[size]=element;
		size++;
		
	}

	public void remove(int index) {
		
		int k=0;
		//capacity = capacity - 1;
		//int arrr[] = new int [capacity];
		
		for(int i = 0; i<size; i++) {
			if(i!=index) {
				buffer[k] = buffer[i];
				k++;
			}
		}
		
		//buffer=arrr;
		size--;
	}

	public int get(int index) {
		
		return buffer[index];
	}
	
	public void sortArr() {
		
	for(int j=size-1;j>=1;j--) {
		for(int i = 0; i<j;i++) {
			if(buffer[i]>buffer[i+1]) {
				
				int b=buffer[i];
				buffer[i] = buffer[i+1];
				buffer[i+1] = b;
				
			}
		}
	 }
	}
	
	public void print() {
		System.out.println("Capacity = " + capacity);
		System.out.println("Size = " + size);
		for(int i =0 ; i<size; i++) {
			System.out.println(buffer[i]);
		}
	}
	
	public void transformArray() {
		capacity = 2 * capacity;
		int arr[] = new int[capacity];
		for(int i = 0; i<buffer.length;i++) {
			arr[i]=buffer[i];
		}
		buffer=arr;
	}
	
	
	public static void main(String[] args) {
		IntDynamicArray intDynamicArray = new IntDynamicArray();
		
		/*for (int i=5; i>=1;i--) {
			intDynamicArray.add(i);
		}*/
		intDynamicArray.add(2);
		intDynamicArray.add(4);
		intDynamicArray.add(1);
		intDynamicArray.add(3);
		intDynamicArray.add(8);
		intDynamicArray.add(5);
		intDynamicArray.add(7);
		intDynamicArray.add(6);
		intDynamicArray.print();
		//intDynamicArray.get(2);
		//System.out.println(intDynamicArray.get(2));
		//intDynamicArray.remove(2);
		//intDynamicArray.print();
		intDynamicArray.sortArr();
		intDynamicArray.print();
	}

}
