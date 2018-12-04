package ru.sds.DynamicArray;

public class MinMaxArray {
	
	
	int arr[]= {3,1,5,8,7,12};
	
	public void ChangeMinMax() {
		
		int max = 0;
		int min = 0;
		
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i]<arr[min]) {
				min=i;
			}else if(arr[i]>arr[max]){
				max=i;
			}
		}
		
		
		int b=arr[min];
		arr[min] = arr[max];
		arr[max] = b;
	}
	
	
	public void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		MinMaxArray minMaxArray = new MinMaxArray();
		minMaxArray.ChangeMinMax();
		minMaxArray.print();
	}
}
